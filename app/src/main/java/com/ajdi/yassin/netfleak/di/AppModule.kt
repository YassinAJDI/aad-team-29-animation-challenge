package com.ajdi.yassin.netfleak.di

import android.app.Application
import androidx.room.Room
import com.ajdi.yassin.netfleak.BuildConfig
import com.ajdi.yassin.netfleak.data.MoviesDatabase
import com.ajdi.yassin.netfleak.data.dao.CastsDao
import com.ajdi.yassin.netfleak.data.dao.MoviesDao
import com.ajdi.yassin.netfleak.data.dao.ReviewsDao
import com.ajdi.yassin.netfleak.data.dao.TrailersDao
import com.ajdi.yassin.netfleak.remote.api.AuthInterceptor
import com.ajdi.yassin.netfleak.remote.api.MovieService
import dagger.Module
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.OkHttpClient
import javax.inject.Singleton
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * @author Yassin Ajdi
 * @since 10/19/2019.
 */
@Module
class AppModule {

    @Singleton
    @Provides
    fun provideMovieService(okHttpClient: OkHttpClient): MovieService {
        return Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(MovieService::class.java)
    }

    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()

        if (BuildConfig.DEBUG) {
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BASIC
            builder.addInterceptor(logging)
        }
        builder.addInterceptor(AuthInterceptor())

        return builder.build()
    }

    @Singleton
    @Provides
    fun provideDb(app: Application): MoviesDatabase {
        return Room
            .databaseBuilder(app, MoviesDatabase::class.java, "movies.db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideMoviesDao(db: MoviesDatabase): MoviesDao {
        return db.moviesDao()
    }

    @Singleton
    @Provides
    fun provideReviewsDao(db: MoviesDatabase): ReviewsDao {
        return db.reviewsDao()
    }

    @Singleton
    @Provides
    fun provideTrailersDao(db: MoviesDatabase): TrailersDao {
        return db.trailersDao()
    }

    @Singleton
    @Provides
    fun provideCastsDao(db: MoviesDatabase): CastsDao {
        return db.castsDao()
    }
}