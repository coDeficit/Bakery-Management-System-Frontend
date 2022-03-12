package com.se3.bakeryapp.models.pojos;

import com.google.gson.annotations.SerializedName;

public class JobModel {

    @SerializedName("job_desc")
    private String jobDesc;
    @SerializedName("job_title")
    private String jobTitle;
    @SerializedName("jobid")
    private int jobid;

    public JobModel(){

    }

    public JobModel(String jobDesc, String jobTitle, int jobid) {
        this.jobDesc = jobDesc;
        this.jobTitle = jobTitle;
        this.jobid = jobid;
    }

    public JobModel(String jobDesc, String jobTitle) {
        this.jobDesc = jobDesc;
        this.jobTitle = jobTitle;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getJobid() {
        return jobid;
    }

    public void setJobid(int jobid) {
        this.jobid = jobid;
    }
}
