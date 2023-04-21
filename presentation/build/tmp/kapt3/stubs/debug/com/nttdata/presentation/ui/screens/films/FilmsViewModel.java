package com.nttdata.presentation.ui.screens.films;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0002\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0016\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lcom/nttdata/presentation/ui/screens/films/FilmsViewModel;", "Lcom/rocket/android/core/viewmodel/BaseViewModel;", "getFilmPicks", "Lcom/nttdata/domain/films/GetFilmPicks;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/nttdata/domain/films/GetFilmPicks;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/nttdata/presentation/ui/screens/films/FilmsState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "addToWishlist", "", "display_title", "", "handleFilmPicksError", "failure", "Lcom/rocket/core/domain/error/Failure;", "handleFilmPicksSuccess", "business", "", "Lcom/nttdata/domain/model/FilmPickBusiness;", "removeWishlist", "presentation_debug"})
public final class FilmsViewModel extends com.rocket.android.core.viewmodel.BaseViewModel {
    private final com.nttdata.domain.films.GetFilmPicks getFilmPicks = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.nttdata.presentation.ui.screens.films.FilmsState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.nttdata.presentation.ui.screens.films.FilmsState> state = null;
    
    @javax.inject.Inject()
    public FilmsViewModel(@org.jetbrains.annotations.NotNull()
    com.nttdata.domain.films.GetFilmPicks getFilmPicks, @org.jetbrains.annotations.NotNull()
    @com.nttdata.presentation.IODispatcher()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.nttdata.presentation.ui.screens.films.FilmsState> getState() {
        return null;
    }
    
    public final void getFilmPicks() {
    }
    
    private final void handleFilmPicksError(com.rocket.core.domain.error.Failure failure) {
    }
    
    private final void handleFilmPicksSuccess(java.util.List<com.nttdata.domain.model.FilmPickBusiness> business) {
    }
    
    public final void addToWishlist(@org.jetbrains.annotations.NotNull()
    java.lang.String display_title) {
    }
    
    public final void removeWishlist(@org.jetbrains.annotations.NotNull()
    java.lang.String display_title) {
    }
}