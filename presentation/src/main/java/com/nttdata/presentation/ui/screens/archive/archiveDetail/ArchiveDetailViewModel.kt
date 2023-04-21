package com.nttdata.presentation.ui.screens.archive.archiveDetail

import com.nttdata.domain.archive.ArchiveInput
import com.nttdata.domain.archive.GetArchive
import com.nttdata.domain.model.ArchiveBusiness
import com.nttdata.presentation.IODispatcher
import com.nttdata.presentation.entities.ArchiveViewEntity
import com.nttdata.presentation.entities.toPresentation
import com.rocket.android.core.viewmodel.BaseViewModel
import com.rocket.core.domain.error.Failure
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class ArchiveDetailViewModel @Inject constructor(
    private val getArchive: GetArchive,
    @IODispatcher coroutineDispatcher: CoroutineDispatcher,
): BaseViewModel(dispatcher = coroutineDispatcher) {

    private val _state = MutableStateFlow(ArchiveState())
    val state = _state.asStateFlow()

    init {
        _state.value = ArchiveState(
            loading = true
        )
    }

    fun getArchive(input: ArchiveInput){
        launch {
            getArchive.run(params = input).fold(
                ::handleGetArchiveError, ::handleGetArchiveSuccess
            )
        }
    }

    private fun handleGetArchiveError(failure: Failure){
        _state.value = ArchiveState(
            loading = false,
            error = true
        )

    }

    private fun handleGetArchiveSuccess(business: List<ArchiveBusiness>){
        _state.value = ArchiveState(
            loading = false,
            results = business.map { it.toPresentation() },
            error = false
        )
    }

}


data class ArchiveState(
    val loading: Boolean = false,
    val results: List<ArchiveViewEntity> = emptyList(),
    val error: Boolean = false,
)
