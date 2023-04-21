package com.nttdata.presentation.ui.screens.films


import com.nttdata.domain.films.GetFilmPicks
import com.nttdata.domain.model.FilmPickBusiness
import com.nttdata.presentation.IODispatcher
import com.nttdata.presentation.entities.FilmPickViewEntity
import com.nttdata.presentation.entities.toPresentation
import com.rocket.android.core.viewmodel.BaseViewModel
import com.rocket.core.domain.error.Failure
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class FilmsViewModel @Inject constructor(
    private val getFilmPicks: GetFilmPicks,
    @IODispatcher coroutineDispatcher: CoroutineDispatcher
): BaseViewModel(dispatcher = coroutineDispatcher) {

    private val _state = MutableStateFlow(FilmsState())
    val state = _state.asStateFlow()

    init {
        getFilmPicks()
    }

    fun getFilmPicks(){
        launch {
            _state.value = FilmsState(loading = true)
            getFilmPicks.run().fold(
                ::handleFilmPicksError, ::handleFilmPicksSuccess
            )
        }
    }

    private fun handleFilmPicksError(failure: Failure){
        _state.value = FilmsState(error = true)
    }

    private fun handleFilmPicksSuccess(business: List<FilmPickBusiness>){
        _state.value = FilmsState(results = business.map { it.toPresentation() })
    }

    fun addToWishlist(display_title: String){
        val list = _state.value.results
        list.first { display_title == it.display_title }.added = true
        _state.value = FilmsState(results = list)

    }

    fun removeWishlist(display_title: String){
        val list = _state.value.results
        list.first { display_title == it.display_title }.added = false
        _state.value = FilmsState(results = list)

    }
}

data class FilmsState(
    var loading: Boolean = false,
    var error: Boolean = false,
    var results: List<FilmPickViewEntity> = emptyList()
)