package com.nttdata.presentation.ui.screens.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a\b\u0010\t\u001a\u00020\u0001H\u0007\u001a4\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001aP\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00152\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0007\u00a8\u0006\u0018"}, d2 = {"News", "", "scalingState", "Landroidx/wear/compose/material/ScalingLazyListState;", "viewModel", "Lcom/nttdata/presentation/ui/screens/news/NewsSectionViewModel;", "onClickSection", "Lkotlin/Function1;", "", "NewsPreview", "NewsSectionItem", "item", "Lcom/nttdata/presentation/entities/SectionViewEntity;", "modifier", "Landroidx/compose/ui/Modifier;", "iconModifier", "NewsSectionScreen", "loading", "", "error", "sections", "", "onRefresh", "Lkotlin/Function0;", "presentation_debug"})
public final class NewsKt {
    
    @androidx.compose.runtime.Composable
    public static final void News(@org.jetbrains.annotations.NotNull
    androidx.wear.compose.material.ScalingLazyListState scalingState, @org.jetbrains.annotations.NotNull
    com.nttdata.presentation.ui.screens.news.NewsSectionViewModel viewModel, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClickSection) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void NewsSectionScreen(@org.jetbrains.annotations.NotNull
    androidx.wear.compose.material.ScalingLazyListState scalingState, boolean loading, boolean error, @org.jetbrains.annotations.NotNull
    java.util.List<com.nttdata.presentation.entities.SectionViewEntity> sections, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClickSection, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onRefresh) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void NewsSectionItem(@org.jetbrains.annotations.NotNull
    com.nttdata.presentation.entities.SectionViewEntity item, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier iconModifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClickSection) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(device = "id:wearos_small_round", showSystemUi = true)
    public static final void NewsPreview() {
    }
}