package com.ajdi.yassin.netfleak.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by @author = GHARRAS
 * On 17/10/2019
 * Email med.gharras@gmail.com
 */
class DiscoverResult {

    @SerializedName("popularity")
    @Expose
    private float mPopularity;
    @SerializedName("vote_count")
    @Expose
    private int mVoteCount;
    @SerializedName("video")
    @Expose
    private boolean mVideo;
    @SerializedName("poster_path")
    @Expose
    private String mPosterPath;
    @SerializedName("id")
    @Expose
    private int mId;
    @SerializedName("adult")
    @Expose
    private boolean mAdult;
    @SerializedName("backdrop_path")
    @Expose
    private String mBackdropPath;
    @SerializedName("original_language")
    @Expose
    private String mOriginalLanguage;
    @SerializedName("original_title")
    @Expose
    private String mOriginalTitle;
    @SerializedName("genre_ids")
    @Expose
    private List<Integer> mGenreIds = null;
    @SerializedName("title")
    @Expose
    private String mTitle;
    @SerializedName("vote_average")
    @Expose
    private float mVoteAverage;
    @SerializedName("overview")
    @Expose
    private String mOverview;
    @SerializedName("release_date")
    @Expose
    private String mReleaseDate;

    public DiscoverResult() {
    }

    public DiscoverResult(float popularity, int voteCount, boolean video,
                          String posterPath, int id, boolean adult, String backdropPath,
                          String originalLanguage, String originalTitle, List<Integer> genreIds,
                          String title, float voteAverage, String overview,
                          String releaseDate) {
        this.mPopularity = popularity;
        this.mVoteCount = voteCount;
        this.mVideo = video;
        this.mPosterPath = posterPath;
        this.mId = id;
        this.mAdult = adult;
        this.mBackdropPath = backdropPath;
        this.mOriginalLanguage = originalLanguage;
        this.mOriginalTitle = originalTitle;
        this.mGenreIds = genreIds;
        this.mTitle = title;
        this.mVoteAverage = voteAverage;
        this.mOverview = overview;
        this.mReleaseDate = releaseDate;
    }

    public float getPopularity() {
        return mPopularity;
    }

    public void setPopularity(float popularity) {
        this.mPopularity = popularity;
    }

    public int getVoteCount() {
        return mVoteCount;
    }

    public void setVoteCount(int voteCount) {
        this.mVoteCount = voteCount;
    }

    public boolean isVideo() {
        return mVideo;
    }

    public void setVideo(boolean video) {
        this.mVideo = video;
    }

    public String getPosterPath() {
        return mPosterPath;
    }

    public void setPosterPath(String posterPath) {
        this.mPosterPath = posterPath;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public boolean isAdult() {
        return mAdult;
    }

    public void setAdult(boolean adult) {
        this.mAdult = adult;
    }

    public String getBackdropPath() {
        return mBackdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.mBackdropPath = backdropPath;
    }

    public String getOriginalLanguage() {
        return mOriginalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.mOriginalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return mOriginalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.mOriginalTitle = originalTitle;
    }

    public List<Integer> getGenreIds() {
        return mGenreIds;
    }

    public void setGenreIds(List<Integer> genreIds) {
        this.mGenreIds = genreIds;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public float getVoteAverage() {
        return mVoteAverage;
    }

    public void setVoteAverage(float voteAverage) {
        this.mVoteAverage = voteAverage;
    }

    public String getOverview() {
        return mOverview;
    }

    public void setOverview(String overview) {
        this.mOverview = overview;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.mReleaseDate = releaseDate;
    }
}
