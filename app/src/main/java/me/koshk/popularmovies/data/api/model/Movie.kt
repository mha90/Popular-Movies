package me.koshk.popularmovies.data.api.model

/**
 *
 *Created by mhabulazm on 5/16/2018.
 *
 */

data class Movie(var vote_count: Int, var id: Int, var video: Boolean, var vote_average: Int, var title: String,
            var popularity: Long, var poster_path: String, var original_language: String,
            var original_title: String, var backdrop_path: String, var genre_ids: List<Int>,
            var adult: Boolean, var overview: String, var release_date: String)
