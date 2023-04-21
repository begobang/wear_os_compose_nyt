package com.nttdata.presentation.ui.screens.news

import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Newspaper
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.rounded.LiveTv
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.wear.compose.material.*
import com.nttdata.presentation.R
import com.nttdata.presentation.entities.SectionViewEntity
import com.nttdata.presentation.ui.screens.Home
import com.nttdata.presentation.ui.views.AppScaffold
import com.nttdata.presentation.ui.views.CardView
import com.nttdata.presentation.ui.views.ChipView


@Composable
fun News(
    scalingState: ScalingLazyListState,
    viewModel: NewsSectionViewModel = hiltViewModel(),
    onClickSection: (String) -> Unit,
) {
    val state by viewModel.state.collectAsState()

    NewsSectionScreen(
        scalingState = scalingState,
        loading = state.loading,
        error = state.error,
        sections = state.results,
        onClickSection = onClickSection,
        onRefresh = {
            viewModel.getSections()
        }
    )
}

@Composable
fun NewsSectionScreen(
    scalingState: ScalingLazyListState,
    loading: Boolean,
    error: Boolean,
    sections: List<SectionViewEntity>,
    onClickSection: (String) -> Unit,
    onRefresh: () -> Unit
) {

    val modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 4.dp)

    val iconModifier = Modifier
        .width(24.dp)
        .wrapContentSize(align = Alignment.Center)

    AppScaffold(
        state = scalingState
    ) {
        if (loading) {
            CircularProgressIndicator(
                modifier = Modifier.fillMaxSize()
            )
        }


        ScalingLazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            autoCentering = AutoCenteringParams(itemIndex = 1),
            state = scalingState,
            userScrollEnabled = true
        ) {
            item {
                Text(
                    text = stringResource(R.string.sections),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp, bottom = 10.dp),
                    style = MaterialTheme.typography.display1,
                    color = MaterialTheme.colors.primary,
                    maxLines = 2,
                    textAlign = TextAlign.Center

                )
            }

            if (!loading && !error) {

                item {
                    Button(
                        onClick = {
                            onClickSection("all")
                        },
                        modifier = Modifier
                            .padding(bottom = 16.dp)
                            .size(ButtonDefaults.LargeButtonSize)
                    ){
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.LiveTv,
                                contentDescription = "triggers all sections",
                                modifier = iconModifier
                                    .padding(start = 6.dp)
                            )
                            Text(
                                text = "All",
                                modifier = Modifier.padding(horizontal = 6.dp)
                            )
                        }


                    }
                }

                items(sections) {
                    NewsSectionItem(
                        item = it,
                        modifier = modifier,
                        iconModifier = iconModifier,
                        onClickSection = { section -> onClickSection(section) })
                }
            }

            if(error) {
                item {
                    IconButton(
                        onClick = onRefresh,
                        modifier = modifier

                    ){
                        Icon(
                            imageVector = Icons.Default.Refresh,
                            contentDescription = "Refresh"
                        )
                    }
                }

            }


        }
    }
}

@Composable
fun NewsSectionItem(
    item: SectionViewEntity,
    modifier: Modifier,
    iconModifier: Modifier,
    onClickSection: (String) -> Unit,
) {

    AppCard(
        modifier = modifier,
        appImage = {
            Icon(
                    imageVector = Icons.Default.Newspaper,
                    contentDescription = "Triggers ${item.displayName}",
                    modifier = iconModifier,
                )

        },
        appName = { Text(text = item.displayName) },
        contentColor = MaterialTheme.colors.onSurfaceVariant,
        title = {  },
        onClick = {
            onClickSection(item.id)
        },
        content = {},
        time = {}
    )

}

@Preview(device = Devices.WEAR_OS_SMALL_ROUND, showSystemUi = true)
@Composable
fun NewsPreview() {
    Home { }
}