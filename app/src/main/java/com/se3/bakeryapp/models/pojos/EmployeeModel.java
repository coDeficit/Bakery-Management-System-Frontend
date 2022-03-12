package com.se3.bakeryapp.models.pojos;

import com.google.gson.annotations.SerializedName;

public abstract class EmployeeModel {

    @SerializedName("job_details")
    private JobModel jobModel;
    @SerializedName("emp_updatedat")
    private String empUpdatedat;
    @SerializedName("emp_createdat")
    private String empCreatedat;
    @SerializedName("emp_notes")
    private String empNotes;
    @SerializedName("emp_status")
    private String empStatus;
    @SerializedName("emp_image")
    private String empImage;
    @SerializedName("emp_salary")
    private int empSalary;
    @SerializedName("emp_country")
    private String empCountry;
    @SerializedName("emp_state")
    private String empState;
    @SerializedName("emp_city")
    private String empCity;
    @SerializedName("emp_address2")
    private String empAddress2;
    @SerializedName("emp_address1")
    private String empAddress1;
    @SerializedName("employ_type")
    private String employType;
    @SerializedName("emp_email")
    private String empEmail;
    @SerializedName("emp_phone")
    private String empPhone;
    @SerializedName("emp_gender")
    private String empGender;
    @SerializedName("emp_fullname")
    private String empFullname;
    @SerializedName("job")
    private int job;
    @SerializedName("employeeid")
    private int employeeid;

    public JobModel getJobModel() {
        return jobModel;
    }

    public void setJobModel(JobModel jobModel) {
        this.jobModel = jobModel;
    }

    public String getEmpUpdatedat() {
        return empUpdatedat;
    }

    public void setEmpUpdatedat(String empUpdatedat) {
        this.empUpdatedat = empUpdatedat;
    }

    public String getEmpCreatedat() {
        return empCreatedat;
    }

    public void setEmpCreatedat(String empCreatedat) {
        this.empCreatedat = empCreatedat;
    }

    public String getEmpNotes() {
        return empNotes;
    }

    public void setEmpNotes(String empNotes) {
        this.empNotes = empNotes;
    }

    public String getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
    }

    public String getEmpImage() {
        return empImage;
    }

    public void setEmpImage(String empImage) {
        this.empImage = empImage;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpCountry() {
        return empCountry;
    }

    public void setEmpCountry(String empCountry) {
        this.empCountry = empCountry;
    }

    public String getEmpState() {
        return empState;
    }

    public void setEmpState(String empState) {
        this.empState = empState;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    public String getEmpAddress2() {
        return empAddress2;
    }

    public void setEmpAddress2(String empAddress2) {
        this.empAddress2 = empAddress2;
    }

    public String getEmpAddress1() {
        return empAddress1;
    }

    public void setEmpAddress1(String empAddress1) {
        this.empAddress1 = empAddress1;
    }

    public String getEmployType() {
        return employType;
    }

    public void setEmployType(String employType) {
        this.employType = employType;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getEmpFullname() {
        return empFullname;
    }

    public void setEmpFullname(String empFullname) {
        this.empFullname = empFullname;
    }

    public int getJob() {
        return job;
    }

    public void setJob(int job) {
        this.job = job;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public static class JobModel {
        @SerializedName("job_desc")
        private String jobDesc;
        @SerializedName("job_title")
        private String jobTitle;
        @SerializedName("jobid")
        private int jobid;

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
}
