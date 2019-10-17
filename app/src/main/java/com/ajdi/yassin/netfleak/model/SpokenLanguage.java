package com.ajdi.yassin.netfleak.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by @author = GHARRAS
 * On 17/10/2019
 * Email med.gharras@gmail.com
 */
class SpokenLanguage {

    @SerializedName("iso_639_1")
    @Expose
    private String mIso6391;
    @SerializedName("name")
    @Expose
    private String mName;

    public SpokenLanguage() {
    }

    public SpokenLanguage(String iso6391, String name) {
        this.mIso6391 = iso6391;
        this.mName = name;
    }

    public String getIso6391() {
        return mIso6391;
    }

    public void setIso6391(String iso6391) {
        this.mIso6391 = iso6391;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

}
