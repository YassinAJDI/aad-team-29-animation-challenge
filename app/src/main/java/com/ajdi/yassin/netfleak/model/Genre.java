package com.ajdi.yassin.netfleak.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by @author = GHARRAS
 * On 17/10/2019
 * Email med.gharras@gmail.com
 */
public class Genre {

    @SerializedName("id")
    @Expose
    private int mId;
    @SerializedName("name")
    @Expose
    private String mName;

    public Genre() {
    }

    public Genre(int id, String name) {
        this.mId = id;
        this.mName = name;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }
}
