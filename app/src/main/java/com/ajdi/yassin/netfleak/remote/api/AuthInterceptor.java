package com.ajdi.yassin.netfleak.remote.api;

import com.ajdi.yassin.netfleak.BuildConfig;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * this Interceptor have the job of added the API_KEY of the TMDB API to our Request
 *
 *
 * Created by @author = GHARRAS
 * On 17/10/2019
 * Email med.gharras@gmail.com
 */
class AuthInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {

        HttpUrl url = chain.request().url().newBuilder()
                .addQueryParameter("api_key", BuildConfig.TMDB_API_KEY)
                .build();

        Request request = chain.request().newBuilder().url(url).build();

        return chain.proceed(request);
    }
}
