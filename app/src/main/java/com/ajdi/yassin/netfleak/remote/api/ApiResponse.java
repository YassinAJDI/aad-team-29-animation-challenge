package com.ajdi.yassin.netfleak.remote.api;

import androidx.annotation.Nullable;

import java.io.IOException;

import retrofit2.Response;
import timber.log.Timber;

/**
 * Created by @author = GHARRAS
 * On 17/10/2019
 * Email med.gharras@gmail.com
 */
public class ApiResponse<T> {

    private final int mCode;
    @Nullable
    private final T mBody;
    @Nullable
    private final Throwable mError;

    public ApiResponse(@Nullable Throwable error) {
        this.mCode = 500;
        this.mBody = null;
        this.mError = error;
    }

    public ApiResponse(Response<T> response){
        mCode = response.code();
        if (response.isSuccessful()) {
            mBody = response.body();
            mError = null;
        } else {
            String message = null;
            if (response.errorBody() != null) {
                try {
                    message = response.errorBody().string();
                } catch (IOException ignored) {
                    Timber.e(ignored, "error while parsing response");
                }
            }
            if (message == null || message.trim().length() == 0) {
                message = response.message();
            }
            mError = new IOException(message);
            mBody = null;
        }
    }

    public boolean isSuccessful(){
        return (mCode >= 200 && mCode < 300);
    }

    public int getCode() {
        return mCode;
    }

    @Nullable
    public T getBody() {
        return mBody;
    }

    @Nullable
    public Throwable getError() {
        return mError;
    }
}
