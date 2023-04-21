package com.nttdata.data.services


import com.nttdata.data.response.ApiResults
import com.nttdata.data.response.FilmPickResponse
import retrofit2.Call
import retrofit2.http.GET

interface GetFilmPicksService {
    @GET("movies/v2/reviews/picks.json")
    fun getFilmPicks(): Call<ApiResults<FilmPickResponse>>
}