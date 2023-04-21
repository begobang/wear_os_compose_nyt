package com.nttdata.presentation.ui.views

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.wear.compose.material.AppCard
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import coil.request.ImageRequest
import com.google.accompanist.coil.rememberCoilPainter

@Composable
fun CardViewImage(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier,
    imageVector: ImageVector? = null,
    title: String = "",
    color: Color = MaterialTheme.colors.onSurfaceVariant,
    message: String = "",
    right: @Composable () -> Unit = {},
    onClick: () -> Unit,
    url: String? = null,
    content: @Composable () -> Unit = {},

    ) {

    AppCard(
        modifier = modifier,
        appImage = {
            if (imageVector != null)
                Icon(
                    imageVector = imageVector,
                    contentDescription = "Triggers $title",
                    modifier = iconModifier,
                )

        },
        appName = { Text(text = title) },
        contentColor = color,
        time = { right() },
        title = { if (message.isNotEmpty()) Text(text = message) },
        onClick = onClick,
        backgroundPainter = rememberCoilPainter(
            request = ImageRequest.Builder(LocalContext.current)
                .data(url)
                .crossfade(true)
                .build()
        ),

        ) {
        content()
    }
}

@Composable
fun CardView(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier,
    imageVector: ImageVector? = null,
    title: String = "",
    color: Color = MaterialTheme.colors.onSurfaceVariant,
    message: String = "",
    right: @Composable () -> Unit = {},
    onClick: () -> Unit = {},
    content: @Composable () -> Unit = {},

    ) {

    AppCard(
        modifier = modifier,
        appImage = {
            if (imageVector != null)
                Icon(
                    imageVector = imageVector,
                    contentDescription = "Triggers $title",
                    modifier = iconModifier,
                )

        },
        appName = { Text(text = title, modifier = Modifier.fillMaxWidth(0.8f), maxLines = 3, overflow = TextOverflow.Ellipsis) },
        contentColor = color,
        time = { right() },
        title = { if (message.isNotEmpty()) Text(text = message) },
        onClick = onClick) {
        content()
    }
}


