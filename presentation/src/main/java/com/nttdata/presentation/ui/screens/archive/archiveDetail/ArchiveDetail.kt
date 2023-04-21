package com.nttdata.presentation.ui.screens.archive.archiveDetail

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LiveTv
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.rounded.ThumbUp
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
import com.nttdata.domain.archive.ArchiveInput
import com.nttdata.presentation.entities.ArchiveViewEntity
import com.nttdata.presentation.ui.views.AppScaffold
import com.nttdata.presentation.ui.views.CardView
import com.nttdata.presentation.ui.views.ErrorState
import com.nttdata.presentation.ui.views.NYCard

@Composable
fun ArchiveDetail(
    args: ArchiveInput,
    scalingState: ScalingLazyListState,
    viewModel: ArchiveDetailViewModel = hiltViewModel(),
) {
    val state by viewModel.state.collectAsState()

    viewModel.getArchive(input = args)

    ArchiveDetailScreen(
        state = scalingState,
        loading = state.loading,
        error = state.error,
        archive = state.results
    ) {
        viewModel.getArchive(input = args)
    }


}

@Composable
fun ArchiveDetailScreen(
    state: ScalingLazyListState,
    loading: Boolean,
    error: Boolean,
    archive: List<ArchiveViewEntity>,
    onRefresh: () -> Unit,
) {
    AppScaffold(
        state = state
    ) {
        if (loading) {
            CircularProgressIndicator(
                modifier = Modifier.fillMaxSize(),
                indicatorColor = MaterialTheme.colors.primary
            )
        }

        ScalingLazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            autoCentering = AutoCenteringParams(itemIndex = 0),
            state = state,
            userScrollEnabled = true
        ) {

            if (error) {
                item { ErrorState(onRefresh) }
            }

            items(items = archive) {
                ArchiveItem2(it)
            }

        }


    }
}

@Composable
fun ArchiveItem2(archive: ArchiveViewEntity) {
    var added by rememberSaveable { mutableStateOf(archive.added) }

    archive.pub_date?.let { date ->
        archive.multimedia?.first { it.type == "image" }.let { multimedia ->
            NYCard(
                date = date,
                star = added,
                src = multimedia?.url ?: "",
                srcContentDescription = multimedia?.crop_name,
                cardIcon = Icons.Default.LiveTv,
                title = archive.section_name ?: "",
                header = archive.headline?.print_headline ?: "",
                starVector = Icons.Default.ThumbUp,
                starContentDescription = "Added",
                body = archive.lead_paragraph ?: "",
                byLine = archive.byline?.original ?: "",
                onClick = {
                    archive.added = !archive.added
                    added = archive.added
                }
            )
        }
    }

}

@Composable
fun ArchiveItem(archive: ArchiveViewEntity) {

    var hide by rememberSaveable { mutableStateOf(false) }

    val modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 4.dp)

    val iconModifier = Modifier
        .width(24.dp)
        .wrapContentSize(align = Alignment.Center)

    val year = archive.pub_date?.substring(0, 4)
    val month = archive.pub_date?.substring(5, 7)
    val day = archive.pub_date?.substring(8, 10)

    var added by rememberSaveable { mutableStateOf(archive.added) }

    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(bottom = 10.dp, top = 30.dp)
    ) {

        if (archive.multimedia?.isNotEmpty() == true && !hide) {

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(archive.multimedia!!.first { it.type == "image" }.url)
                    .crossfade(true)
                    .allowHardware(false)
                    .build(),
                contentDescription = archive.multimedia!!.first { it.type == "image" }.crop_name,
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



        archive.headline?.print_headline?.let {
            CardView(
                modifier = modifier,
                iconModifier = iconModifier,
                imageVector = Icons.Default.LiveTv,
                title = "${archive.section_name}",
                message = it,
                right = {
                    if (added) {
                        Icon(
                            imageVector = Icons.Default.ThumbUp,
                            contentDescription = "Added",
                            modifier = Modifier
                                .size(15.dp)
                        )
                    }


                }
            ) {
                archive.lead_paragraph?.let { it1 -> Text(text = it1) }
                archive.byline?.original?.let { it1 ->
                    Text(text = it1,
                        style = MaterialTheme.typography.caption1)
                }
                Text(text = "$day/$month/$year", style = MaterialTheme.typography.body2)


            }
        }

        Button(
            modifier = Modifier
                .padding(bottom = 16.dp)
                .size(ButtonDefaults.LargeButtonSize)
                .align(Alignment.CenterHorizontally),
            onClick = {
                added = !added
                archive.added = added
            }
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Rounded.ThumbUp,
                    contentDescription = "triggers all sections",
                    modifier = iconModifier
                        .padding(start = 6.dp)
                )
            }


        }

    }
}