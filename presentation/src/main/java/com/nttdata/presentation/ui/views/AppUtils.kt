package com.nttdata.presentation.ui.views

import androidx.compose.foundation.layout.*
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.wear.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.google.accompanist.pager.*


@Composable
fun AppScaffold(state: ScalingLazyListState, content: @Composable () -> Unit) {
    Scaffold(
        timeText = { if(!state.isScrollInProgress) TimeText() },
        vignette = { Vignette(vignettePosition = VignettePosition.TopAndBottom) },
        positionIndicator = { PositionIndicator(
            scalingLazyListState = state
        ) }
    ){
        content()
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun AppScaffoldPager(state: ScalingLazyListState, pagerIndicatorState: PagerState, content: @Composable () -> Unit) {
    Scaffold(
        timeText = { if(!state.isScrollInProgress) TimeText() },
        vignette = { Vignette(vignettePosition = VignettePosition.TopAndBottom) },
        positionIndicator = { PositionIndicator(
            scalingLazyListState = state
        ) },
        pageIndicator = {
            HorizontalPagerIndicator(
                pagerState = pagerIndicatorState,
                activeColor = MaterialTheme.colors.primary,
                inactiveColor = MaterialTheme.colors.background,
                spacing = 2.dp,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
    ){
        content()
    }
}

@Composable
fun ErrorState(onRefresh: () -> Unit) {
    IconButton(
        onClick = onRefresh,
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 4.dp)

    ) {
        Icon(
            imageVector = Icons.Default.Refresh,
            contentDescription = "Refresh"
        )
    }

}

@Composable
fun NYCard(
    date: String = "",
    star: Boolean = false,
    src: String = "",
    srcContentDescription: String? = null,
    cardIcon: ImageVector,
    title: String,
    header: String = "",
    starVector: ImageVector = Icons.Default.Star,
    starContentDescription: String? = null,
    body: String = "",
    byLine: String = "",
    onClick: () -> Unit,
    expand: Boolean = true,
    content: @Composable () -> Unit = {},
) {

    var hide by rememberSaveable { mutableStateOf(false) }


    val modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 4.dp)

    val iconModifier = Modifier
        .width(24.dp)
        .wrapContentSize(align = Alignment.Center)

    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(top = 30.dp)
    ) {
        content()

        if (!hide) {

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(src)
                    .crossfade(true)
                    .allowHardware(false)
                    .build(),
                contentDescription = srcContentDescription,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(bottom = 10.dp)
                    .clip(androidx.wear.compose.material.MaterialTheme.shapes.medium),
                onError = {
                    hide = true
                },
                onSuccess = {
                    hide = false
                }
            )

        }


            CardView(
                modifier = modifier,
                iconModifier = iconModifier,
                imageVector = cardIcon,
                title = title,
                message = header,
                right = {
                    if (star) {
                        Icon(
                            imageVector = starVector,
                            contentDescription = starContentDescription,
                            modifier = Modifier
                                .size(15.dp)
                        )
                    }


                },
                onClick = onClick
            ) {
                if(expand) {
                    if(body.isNotEmpty()) Text(text = body)
                    if(byLine.isNotEmpty()) Text(text = byLine, style = MaterialTheme.typography.caption1)
                    if(date.isNotEmpty()){
                        val year = date.substring(0, 4)
                        val month = date.substring(5, 7)
                        val day = date.substring(8, 10)
                        Text(text = "$day/$month/$year", style = MaterialTheme.typography.body2)
                    }


                }


            }



    }





}