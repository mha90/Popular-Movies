package me.koshk.popularmovies.data.api

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 *
 *Created by mhabulazm on 5/16/2018.
 *
 */
interface IMovieApi {

    @GET("path")
    fun getMovies(path: Path, @Query("apiKey") apiKey: String)

    @GET("{path}")
    fun getMoviess(@Path("path") path: String, @Query("apiKey") apiKey: String)

}