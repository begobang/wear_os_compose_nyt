package com.nttdata.presentation.ui.screens.news.liveNews

import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LiveTv
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarOutline
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.wear.compose.material.*
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.nttdata.presentation.entities.LiveNewsViewEntity
import com.nttdata.presentation.ui.views.AppScaffold
import com.nttdata.presentation.ui.views.CardView
import com.nttdata.presentation.ui.views.ErrorState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun LiveNews(
    id: String,
    scalingLazyListState: ScalingLazyListState,
    viewModel: LiveNewsViewModel = hiltViewModel(),
    pageIndicatorState: PagerState,
) {
    val state by viewModel.state.collectAsState()

    viewModel.getLiveNews(id)

    LiveNewsScreen(
        scalingLazyListState = scalingLazyListState,
        loading = state.loading,
        liveNews = state.results,
        error = state.error,
        onRefresh = {
            viewModel.getLiveNews(id)
        },
        pageIndicatorState = pageIndicatorState
    )


}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun LiveNewsScreen(
    scalingLazyListState: ScalingLazyListState,
    pageIndicatorState: PagerState,
    loading: Boolean,
    liveNews: List<LiveNewsViewEntity>,
    error: Boolean,
    onRefresh: () -> Unit,
) {
    AppScaffold(
        state = scalingLazyListState
    ) {
        if (loading || pageIndicatorState.isScrollInProgress)
            CircularProgressIndicator(
                modifier = Modifier.fillMaxSize()
            )

        if (!loading && !error) {
            HorizontalPager(
                count = liveNews.size,
                state = pageIndicatorState
            ) {
                if (!pageIndicatorState.isScrollInProgress)
                    LiveNewsItem(item = liveNews[this.currentPage])
            }


        }

        if (error) {
            ScalingLazyColumn {
                 item { ErrorState(onRefresh) }
            }

        }

    }

}

@Composable
fun LiveNewsItem(item: LiveNewsViewEntity) {

    var expanded by rememberSaveable { mutableStateOf(false) }

    val modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 4.dp)

    val iconModifier = Modifier
        .width(24.dp)
        .wrapContentSize(align = Alignment.Center)

    val year = item.published_date.substring(0, 4)
    val month = item.published_date.substring(5, 7)
    val day = item.published_date.substring(8, 10)

    var like by rememberSaveable { mutableStateOf(item.liked) }
    var hide by rememberSaveable { mutableStateOf(false) }

    ScalingLazyColumn(
        state = rememberScalingLazyListState(0),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 30.dp),
        anchorType = ScalingLazyListAnchorType.ItemStart
    ) {
        if (!hide){
            item {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(item.multimedia?.get(2)?.url)
                        .crossfade(true)
                        .allowHardware(false)
                        .build(),
                    contentDescription = item.multimedia?.get(2)?.caption,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .padding(bottom = 10.dp)
                        .clip(MaterialTheme.shapes.medium),
                    onError = {
                        hide = true
                    },
                    onSuccess = {
                        hide = false
                    }

                )

            }
        }




        item {
            ToggleChip(
                modifier = Modifier.fillMaxWidth(),
                checked = like,
                label = { Text(text = "I like it!") },
                onCheckedChange = {
                    like = it
                    item.liked = it
                },
                toggleControl = {
                    Icon(
                        imageVector = if (!like) Icons.Default.StarOutline else Icons.Default.Star,
                        contentDescription = if (like) "On" else "Off"
                    )
                }

            )
        }

        item {
            CardView(
                modifier = modifier,
                iconModifier = iconModifier,
                imageVector = Icons.Default.LiveTv,
                title = item.subsection.ifEmpty { item.material_type_facet },
                message = item.title,
                onClick = {
                    expanded = !expanded
                },
                right = {
                    if(like){
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Liked",
                            modifier = Modifier
                                .size(20.dp)
                        )
                    }


                }
            ) {
                if (expanded) {
                    Text(text = item.abstract)
                    Text(text = item.byline, style = MaterialTheme.typography.caption1)
                    Text(text = "$day/$month/$year", style = MaterialTheme.typography.body2)
                }

            }
        }


    }


}