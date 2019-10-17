package com.ajdi.yassin.netfleak.model

import com.google.gson.annotations.SerializedName

data class TrailersResponse(

    @SerializedName("results")
    var trailers: List<Trailer>? = null
)
