package com.ajdi.yassin.netfleak.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by @author = GHARRAS
 * On 17/10/2019
 * Email med.gharras@gmail.com
 */
class Cast {

    @SerializedName("cast_id")
    @Expose
    private int mCastId;
    @SerializedName("character")
    @Expose
    private String mCharacter;
    @SerializedName("credit_id")
    @Expose
    private String mCreditId;
    @SerializedName("gender")
    @Expose
    private int mGender;
    @SerializedName("id")
    @Expose
    private int mId;
    @SerializedName("name")
    @Expose
    private String mName;
    @SerializedName("order")
    @Expose
    private int mOrder;
    @SerializedName("profile_path")
    @Expose
    private String mProfilePath;

    public Cast() {
    }

    public Cast(int castId, String character, String creditId, int gender,
                int id, String name, int order, String profilePath) {
        this.mCastId = castId;
        this.mCharacter = character;
        this.mCreditId = creditId;
        this.mGender = gender;
        this.mId = id;
        this.mName = name;
        this.mOrder = order;
        this.mProfilePath = profilePath;
    }

    public int getCastId() {
        return mCastId;
    }

    public void setCastId(int castId) {
        this.mCastId = castId;
    }

    public String getCharacter() {
        return mCharacter;
    }

    public void setCharacter(String character) {
        this.mCharacter = character;
    }

    public String getCreditId() {
        return mCreditId;
    }

    public void setCreditId(String creditId) {
        this.mCreditId = creditId;
    }

    public int getGender() {
        return mGender;
    }

    public void setGender(int gender) {
        this.mGender = gender;
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

    public int getOrder() {
        return mOrder;
    }

    public void setOrder(int order) {
        this.mOrder = order;
    }

    public String getProfilePath() {
        return mProfilePath;
    }

    public void setProfilePath(String profilePath) {
        this.mProfilePath = profilePath;
    }

}
