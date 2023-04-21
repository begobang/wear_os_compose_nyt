package com.nttdata.presentation.ui.screens.news.liveNews;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u001a\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001aD\u0010\r\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0007\u00a8\u0006\u0015"}, d2 = {"LiveNews", "", "id", "", "scalingLazyListState", "Landroidx/wear/compose/material/ScalingLazyListState;", "viewModel", "Lcom/nttdata/presentation/ui/screens/news/liveNews/LiveNewsViewModel;", "pageIndicatorState", "Lcom/google/accompanist/pager/PagerState;", "LiveNewsItem", "item", "Lcom/nttdata/presentation/entities/LiveNewsViewEntity;", "LiveNewsScreen", "loading", "", "liveNews", "", "error", "onRefresh", "Lkotlin/Function0;", "presentation_debug"})
public final class LiveNewsKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {com.google.accompanist.pager.ExperimentalPagerApi.class})
    public static final void LiveNews(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    androidx.wear.compose.material.ScalingLazyListState scalingLazyListState, @org.jetbrains.annotations.NotNull
    com.nttdata.presentation.ui.screens.news.liveNews.LiveNewsViewModel viewModel, @org.jetbrains.annotations.NotNull
    com.google.accompanist.pager.PagerState pageIndicatorState) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {com.google.accompanist.pager.ExperimentalPagerApi.class})
    public static final void LiveNewsScreen(@org.jetbrains.annotations.NotNull
    androidx.wear.compose.material.ScalingLazyListState scalingLazyListState, @org.jetbrains.annotations.NotNull
    com.google.accompanist.pager.PagerState pageIndicatorState, boolean loading, @org.jetbrains.annotations.NotNull
    java.util.List<com.nttdata.presentation.entities.LiveNewsViewEntity> liveNews, boolean error, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onRefresh) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void LiveNewsItem(@org.jetbrains.annotations.NotNull
    com.nttdata.presentation.entities.LiveNewsViewEntity item) {
    }
}