package com.se3.bakeryapp.models.pojos;

import com.google.gson.annotations.SerializedName;

public class UserModel {

    @SerializedName("role_details")
    private RoleModel roleModel;
    @SerializedName("employee_details")
    private EmployeeModel employeeModel;
    @SerializedName("updatedat")
    private String updatedat;
    @SerializedName("createdat")
    private String createdat;
    @SerializedName("state")
    private boolean state;
    @SerializedName("password")
    private String password;
    @SerializedName("username")
    private String username;
    @SerializedName("roleid")
    private int roleid;
    @SerializedName("employeeid")
    private int employeeid;
    @SerializedName("userid")
    private int userid;

    public  UserModel() {

    }

    public RoleModel getRoleModel() {
        return roleModel;
    }

    public void setRoleModel(RoleModel roleModel) {
        this.roleModel = roleModel;
    }

    public EmployeeModel getEmployeeModel() {
        return employeeModel;
    }

    public void setEmployeeModel(EmployeeModel employeeModel) {
        this.employeeModel = employeeModel;
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

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public static class RoleModel {
        @SerializedName("updatedat")
        private String updatedat;
        @SerializedName("createdat")
        private String createdat;
        @SerializedName("description")
        private String description;
        @SerializedName("permissions")
        private String permissions;
        @SerializedName("name")
        private String name;
        @SerializedName("roleid")
        private int roleid;

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

        public String getPermissions() {
            return permissions;
        }

        public void setPermissions(String permissions) {
            this.permissions = permissions;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRoleid() {
            return roleid;
        }

        public void setRoleid(int roleid) {
            this.roleid = roleid;
        }
    }

    public static class EmployeeModel {
        @SerializedName("updatedat")
        private String updatedat;
        @SerializedName("createdat")
        private String createdat;
        @SerializedName("notes")
        private String notes;
        @SerializedName("status")
        private String status;
        @SerializedName("image")
        private String image;
        @SerializedName("salary")
        private int salary;
        @SerializedName("country")
        private String country;
        @SerializedName("state")
        private String state;
        @SerializedName("city")
        private String city;
        @SerializedName("address2")
        private String address2;
        @SerializedName("address1")
        private String address1;
        @SerializedName("employ_type")
        private String employType;
        @SerializedName("email")
        private String email;
        @SerializedName("phone")
        private String phone;
        @SerializedName("gender")
        private String gender;
        @SerializedName("fullname")
        private String fullname;
        @SerializedName("jobid")
        private int jobid;
        @SerializedName("employeeid")
        private int employeeid;

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

        public String getNotes() {
            return notes;
        }

        public void setNotes(String notes) {
            this.notes = notes;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getAddress2() {
            return address2;
        }

        public void setAddress2(String address2) {
            this.address2 = address2;
        }

        public String getAddress1() {
            return address1;
        }

        public void setAddress1(String address1) {
            this.address1 = address1;
        }

        public String getEmployType() {
            return employType;
        }

        public void setEmployType(String employType) {
            this.employType = employType;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getFullname() {
            return fullname;
        }

        public void setFullname(String fullname) {
            this.fullname = fullname;
        }

        public int getJobid() {
            return jobid;
        }

        public void setJobid(int jobid) {
            this.jobid = jobid;
        }

        public int getEmployeeid() {
            return employeeid;
        }

        public void setEmployeeid(int employeeid) {
            this.employeeid = employeeid;
        }
    }
}
