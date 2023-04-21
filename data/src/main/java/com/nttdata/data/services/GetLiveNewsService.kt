package com.nttdata.data.services

import com.nttdata.data.response.ApiResults
import com.nttdata.data.response.LiveNewsResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.Call

interface GetLiveNewsService {
    @GET("news/v3/content/all/{sectionId}.json")
    fun getLiveNewsAsync(
        @Path("sectionId") sectionId: String,
        @Query("limit") limit: Int
    ): Call<ApiResults<LiveNewsResponse>>
}