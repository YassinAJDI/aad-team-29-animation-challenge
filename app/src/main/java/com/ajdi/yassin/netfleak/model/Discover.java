package com.ajdi.yassin.netfleak.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by @author = GHARRAS
 * On 17/10/2019
 * Email med.gharras@gmail.com
 */
public class Discover {

    @SerializedName("page")
    @Expose
    private int mPage;
    @SerializedName("total_results")
    @Expose
    private int mTotalResults;
    @SerializedName("total_pages")
    @Expose
    private int mTotalPages;
    @SerializedName("results")
    @Expose
    private List<DiscoverResult> mResults = null;

    public Discover() {
    }

    public Discover(int page, int totalResults, int totalPages, List<DiscoverResult> results) {
        this.mPage = page;
        this.mTotalResults = totalResults;
        this.mTotalPages = totalPages;
        this.mResults = results;
    }

    public int getPage() {
        return mPage;
    }

    public void setPage(int page) {
        this.mPage = page;
    }

    public int getTotalResults() {
        return mTotalResults;
    }

    public void setTotalResults(int totalResults) {
        this.mTotalResults = totalResults;
    }

    public int getTotalPages() {
        return mTotalPages;
    }

    public void setTotalPages(int totalPages) {
        this.mTotalPages = totalPages;
    }

    public List<DiscoverResult> getResults() {
        return mResults;
    }

    public void setResults(List<DiscoverResult> results) {
        this.mResults = results;
    }

}
