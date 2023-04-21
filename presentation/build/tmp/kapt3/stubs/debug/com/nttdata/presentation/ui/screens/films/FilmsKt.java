package com.nttdata.presentation.ui.screens.films;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a$\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\u001a\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u001aP\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0007\u00a8\u0006\u0015"}, d2 = {"FilmItem", "", "film", "Lcom/nttdata/presentation/entities/FilmPickViewEntity;", "onClick", "Lkotlin/Function1;", "", "FilmPickItem", "Films", "scalingLazyListState", "Landroidx/wear/compose/material/ScalingLazyListState;", "viewModel", "Lcom/nttdata/presentation/ui/screens/films/FilmsViewModel;", "FilmsScreen", "loading", "", "error", "films", "", "onRefresh", "Lkotlin/Function0;", "presentation_debug"})
public final class FilmsKt {
    
    @androidx.compose.runtime.Composable()
    public static final void Films(@org.jetbrains.annotations.NotNull()
    androidx.wear.compose.material.ScalingLazyListState scalingLazyListState, @org.jetbrains.annotations.NotNull()
    com.nttdata.presentation.ui.screens.films.FilmsViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void FilmsScreen(boolean loading, boolean error, @org.jetbrains.annotations.NotNull()
    java.util.List<com.nttdata.presentation.entities.FilmPickViewEntity> films, @org.jetbrains.annotations.NotNull()
    androidx.wear.compose.material.ScalingLazyListState scalingLazyListState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onRefresh) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void FilmItem(@org.jetbrains.annotations.NotNull()
    com.nttdata.presentation.entities.FilmPickViewEntity film, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void FilmPickItem(@org.jetbrains.annotations.NotNull()
    com.nttdata.presentation.entities.FilmPickViewEntity film, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClick) {
    }
}