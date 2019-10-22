package com.ajdi.yassin.netfleak.data.model

import com.google.gson.annotations.SerializedName

/**
 * @author Yassin Ajdi
 * @since 10/17/2019.
 */
data class ReviewsResponse (

    @SerializedName("results")
    var reviews: List<Review>? = null
)