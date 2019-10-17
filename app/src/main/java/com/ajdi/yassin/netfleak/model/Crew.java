package com.ajdi.yassin.netfleak.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by @author = GHARRAS
 * On 17/10/2019
 * Email med.gharras@gmail.com
 */
class Crew {

    @SerializedName("credit_id")
    @Expose
    private String mCreditId;
    @SerializedName("department")
    @Expose
    private String mDepartment;
    @SerializedName("gender")
    @Expose
    private int mGender;
    @SerializedName("id")
    @Expose
    private int mId;
    @SerializedName("job")
    @Expose
    private String mJob;
    @SerializedName("name")
    @Expose
    private String mName;
    @SerializedName("profile_path")
    @Expose
    private String mProfilePath;

    public Crew() {
    }

    public Crew(String creditId, String department, int gender, int id,
                String job, String name, String profilePath) {
        this.mCreditId = creditId;
        this.mDepartment = department;
        this.mGender = gender;
        this.mId = id;
        this.mJob = job;
        this.mName = name;
        this.mProfilePath = profilePath;
    }

    public String getCreditId() {
        return mCreditId;
    }

    public void setCreditId(String creditId) {
        this.mCreditId = creditId;
    }

    public String getDepartment() {
        return mDepartment;
    }

    public void setDepartment(String department) {
        this.mDepartment = department;
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

    public String getJob() {
        return mJob;
    }

    public void setJob(String job) {
        this.mJob = job;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getProfilePath() {
        return mProfilePath;
    }

    public void setProfilePath(String profilePath) {
        this.mProfilePath = profilePath;
    }

}
