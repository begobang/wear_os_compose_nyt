package com.nttdata.data.services

import com.nttdata.data.response.ApiResults
import com.nttdata.data.response.SectionResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetSectionsService {

    @GET("news/v3/content/section-list.json")
    fun getSectionsAsync(
        @Query("limit") limit: Int
    ): Call<ApiResults<SectionResponse>>
}