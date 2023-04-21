package com.nttdata.presentation.ui.screens.news;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0002\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/nttdata/presentation/ui/screens/news/NewsSectionViewModel;", "Lcom/rocket/android/core/viewmodel/BaseViewModel;", "getSections", "Lcom/nttdata/domain/sections/GetSections;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/nttdata/domain/sections/GetSections;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/nttdata/presentation/ui/screens/news/NewsSectionViewModel$SectionsState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "", "handleError", "failure", "Lcom/rocket/core/domain/error/Failure;", "handleSuccess", "results", "", "Lcom/nttdata/domain/model/SectionBusiness;", "SectionsState", "presentation_debug"})
public final class NewsSectionViewModel extends com.rocket.android.core.viewmodel.BaseViewModel {
    private final com.nttdata.domain.sections.GetSections getSections = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.nttdata.presentation.ui.screens.news.NewsSectionViewModel.SectionsState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.nttdata.presentation.ui.screens.news.NewsSectionViewModel.SectionsState> state = null;
    
    @javax.inject.Inject
    public NewsSectionViewModel(@org.jetbrains.annotations.NotNull
    com.nttdata.domain.sections.GetSections getSections, @org.jetbrains.annotations.NotNull
    @com.nttdata.presentation.IODispatcher
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.nttdata.presentation.ui.screens.news.NewsSectionViewModel.SectionsState> getState() {
        return null;
    }
    
    public final void getSections() {
    }
    
    private final void handleError(com.rocket.core.domain.error.Failure failure) {
    }
    
    private final void handleSuccess(java.util.List<com.nttdata.domain.model.SectionBusiness> results) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/nttdata/presentation/ui/screens/news/NewsSectionViewModel$SectionsState;", "", "loading", "", "results", "", "Lcom/nttdata/presentation/entities/SectionViewEntity;", "error", "(ZLjava/util/List;Z)V", "getError", "()Z", "getLoading", "getResults", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "presentation_debug"})
    public static final class SectionsState {
        private final boolean loading = false;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.nttdata.presentation.entities.SectionViewEntity> results = null;
        private final boolean error = false;
        
        @org.jetbrains.annotations.NotNull
        public final com.nttdata.presentation.ui.screens.news.NewsSectionViewModel.SectionsState copy(boolean loading, @org.jetbrains.annotations.NotNull
        java.util.List<com.nttdata.presentation.entities.SectionViewEntity> results, boolean error) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public SectionsState() {
            super();
        }
        
        public SectionsState(boolean loading, @org.jetbrains.annotations.NotNull
        java.util.List<com.nttdata.presentation.entities.SectionViewEntity> results, boolean error) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean getLoading() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.nttdata.presentation.entities.SectionViewEntity> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.nttdata.presentation.entities.SectionViewEntity> getResults() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getError() {
            return false;
        }
    }
}