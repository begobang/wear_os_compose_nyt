package com.nttdata.data.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/nttdata/data/response/ApiResponseItem;", "T", "", "docs", "", "meta", "Lcom/nttdata/data/response/ApiMeta;", "(Ljava/util/List;Lcom/nttdata/data/response/ApiMeta;)V", "getDocs", "()Ljava/util/List;", "setDocs", "(Ljava/util/List;)V", "getMeta", "()Lcom/nttdata/data/response/ApiMeta;", "setMeta", "(Lcom/nttdata/data/response/ApiMeta;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_debug"})
public final class ApiResponseItem<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "docs")
    private java.util.List<? extends T> docs;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "meta")
    private com.nttdata.data.response.ApiMeta meta;
    
    @org.jetbrains.annotations.NotNull()
    public final com.nttdata.data.response.ApiResponseItem<T> copy(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> docs, @org.jetbrains.annotations.NotNull()
    com.nttdata.data.response.ApiMeta meta) {
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
    
    public ApiResponseItem(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> docs, @org.jetbrains.annotations.NotNull()
    com.nttdata.data.response.ApiMeta meta) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getDocs() {
        return null;
    }
    
    public final void setDocs(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nttdata.data.response.ApiMeta component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nttdata.data.response.ApiMeta getMeta() {
        return null;
    }
    
    public final void setMeta(@org.jetbrains.annotations.NotNull()
    com.nttdata.data.response.ApiMeta p0) {
    }
}