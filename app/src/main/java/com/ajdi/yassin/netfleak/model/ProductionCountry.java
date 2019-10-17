package com.ajdi.yassin.netfleak.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by @author = GHARRAS
 * On 17/10/2019
 * Email med.gharras@gmail.com
 */
class ProductionCountry {
    @SerializedName("iso_3166_1")
    @Expose
    private String mIso31661;
    @SerializedName("name")
    @Expose
    private String mName;

    public ProductionCountry() {
    }

    public ProductionCountry(String iso31661, String name) {
        this.mIso31661 = mIso31661;
        this.mName = mName;
    }

    public String getIso31661() {
        return mIso31661;
    }

    public void setIso31661(String iso31661) {
        this.mIso31661 = iso31661;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

}
