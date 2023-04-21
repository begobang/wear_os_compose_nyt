package com.nttdata.data.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\'\u00a8\u0006\t"}, d2 = {"Lcom/nttdata/data/services/GetArchiveService;", "", "getArchive", "Lretrofit2/Call;", "Lcom/nttdata/data/response/ApiResponse;", "Lcom/nttdata/data/response/ArchiveResponse;", "year", "", "month", "data_debug"})
public abstract interface GetArchiveService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "archive/v1/{year}/{month}.json")
    public abstract retrofit2.Call<com.nttdata.data.response.ApiResponse<com.nttdata.data.response.ArchiveResponse>> getArchive(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "year")
    java.lang.String year, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "month")
    java.lang.String month);
}