package com.nttdata.presentation.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.wear.compose.material.MaterialTheme
import com.nttdata.presentation.ui.theme.darkWearColorPalette
import com.nttdata.presentation.ui.theme.lightWearColorPalette


@Composable
fun NYTimesAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if(darkTheme)
        darkWearColorPalette
    else
        lightWearColorPalette

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}