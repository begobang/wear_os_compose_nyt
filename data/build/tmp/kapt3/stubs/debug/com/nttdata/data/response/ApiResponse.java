package com.nttdata.data.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u00c6\u0003J)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0004H\u00d6\u0001R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/nttdata/data/response/ApiResponse;", "T", "", "copyright", "", "response", "Lcom/nttdata/data/response/ApiResponseItem;", "(Ljava/lang/String;Lcom/nttdata/data/response/ApiResponseItem;)V", "getCopyright", "()Ljava/lang/String;", "setCopyright", "(Ljava/lang/String;)V", "getResponse", "()Lcom/nttdata/data/response/ApiResponseItem;", "setResponse", "(Lcom/nttdata/data/response/ApiResponseItem;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_debug"})
public final class ApiResponse<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "copyright")
    private java.lang.String copyright;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "response")
    private com.nttdata.data.response.ApiResponseItem<T> response;
    
    @org.jetbrains.annotations.NotNull()
    public final com.nttdata.data.response.ApiResponse<T> copy(@org.jetbrains.annotations.NotNull()
    java.lang.String copyright, @org.jetbrains.annotations.NotNull()
    com.nttdata.data.response.ApiResponseItem<T> response) {
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
    
    public ApiResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String copyright, @org.jetbrains.annotations.NotNull()
    com.nttdata.data.response.ApiResponseItem<T> response) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCopyright() {
        return null;
    }
    
    public final void setCopyright(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nttdata.data.response.ApiResponseItem<T> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nttdata.data.response.ApiResponseItem<T> getResponse() {
        return null;
    }
    
    public final void setResponse(@org.jetbrains.annotations.NotNull()
    com.nttdata.data.response.ApiResponseItem<T> p0) {
    }
}