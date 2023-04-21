package com.nttdata.data.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/nttdata/data/services/GetSectionsService;", "", "getSectionsAsync", "Lretrofit2/Call;", "Lcom/nttdata/data/response/ApiResults;", "Lcom/nttdata/data/response/SectionResponse;", "limit", "", "data_debug"})
public abstract interface GetSectionsService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "news/v3/content/section-list.json")
    public abstract retrofit2.Call<com.nttdata.data.response.ApiResults<com.nttdata.data.response.SectionResponse>> getSectionsAsync(@retrofit2.http.Query(value = "limit")
    int limit);
}