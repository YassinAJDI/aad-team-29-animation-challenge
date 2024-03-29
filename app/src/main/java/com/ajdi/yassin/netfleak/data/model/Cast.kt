package com.ajdi.yassin.netfleak.data.model

import androidx.room.*
import androidx.room.ForeignKey.CASCADE
import com.google.gson.annotations.SerializedName

/**
 * Created by @author = GHARRAS
 * On 17/10/2019
 * Email med.gharras@gmail.com
 */
@Entity(
    tableName = "cast",
    foreignKeys = [ForeignKey(
        entity = Movie::class,
        parentColumns = ["id"],
        childColumns = ["movie_id"],
        onDelete = CASCADE,
        onUpdate = CASCADE
    )],
    indices = [Index(value = ["movie_id"])]
)
data class Cast(

    @PrimaryKey
    @SerializedName("credit_id")
    var id: String,

    @ColumnInfo(name = "movie_id")
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
