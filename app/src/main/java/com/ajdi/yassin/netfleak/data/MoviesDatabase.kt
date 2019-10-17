package com.ajdi.yassin.netfleak.data

import android.content.Context

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

import com.ajdi.yassin.netfleak.data.dao.CastsDao
import com.ajdi.yassin.netfleak.data.dao.MoviesDao
import com.ajdi.yassin.netfleak.data.dao.ReviewsDao
import com.ajdi.yassin.netfleak.data.dao.TrailersDao
import com.ajdi.yassin.netfleak.data.model.Cast
import com.ajdi.yassin.netfleak.data.model.Movie
import com.ajdi.yassin.netfleak.data.model.Review
import com.ajdi.yassin.netfleak.data.model.Trailer

/**
 * @author Yassin Ajdi
 * @since 10/17/2019.
 */
@Database(
    entities = [Movie::class, Trailer::class, Cast::class, Review::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class MoviesDatabase : RoomDatabase() {

    abstract fun moviesDao(): MoviesDao

    abstract fun trailersDao(): TrailersDao

    abstract fun castsDao(): CastsDao

    abstract fun reviewsDao(): ReviewsDao

    companion object {

        val DATABASE_NAME = "Movies.db"

        private var INSTANCE: MoviesDatabase? = null

        private val sLock = Any()

        fun getInstance(context: Context): MoviesDatabase {
            synchronized(sLock) {
                if (INSTANCE == null) {
                    INSTANCE = buildDatabase(context)
                }
                return INSTANCE as MoviesDatabase
            }
        }

        private fun buildDatabase(context: Context): MoviesDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                MoviesDatabase::class.java,
                DATABASE_NAME
            ).build()
        }
    }
}