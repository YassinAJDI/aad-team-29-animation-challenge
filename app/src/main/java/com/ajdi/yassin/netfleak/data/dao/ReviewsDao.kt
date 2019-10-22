package com.ajdi.yassin.netfleak.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

import com.ajdi.yassin.netfleak.data.model.Review

/**
 * @author Yassin Ajdi
 * @since 10/17/2019.
 */
@Dao
interface ReviewsDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAllReviews(reviews: List<Review>)
}
