package com.ajdi.yassin.netfleak.remote.api;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by @author = GHARRAS
 * On 17/10/2019
 * Email med.gharras@gmail.com
 */
public class ApiUtils {

    private static final String BASE_URL = "https://api.themoviedb.org/3";

    private static OkHttpClient sOkHttpClient;

    private static MovieService sInstance;

    private static final Object sLock = new Object();

    /**
     * because we are using static method in this class we need to initialize our OkHttpClient
     * in the static initializer so that we want need to instantiate it each time we do a new
     * request
     */

    {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BASIC);

        sOkHttpClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .addInterceptor(new AuthInterceptor())
                .build();

    }

    private ApiUtils() {
    }

    public static MovieService getInstance() {
        synchronized (sLock) {
            if (sInstance == null) {
                    sInstance = getRetrofitInstance().create(MovieService.class);
            }
            return sInstance;
        }
    }

    /**
     * still need work after we create the utils package
     * @return
     */

    public static Retrofit getRetrofitInstance(){
        return new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(sOkHttpClient)
                .build();
    }
}
