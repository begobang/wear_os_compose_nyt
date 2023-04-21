package com.nttdata.presentation.ui.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.LiveTv
import androidx.compose.material.icons.filled.Movie
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.AutoCenteringParams
import androidx.wear.compose.material.ScalingLazyColumn
import androidx.wear.compose.material.ScalingLazyListState
import androidx.wear.compose.material.rememberScalingLazyListState
import com.nttdata.presentation.R
import com.nttdata.presentation.ui.views.AppScaffold
import com.nttdata.presentation.ui.views.ChipView


@Composable
fun Home(
    state: ScalingLazyListState = rememberScalingLazyListState(0),
    onClickLiveNews: () -> Unit = {},
    onClickMovies: () -> Unit = {},
    onClickBooks: () -> Unit = {},
    onClickArchive: () -> Unit = {}
){
    val modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 4.dp)
    val iconModifier = Modifier
        .width(24.dp)
        .wrapContentSize(align = Alignment.Center)

    AppScaffold(state = state) {
        ScalingLazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            autoCentering = AutoCenteringParams(itemIndex = 0),
            state = state
        ){
            item {
                ChipView(modifier = modifier,
                    iconModifier = iconModifier,
                    imageVector = Icons.Default.LiveTv,
                    label = stringResource(R.string.live_news),
                    onClick = onClickLiveNews
                )
            }

            item {
                ChipView(modifier = modifier,
                    iconModifier = iconModifier,
                    imageVector = Icons.Default.Movie,
                    label = stringResource(R.string.movies),
                    onClick = onClickMovies
                )
            }

            item {
                ChipView(modifier = modifier,
                    iconModifier = iconModifier,
                    imageVector = Icons.Default.History,
                    label = stringResource(R.string.archive),
                    onClick = onClickArchive
                )
            }



            /*item {
                ChipView(modifier = modifier,
                    iconModifier = iconModifier,
                    imageVector = Icons.Default.Book,
                    label = stringResource(R.string.books),
                    onClick = onClickBooks
                )
            }*/



        }

    }
}