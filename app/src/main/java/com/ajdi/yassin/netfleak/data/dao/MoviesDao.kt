package com.ajdi.yassin.netfleak.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction

import com.ajdi.yassin.netfleak.data.model.Movie
import com.ajdi.yassin.netfleak.data.model.MovieDetails


/**
 * @author Yassin Ajdi
 * @since 10/17/2019.
 */
@Dao
interface MoviesDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertMovie(movie: Movie)

    @Transaction
    @Query("SELECT * FROM movie WHERE movie.id= :movieId")
    fun getMovie(movieId: Long): LiveData<MovieDetails>
}
