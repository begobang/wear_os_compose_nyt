package com.nttdata.presentation;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/nttdata/presentation/PresentationModuleDI;", "", "()V", "provideIODispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "presentation_debug"})
@dagger.Module
public final class PresentationModuleDI {
    @org.jetbrains.annotations.NotNull
    public static final com.nttdata.presentation.PresentationModuleDI INSTANCE = null;
    
    private PresentationModuleDI() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @IODispatcher
    @dagger.Provides
    public final kotlinx.coroutines.CoroutineDispatcher provideIODispatcher() {
        return null;
    }
}