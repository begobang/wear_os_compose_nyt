package com.nttdata.presentation.ui.screens.films;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lcom/nttdata/presentation/ui/screens/films/FilmsState;", "", "loading", "", "error", "results", "", "Lcom/nttdata/presentation/entities/FilmPickViewEntity;", "(ZZLjava/util/List;)V", "getError", "()Z", "setError", "(Z)V", "getLoading", "setLoading", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "presentation_debug"})
public final class FilmsState {
    private boolean loading;
    private boolean error;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.nttdata.presentation.entities.FilmPickViewEntity> results;
    
    @org.jetbrains.annotations.NotNull()
    public final com.nttdata.presentation.ui.screens.films.FilmsState copy(boolean loading, boolean error, @org.jetbrains.annotations.NotNull()
    java.util.List<com.nttdata.presentation.entities.FilmPickViewEntity> results) {
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
    
    public FilmsState() {
        super();
    }
    
    public FilmsState(boolean loading, boolean error, @org.jetbrains.annotations.NotNull()
    java.util.List<com.nttdata.presentation.entities.FilmPickViewEntity> results) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getError() {
        return false;
    }
    
    public final void setError(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.nttdata.presentation.entities.FilmPickViewEntity> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.nttdata.presentation.entities.FilmPickViewEntity> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.NotNull()
    java.util.List<com.nttdata.presentation.entities.FilmPickViewEntity> p0) {
    }
}