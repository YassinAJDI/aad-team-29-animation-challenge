package com.ajdi.yassin.netfleak.model

import com.google.gson.annotations.SerializedName

/**
 * Created by @author = GHARRAS
 * On 17/10/2019
 * Email med.gharras@gmail.com
 */
data class Cast(

    @SerializedName("credit_id")
    var id: String,

    var movieId: Long = 0,

    @SerializedName("character")
    var characterName: String? = null,

    @SerializedName("gender")
    var gender: Int = 0,

    @SerializedName("name")
    var actorName: String? = null,

    @SerializedName("order")
    var order: Int = 0,

    @SerializedName("profile_path")
    var profileImagePath: String? = null
)
