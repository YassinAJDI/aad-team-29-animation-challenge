package com.ajdi.yassin.netfleak.model

import com.google.gson.annotations.SerializedName

/**
 * @author Yassin Ajdi
 * @since 10/17/2019.
 */
data class MoviesResponse(

    @SerializedName("page")
    var page: Int = 0,

    @SerializedName("total_results")
    var totalResults: Int = 0,

    @SerializedName("total_pages")
    var totalPages: Int = 0,

    @SerializedName("results")
    var movies: List<Movie>? = null
)