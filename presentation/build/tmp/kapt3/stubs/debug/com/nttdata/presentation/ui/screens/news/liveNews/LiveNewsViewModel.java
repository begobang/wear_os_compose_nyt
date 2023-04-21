package com.nttdata.presentation.ui.screens.news.liveNews;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/nttdata/presentation/ui/screens/news/liveNews/LiveNewsViewModel;", "Lcom/rocket/android/core/viewmodel/BaseViewModel;", "getLiveNews", "Lcom/nttdata/domain/liveNews/GetLiveNews;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/nttdata/domain/liveNews/GetLiveNews;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/nttdata/presentation/ui/screens/news/liveNews/LiveNewsViewModel$LiveNewsState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "", "sectionId", "", "handleError", "failure", "Lcom/rocket/core/domain/error/Failure;", "handleSuccess", "results", "", "Lcom/nttdata/domain/model/LiveNewsBusiness;", "LiveNewsState", "presentation_debug"})
public final class LiveNewsViewModel extends com.rocket.android.core.viewmodel.BaseViewModel {
    private final com.nttdata.domain.liveNews.GetLiveNews getLiveNews = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.nttdata.presentation.ui.screens.news.liveNews.LiveNewsViewModel.LiveNewsState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.nttdata.presentation.ui.screens.news.liveNews.LiveNewsViewModel.LiveNewsState> state = null;
    
    @javax.inject.Inject()
    public LiveNewsViewModel(@org.jetbrains.annotations.NotNull()
    com.nttdata.domain.liveNews.GetLiveNews getLiveNews, @org.jetbrains.annotations.NotNull()
    @com.nttdata.presentation.IODispatcher()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.nttdata.presentation.ui.screens.news.liveNews.LiveNewsViewModel.LiveNewsState> getState() {
        return null;
    }
    
    public final void getLiveNews(@org.jetbrains.annotations.NotNull()
    java.lang.String sectionId) {
    }
    
    private final void handleError(com.rocket.core.domain.error.Failure failure) {
    }
    
    private final void handleSuccess(java.util.List<com.nttdata.domain.model.LiveNewsBusiness> results) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/nttdata/presentation/ui/screens/news/liveNews/LiveNewsViewModel$LiveNewsState;", "", "loading", "", "results", "", "Lcom/nttdata/presentation/entities/LiveNewsViewEntity;", "error", "(ZLjava/util/List;Z)V", "getError", "()Z", "getLoading", "getResults", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "presentation_debug"})
    public static final class LiveNewsState {
        private final boolean loading = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.nttdata.presentation.entities.LiveNewsViewEntity> results = null;
        private final boolean error = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.nttdata.presentation.ui.screens.news.liveNews.LiveNewsViewModel.LiveNewsState copy(boolean loading, @org.jetbrains.annotations.NotNull()
        java.util.List<com.nttdata.presentation.entities.LiveNewsViewEntity> results, boolean error) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public LiveNewsState() {
            super();
        }
        
        public LiveNewsState(boolean loading, @org.jetbrains.annotations.NotNull()
        java.util.List<com.nttdata.presentation.entities.LiveNewsViewEntity> results, boolean error) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean getLoading() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.nttdata.presentation.entities.LiveNewsViewEntity> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.nttdata.presentation.entities.LiveNewsViewEntity> getResults() {
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