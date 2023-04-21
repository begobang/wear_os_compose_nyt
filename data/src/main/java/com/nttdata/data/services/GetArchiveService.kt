package com.nttdata.data.services

import com.nttdata.data.response.ApiResponse
import com.nttdata.data.response.ArchiveResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GetArchiveService {
    @GET("archive/v1/{year}/{month}.json")
    fun getArchive(
        @Path("year") year: String,
        @Path("month") month: String
    ): Call<ApiResponse<ArchiveResponse>>
}