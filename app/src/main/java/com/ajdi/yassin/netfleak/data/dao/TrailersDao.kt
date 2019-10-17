package com.ajdi.yassin.netfleak.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

import com.ajdi.yassin.netfleak.data.model.Trailer

/**
 * @author Yassin Ajdi
 * @since 10/17/2019.
 */
@Dao
interface TrailersDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAllTrailers(trailers: List<Trailer>)
}
