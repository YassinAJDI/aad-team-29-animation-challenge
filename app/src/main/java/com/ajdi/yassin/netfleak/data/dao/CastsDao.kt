package com.ajdi.yassin.netfleak.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

import com.ajdi.yassin.netfleak.data.model.Cast

/**
 * @author Yassin Ajdi
 * @since 10/17/2019.
 */
@Dao
interface CastsDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAllCasts(castList: List<Cast>)
}
