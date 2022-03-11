package com.se3.bakeryapp.models.pojos;

import com.google.gson.annotations.SerializedName;

public class JobModel {

    @SerializedName("updatedat")
    private String updatedat;
    @SerializedName("createdat")
    private String createdat;
    @SerializedName("description")
    private String description;
    @SerializedName("title")
    private String title;
    @SerializedName("jobid")
    private long jobid = 0;

    public JobModel() {

    }

    public String getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(String updatedat) {
        this.updatedat = updatedat;
    }

    public String getCreatedat() {
        return createdat;
    }

    public void setCreatedat(String createdat) {
        this.createdat = createdat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getJobid() {
        return jobid;
    }

    public void setJobid(long jobid) {
        this.jobid = jobid;
    }
}
