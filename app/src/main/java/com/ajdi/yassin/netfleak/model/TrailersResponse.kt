package com.ajdi.yassin.netfleak.model

import com.google.gson.annotations.SerializedName

/**
 * @author Yassin Ajdi
 * @since 10/17/2019.
 */
data class TrailersResponse(

    @SerializedName("results")
    var trailers: List<Trailer>? = null
)
