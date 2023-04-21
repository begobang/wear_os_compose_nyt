package com.nttdata.presentation.ui.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import androidx.wear.compose.material.ScalingLazyListState
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import coil.annotation.ExperimentalCoilApi
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import com.google.gson.Gson
import com.nttdata.domain.archive.ArchiveInput
import com.nttdata.presentation.ui.screens.archive.Archive
import com.nttdata.presentation.ui.screens.Home
import com.nttdata.presentation.ui.screens.Splash
import com.nttdata.presentation.ui.screens.archive.archiveDetail.ArchiveDetail
import com.nttdata.presentation.ui.screens.films.Films
import com.nttdata.presentation.ui.screens.news.News
import com.nttdata.presentation.ui.screens.news.liveNews.LiveNews


@OptIn(ExperimentalPagerApi::class)
@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
fun Navigation(navController: NavHostController, scalingLazyListState: ScalingLazyListState, pagerState: PagerState){

    SwipeDismissableNavHost(
        navController = navController,
        startDestination = Screens.SPLASH.route
    ){
        splashNav(navController)
        homeNav(navController, scalingLazyListState)
        newsNav(navController, scalingLazyListState, pagerState)
        archiveNav(navController, scalingLazyListState)
        filmsNav(navController, scalingLazyListState)
    }

}

private fun NavGraphBuilder.archiveNav(navController: NavHostController, scalingLazyListState: ScalingLazyListState) {
    navigation(
        startDestination = NavCommand.ContentType(Screens.ARCHIVE).route,
        route = Screens.ARCHIVE.route
    ){
        composable(NavCommand.ContentType(Screens.ARCHIVE)){
            Archive {
                navController.navigate(
                    NavCommand.ContentTypeDetail(Screens.ARCHIVE,
                        "archiveDetail").createRoute(Gson().toJson(it))
                )
            }
        }

        composable(NavCommand.ContentTypeDetail(Screens.ARCHIVE, "archiveDetail")){
            it.arguments?.getString("itemId")?.let { args ->
                ArchiveDetail(
                    args = Gson().fromJson(args, ArchiveInput::class.java),
                    scalingState = scalingLazyListState
                )
            }
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@ExperimentalMaterialApi
@ExperimentalFoundationApi
private fun NavGraphBuilder.newsNav(navController: NavHostController, scalingLazyListState: ScalingLazyListState, pagerState: PagerState){
    navigation(
        startDestination = NavCommand.ContentType(Screens.NEWS).route,
        route = Screens.NEWS.route
    ){
        composable(NavCommand.ContentType(Screens.NEWS)) {
            News(
                scalingState = scalingLazyListState,
                onClickSection = {
                    navController.navigate(
                        NavCommand.ContentTypeDetail(Screens.NEWS,
                            "sections").createRoute(it))
                }
            )

        }

        composable(NavCommand.ContentTypeDetail(Screens.NEWS, "sections")){
            it.arguments?.getString("itemId")?.let { it1 -> LiveNews(it1, scalingLazyListState, pageIndicatorState = pagerState) }
        }

    }
}

@ExperimentalMaterialApi
@ExperimentalFoundationApi
private fun NavGraphBuilder.homeNav(navController: NavHostController, scalingLazyListState: ScalingLazyListState) {
    navigation(
        startDestination = NavCommand.ContentType(Screens.HOME).route,
        route = Screens.HOME.route
    ){
        composable(NavCommand.ContentType(Screens.HOME)){
            Home(
                state = scalingLazyListState,
                onClickLiveNews = {
                    navController.navigate(Screens.NEWS.route)
                },
                onClickArchive = {
                    navController.navigate(Screens.ARCHIVE.route)
                },
                onClickMovies = {
                    navController.navigate(Screens.FILMS.route)
                }
            )
        }
    }
}

private fun NavGraphBuilder.filmsNav(navController: NavHostController, scalingLazyListState: ScalingLazyListState){
    navigation(
        startDestination = NavCommand.ContentType(Screens.FILMS).route,
        route = Screens.FILMS.route
    ){
        composable(NavCommand.ContentType(Screens.FILMS)) {
            Films(
                scalingLazyListState = scalingLazyListState
            )
        }
    }
}

@OptIn(ExperimentalCoilApi::class)
@ExperimentalMaterialApi
@ExperimentalFoundationApi
private fun NavGraphBuilder.splashNav(navController: NavHostController) {
    navigation(
        startDestination = NavCommand.ContentType(Screens.SPLASH).route,
        route = Screens.SPLASH.route
    ){
        composable(NavCommand.ContentType(Screens.SPLASH)) {
            Splash {
                navController.navigate(Screens.HOME.route)
            }
        }
    }


}

private fun NavGraphBuilder.composable(
    navCommand: NavCommand,
    content: @Composable (NavBackStackEntry) -> Unit
){
    composable(
        route = navCommand.route,
        arguments = navCommand.args
    ){
        content(it)
    }
}

