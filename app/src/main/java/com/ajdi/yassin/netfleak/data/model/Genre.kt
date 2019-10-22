package com.ajdi.yassin.netfleak.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by @author = GHARRAS
 * On 17/10/2019
 * Email med.gharras@gmail.com
 */
data class Genre (

    @SerializedName("id")
    var id: Int = 0,

    @SerializedName("name")
    var name: String? = null
)
