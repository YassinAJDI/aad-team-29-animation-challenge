package com.ajdi.yassin.netfleak.data.model

import androidx.room.Embedded
import androidx.room.Relation

/**
 * @author Yassin Ajdi
 * @since 10/17/2019.
 */
data class MovieDetails (

    @Embedded
    var movie: Movie? = null,

    @Relation(parentColumn = "id", entityColumn = "movie_id")
    var trailers: List<Trailer> = ArrayList(),

    @Relation(parentColumn = "id", entityColumn = "movie_id")
    var castList: List<Cast> = ArrayList(),

    @Relation(parentColumn = "id", entityColumn = "movie_id")
    var reviews: List<Review> = ArrayList()
)