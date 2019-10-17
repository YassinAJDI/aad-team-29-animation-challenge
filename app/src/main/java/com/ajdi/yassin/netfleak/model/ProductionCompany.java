package com.ajdi.yassin.netfleak.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by @author = GHARRAS
 * On 17/10/2019
 * Email med.gharras@gmail.com
 */
class ProductionCompany {

    @SerializedName("id")
    @Expose
    private int mId;
    @SerializedName("logo_path")
    @Expose
    private String mLogoPath;
    @SerializedName("name")
    @Expose
    private String mName;
    @SerializedName("origin_country")
    @Expose
    private String mOriginCountry;

    public ProductionCompany() {
    }

    public ProductionCompany(int id, String logoPath, String name, String originCountry) {
        this.mId = id;
        this.mLogoPath = logoPath;
        this.mName = name;
        this.mOriginCountry = originCountry;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public String getLogoPath() {
        return mLogoPath;
    }

    public void setLogoPath(String logoPath) {
        this.mLogoPath = logoPath;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getOriginCountry() {
        return mOriginCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.mOriginCountry = originCountry;
    }

}
