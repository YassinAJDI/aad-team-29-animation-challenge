package com.ajdi.yassin.netfleak.remote.api;

import androidx.lifecycle.LiveData;

import com.ajdi.yassin.netfleak.data.model.Movie;
import com.ajdi.yassin.netfleak.data.model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by @author = GHARRAS
 * On 17/10/2019
 * Email med.gharras@gmail.com
 */
public interface MovieService {

    @GET("movie/popular")
    Call<MoviesResponse> getPopularMovies(@Query("page") int page);

    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("page") int page);

    @GET("movie/now_playing")
    Call<MoviesResponse> getNowPlayingMovies(@Query("page") int page);

    // Instead of using 4 separate requests we use append_to_response
    // to eliminate duplicate requests and save network bandwidth
    // this request return full movie details, trailers, reviews and cast
    @GET("movie/{id}?append_to_response=videos,credits,reviews")
    LiveData<ApiResponse<Movie>> getMovieDetails(@Path("id") long id);
}
