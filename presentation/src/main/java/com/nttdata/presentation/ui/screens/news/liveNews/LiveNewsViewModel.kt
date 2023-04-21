package com.nttdata.presentation.ui.screens.news.liveNews

import com.nttdata.domain.liveNews.GetLiveNews
import com.nttdata.domain.liveNews.LiveNewsInput
import com.nttdata.domain.model.LiveNewsBusiness
import com.nttdata.presentation.IODispatcher
import com.nttdata.presentation.entities.LiveNewsViewEntity
import com.nttdata.presentation.entities.toPresentation
import com.rocket.android.core.viewmodel.BaseViewModel
import com.rocket.core.domain.error.Failure
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class LiveNewsViewModel @Inject constructor(
    private val getLiveNews: GetLiveNews,
    @IODispatcher dispatcher: CoroutineDispatcher,
) : BaseViewModel(dispatcher = dispatcher) {

    private val _state = MutableStateFlow(LiveNewsState())
    val state = _state.asStateFlow()

    fun getLiveNews(sectionId: String){
        launch {
            _state.value = LiveNewsState(loading = true)
            getLiveNews.run(params = LiveNewsInput(sectionId, 50)).fold(
                ifLeft = ::handleError,
                ifRight = ::handleSuccess
            )

        }
    }


    private fun handleError(failure: Failure){
        _state.value = LiveNewsState(loading = false, error = true)
    }

    private fun handleSuccess(results: List<LiveNewsBusiness>){
        _state.value = LiveNewsState(results = results.map { it.toPresentation() })
    }


    data class LiveNewsState(
        val loading: Boolean = false,
        val results: List<LiveNewsViewEntity> = emptyList(),
        val error: Boolean = false
    )
}