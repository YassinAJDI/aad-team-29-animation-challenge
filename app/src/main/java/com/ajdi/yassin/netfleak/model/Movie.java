package com.ajdi.yassin.netfleak.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by @author = GHARRAS
 * On 17/10/2019
 * Email med.gharras@gmail.com
 */
public class Movie {

    @SerializedName("adult")
    @Expose
    private boolean mAdult;
    @SerializedName("backdrop_path")
    @Expose
    private String mBackdropPath;
    @SerializedName("belongs_to_collection")
    @Expose
    private Object mBelongsToCollection;
    @SerializedName("budget")
    @Expose
    private int mBudget;
    @SerializedName("genres")
    @Expose
    private List<Genre> mGenres = null;
    @SerializedName("homepage")
    @Expose
    private String mHomepage;
    @SerializedName("id")
    @Expose
    private int mId;
    @SerializedName("imdb_id")
    @Expose
    private String mImdbId;
    @SerializedName("original_language")
    @Expose
    private String mOriginalLanguage;
    @SerializedName("original_title")
    @Expose
    private String mOriginalTitle;
    @SerializedName("overview")
    @Expose
    private String mOverview;
    @SerializedName("popularity")
    @Expose
    private float mPopularity;
    @SerializedName("poster_path")
    @Expose
    private String mPosterPath;
    @SerializedName("production_companies")
    @Expose
    private List<ProductionCompany> mProductionCompanies = null;
    @SerializedName("production_countries")
    @Expose
    private List<ProductionCountry> mProductionCountries = null;
    @SerializedName("release_date")
    @Expose
    private String mReleaseDate;
    @SerializedName("revenue")
    @Expose
    private int mRevenue;
    @SerializedName("runtime")
    @Expose
    private int mRuntime;
    @SerializedName("spoken_languages")
    @Expose
    private List<SpokenLanguage> mSpokenLanguages = null;
    @SerializedName("status")
    @Expose
    private String mStatus;
    @SerializedName("tagline")
    @Expose
    private String mTagline;
    @SerializedName("title")
    @Expose
    private String mTitle;
    @SerializedName("video")
    @Expose
    private boolean mVideo;
    @SerializedName("vote_average")
    @Expose
    private float mVoteAverage;
    @SerializedName("vote_count")
    @Expose
    private int mVoteCount;
    @SerializedName("cast")
    @Expose
    private List<Cast> mCast = null;
    @SerializedName("crew")
    @Expose
    private List<Crew> mCrew = null;

    public Movie() {
    }

    public Movie(boolean adult, String backdropPath, Object belongsToCollection, int budget,
                 List<Genre> genres, String homepage, int id, String imdbId,
                 String originalLanguage, String originalTitle, String overview, float popularity,
                 String posterPath, List<ProductionCompany> productionCompanies,
                 List<ProductionCountry> productionCountries, String releaseDate, int revenue,
                 int runtime, List<SpokenLanguage> spokenLanguages, String status,
                 String tagline, String title, boolean video, float voteAverage, int voteCount,
                 List<Cast> cast, List<Crew> crew) {
        this.mAdult = adult;
        this.mBackdropPath = backdropPath;
        this.mBelongsToCollection = belongsToCollection;
        this.mBudget = budget;
        this.mGenres = genres;
        this.mHomepage = homepage;
        this.mId = id;
        this.mImdbId = imdbId;
        this.mOriginalLanguage = originalLanguage;
        this.mOriginalTitle = originalTitle;
        this.mOverview = overview;
        this.mPopularity = popularity;
        this.mPosterPath = posterPath;
        this.mProductionCompanies = productionCompanies;
        this.mProductionCountries = productionCountries;
        this.mReleaseDate = releaseDate;
        this.mRevenue = revenue;
        this.mRuntime = runtime;
        this.mSpokenLanguages = spokenLanguages;
        this.mStatus = status;
        this.mTagline = tagline;
        this.mTitle = title;
        this.mVideo = video;
        this.mVoteAverage = voteAverage;
        this.mVoteCount = voteCount;
        this.mCast = cast;
        this.mCrew = crew;
    }

    public List<Cast> getCast() {
        return mCast;
    }

    public void setCast(List<Cast> cast) {
        this.mCast = cast;
    }

    public List<Crew> getCrew() {
        return mCrew;
    }

    public void setCrew(List<Crew> crew) {
        this.mCrew = crew;
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

    public Object getBelongsToCollection() {
        return mBelongsToCollection;
    }

    public void setBelongsToCollection(Object belongsToCollection) {
        this.mBelongsToCollection = belongsToCollection;
    }

    public int getBudget() {
        return mBudget;
    }

    public void setBudget(int budget) {
        this.mBudget = budget;
    }

    public List<Genre> getGenres() {
        return mGenres;
    }

    public void setGenres(List<Genre> genres) {
        this.mGenres = genres;
    }

    public String getHomepage() {
        return mHomepage;
    }

    public void setHomepage(String homepage) {
        this.mHomepage = homepage;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public String getImdbId() {
        return mImdbId;
    }

    public void setImdbId(String imdbId) {
        this.mImdbId = imdbId;
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

    public String getOverview() {
        return mOverview;
    }

    public void setOverview(String overview) {
        this.mOverview = overview;
    }

    public float getPopularity() {
        return mPopularity;
    }

    public void setPopularity(float popularity) {
        this.mPopularity = popularity;
    }

    public String getPosterPath() {
        return mPosterPath;
    }

    public void setPosterPath(String posterPath) {
        this.mPosterPath = posterPath;
    }

    public List<ProductionCompany> getProductionCompanies() {
        return mProductionCompanies;
    }

    public void setProductionCompanies(List<ProductionCompany> productionCompanies) {
        this.mProductionCompanies = productionCompanies;
    }

    public List<ProductionCountry> getProductionCountries() {
        return mProductionCountries;
    }

    public void setProductionCountries(List<ProductionCountry> productionCountries) {
        this.mProductionCountries = productionCountries;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.mReleaseDate = releaseDate;
    }

    public int getRevenue() {
        return mRevenue;
    }

    public void setRevenue(int revenue) {
        this.mRevenue = revenue;
    }

    public int getRuntime() {
        return mRuntime;
    }

    public void setRuntime(int runtime) {
        this.mRuntime = runtime;
    }

    public List<SpokenLanguage> getSpokenLanguages() {
        return mSpokenLanguages;
    }

    public void setSpokenLanguages(List<SpokenLanguage> spokenLanguages) {
        this.mSpokenLanguages = spokenLanguages;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        this.mStatus = status;
    }

    public String getTagline() {
        return mTagline;
    }

    public void setTagline(String tagline) {
        this.mTagline = tagline;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public boolean isVideo() {
        return mVideo;
    }

    public void setVideo(boolean video) {
        this.mVideo = video;
    }

    public float getVoteAverage() {
        return mVoteAverage;
    }

    public void setVoteAverage(float voteAverage) {
        this.mVoteAverage = voteAverage;
    }

    public int getVoteCount() {
        return mVoteCount;
    }

    public void setVoteCount(int voteCount) {
        this.mVoteCount = voteCount;
    }
}
