package com.nttdata.presentation.ui.screens.archive.archiveDetail;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/nttdata/presentation/ui/screens/archive/archiveDetail/ArchiveDetailViewModel;", "Lcom/rocket/android/core/viewmodel/BaseViewModel;", "getArchive", "Lcom/nttdata/domain/archive/GetArchive;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/nttdata/domain/archive/GetArchive;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/nttdata/presentation/ui/screens/archive/archiveDetail/ArchiveState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "", "input", "Lcom/nttdata/domain/archive/ArchiveInput;", "handleGetArchiveError", "failure", "Lcom/rocket/core/domain/error/Failure;", "handleGetArchiveSuccess", "business", "", "Lcom/nttdata/domain/model/ArchiveBusiness;", "presentation_debug"})
public final class ArchiveDetailViewModel extends com.rocket.android.core.viewmodel.BaseViewModel {
    private final com.nttdata.domain.archive.GetArchive getArchive = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.nttdata.presentation.ui.screens.archive.archiveDetail.ArchiveState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.nttdata.presentation.ui.screens.archive.archiveDetail.ArchiveState> state = null;
    
    @javax.inject.Inject()
    public ArchiveDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.nttdata.domain.archive.GetArchive getArchive, @org.jetbrains.annotations.NotNull()
    @com.nttdata.presentation.IODispatcher()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.nttdata.presentation.ui.screens.archive.archiveDetail.ArchiveState> getState() {
        return null;
    }
    
    public final void getArchive(@org.jetbrains.annotations.NotNull()
    com.nttdata.domain.archive.ArchiveInput input) {
    }
    
    private final void handleGetArchiveError(com.rocket.core.domain.error.Failure failure) {
    }
    
    private final void handleGetArchiveSuccess(java.util.List<com.nttdata.domain.model.ArchiveBusiness> business) {
    }
}