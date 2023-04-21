package com.nttdata.presentation.ui.navigation

import androidx.annotation.StringRes
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.nttdata.presentation.R

enum class NavigationItem(
    val navCommand: NavCommand,
    @StringRes val title: Int
){
    SPLASH(NavCommand.ContentType(Screens.SPLASH), R.string.log_in),
    HOME(NavCommand.ContentType(Screens.HOME), R.string.app_name),
    NEWS(NavCommand.ContentType(Screens.NEWS), R.string.live_news),
    ARCHIVE(NavCommand.ContentType(Screens.ARCHIVE), R.string.archive),
    FILMS(NavCommand.ContentType(Screens.FILMS), R.string.movies),
   // BOOKS(NavCommand.ContentType(Screens.BOOKS), R.string.books)
}

sealed class NavCommand(
    internal val screens: Screens,
    internal val subRoute: String = Screens.SPLASH.route,
    private val navArgs: List<NavArgs> = emptyList()
) {
    class ContentType(screens: Screens): NavCommand(screens = screens)

    class ContentTypeDetail(screens: Screens, subRoute: String): NavCommand(screens = screens, subRoute = subRoute, listOf(NavArgs.ItemId)){
        fun createRoute(itemId: String) = "${screens.route}/$subRoute/$itemId"
    }

    val route = run {
        val argValues = navArgs.map { "{${it.key}}" }
        listOf(screens.route)
            .plus(subRoute)
            .plus(argValues)
            .joinToString("/")
    }

    val args = navArgs.map {
        navArgument(it.key) { type = it.value }
    }
}

enum class NavArgs(val key: String, val value: NavType<*>){
    ItemId("itemId", NavType.StringType)
}