package com.example.buttomnavigation

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=7cca60f4431fbdd5a7dea9b5b8176434")
    fun getMovieList(): Call<MovieResponse>
}

