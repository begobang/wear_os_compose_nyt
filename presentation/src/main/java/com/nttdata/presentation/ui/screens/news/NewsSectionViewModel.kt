package com.nttdata.presentation.ui.screens.news

import com.nttdata.domain.model.SectionBusiness
import com.nttdata.domain.sections.GetSections
import com.nttdata.presentation.IODispatcher
import com.nttdata.presentation.entities.SectionViewEntity
import com.nttdata.presentation.entities.toPresentation
import com.rocket.android.core.viewmodel.BaseViewModel
import com.rocket.core.domain.error.Failure
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class NewsSectionViewModel @Inject constructor(
    private val getSections: GetSections,
    @IODispatcher dispatcher: CoroutineDispatcher,
) : BaseViewModel(dispatcher = dispatcher) {

    private val _state = MutableStateFlow(SectionsState())
    val state = _state.asStateFlow()

    init {
        getSections()
    }

    fun getSections(){
        launch {
            _state.value = SectionsState(loading = true)
            getSections.run(21).fold(
                ifLeft = ::handleError,
                ifRight = ::handleSuccess
            )
        }
    }

    private fun handleError(failure: Failure){
        _state.value = SectionsState(loading = false, error = true)
    }

    private fun handleSuccess(results: List<SectionBusiness>){
        _state.value = SectionsState(results = results.map { it.toPresentation() })
    }

    data class SectionsState(
        val loading: Boolean = false,
        val results: List<SectionViewEntity> = emptyList(),
        val error: Boolean = false
    )

}