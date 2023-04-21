package com.nttdata.presentation.ui.screens.films

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Movie
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.wear.compose.material.*
import androidx.wear.compose.material.dialog.Alert
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.nttdata.presentation.entities.FilmPickViewEntity
import com.nttdata.presentation.ui.views.AppScaffold
import com.nttdata.presentation.ui.views.CardView
import com.nttdata.presentation.ui.views.ErrorState
import com.nttdata.presentation.ui.views.NYCard

@Composable
fun Films(scalingLazyListState: ScalingLazyListState, viewModel: FilmsViewModel = hiltViewModel()) {

    val state by viewModel.state.collectAsState()

    var showAlert by rememberSaveable { mutableStateOf(false) }
    var title by rememberSaveable{ mutableStateOf("") }

    if(!showAlert){
        FilmsScreen(
            loading = state.loading,
            error = state.error,
            films = state.results,
            scalingLazyListState = scalingLazyListState,
            onClick = { displayTitle ->
                showAlert = true
                title = displayTitle
                //viewModel.addToWishlist(title)
            }
        ){
            viewModel.getFilmPicks()
        }
    } else {
        Alert(
            icon = {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "check alert",
                    modifier = Modifier.size(24.dp).wrapContentSize(align = Alignment.Center),
                )
            },
            title = { Text(title, textAlign = TextAlign.Center) },
            negativeButton = { Button(
                colors = ButtonDefaults.secondaryButtonColors(),
                onClick = {
                    showAlert = false
                    viewModel.removeWishlist(title)
                }) {
                Text("Remove")
            } },
            positiveButton = { Button(onClick = {
                showAlert = false
                viewModel.addToWishlist(title)
            }) { Text("Add") } },
            contentPadding =
            PaddingValues(start = 10.dp, end = 10.dp, top = 24.dp, bottom = 32.dp),
        ) {
            Text(
                text = "Do you want to added or removed to your wishlist?",
                textAlign = TextAlign.Center
            )
        }
    }





}

@Composable
fun FilmsScreen(
    loading: Boolean,
    error: Boolean,
    films: List<FilmPickViewEntity>,
    scalingLazyListState: ScalingLazyListState,
    onClick: (String) -> Unit,
    onRefresh: () -> Unit,
) {
    AppScaffold(
        state = scalingLazyListState
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
            autoCentering = AutoCenteringParams(itemIndex = 0),
            state = scalingLazyListState,
            userScrollEnabled = true
        ) {

            if (error) {
                item { ErrorState(onRefresh) }
            }

            if(films.isNotEmpty()){
                items(items = films) {
                    FilmItem(it, onClick)
                }
            }



        }


    }

}

@Composable
fun FilmItem(film: FilmPickViewEntity, onClick: (String) -> Unit){
    var expand by rememberSaveable { mutableStateOf(false) }

    NYCard(
        date = film.publication_date ?: "",
        star = film.added,
        starVector = Icons.Default.Check,
        starContentDescription = "Added",
        src = film.multimedia?.src ?: "",
        srcContentDescription = film.link?.suggested_link_text,
        cardIcon = Icons.Default.Movie,
        title = film.display_title ?: "",
        header = film.headline ?: "",
        body = film.summary_short ?: "",
        byLine = "By: ${film.byline}",
        onClick = {
            expand = !expand
        },
        expand = expand
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            OutlinedCompactChip(
                onClick = {
                    film.display_title?.let { onClick(it) }
                },
                label = { Text("Wishlist") },
                icon = { Icon(imageVector = Icons.Default.Check, contentDescription = "Add") },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
        }

    }
}

@Composable
fun FilmPickItem(film: FilmPickViewEntity, onClick: (String) -> Unit) {
    var expanded by rememberSaveable { mutableStateOf(false) }

    var hide by rememberSaveable { mutableStateOf(false) }

    val modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 4.dp)

    val iconModifier = Modifier
        .width(24.dp)
        .wrapContentSize(align = Alignment.Center)

    val year = film.publication_date?.substring(0, 4)
    val month = film.publication_date?.substring(5, 7)
    val day = film.publication_date?.substring(8, 10)

    var added by rememberSaveable { mutableStateOf(film.added) }

    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(bottom = 10.dp, top = 20.dp)
    ){

        CompactChip(
            onClick = {
                /*film.added = !film.added
                added = !added*/
                film.display_title?.let { onClick(it) }
            },
            label = { Text("Wishlist") },
            icon = { Icon(imageVector = Icons.Default.Check, contentDescription = "Add") },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )

        if (film.multimedia != null && !hide) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(film.multimedia.src)
                    .crossfade(true)
                    .allowHardware(false)
                    .build(),
                contentDescription = film.link?.suggested_link_text,
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

        CardView(
            modifier = modifier,
            iconModifier = iconModifier,
            imageVector = Icons.Default.Movie,
            title = "${film.display_title}",
            message = "${film.headline}",
            onClick = {
                expanded = !expanded
            },
            right = {
                if (added) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = "Added",
                        modifier = Modifier
                            .size(25.dp)
                    )
                }


            }
        ) {
            if (expanded) {
                film.summary_short?.let { it1 -> Text(text = it1) }
                film.byline?.let { it1 ->
                    Text(text = "Written by: $it1",
                        style = MaterialTheme.typography.caption1)
                }
                Text(text = "$day/$month/$year", style = MaterialTheme.typography.body2)
            }

        }


    }
}