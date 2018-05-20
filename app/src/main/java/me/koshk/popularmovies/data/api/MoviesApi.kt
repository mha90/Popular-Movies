package me.koshk.popularmovies.data.api

import com.squareup.moshi.Moshi
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 *
 *Created by mhabulazm on 5/16/2018.
 *
 */
object MoviesApi {
    private const val baseUrl = "http://api.themoviedb.org/3/movie/"

    fun getApi(): IMovieApi? {
        return getApi(Moshi.Builder().build())
    }

    fun getApi(moshi: Moshi): IMovieApi? {
        return Retrofit.Builder()
                .baseUrl(baseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .build().create(IMovieApi::class.java)
    }

}
