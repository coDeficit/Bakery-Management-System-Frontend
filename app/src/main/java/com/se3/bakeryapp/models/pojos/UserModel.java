package com.se3.bakeryapp.models.pojos;

import com.google.gson.annotations.SerializedName;

public class UserModel {

    @SerializedName("role_details")
    private RoleModel roleModel;
    @SerializedName("employee_details")
    private EmployeeModel employeeModel;
    @SerializedName("user_updatedat")
    private String userUpdatedat;
    @SerializedName("user_createdat")
    private String userCreatedat;
    @SerializedName("user_state")
    private boolean userState;
    @SerializedName("password")
    private String password;
    @SerializedName("username")
    private String username;
    @SerializedName("role")
    private int role;
    @SerializedName("employee")
    private int employee;
    @SerializedName("userid")
    private int userid;

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

    public String getUserUpdatedat() {
        return userUpdatedat;
    }

    public void setUserUpdatedat(String userUpdatedat) {
        this.userUpdatedat = userUpdatedat;
    }

    public String getUserCreatedat() {
        return userCreatedat;
    }

    public void setUserCreatedat(String userCreatedat) {
        this.userCreatedat = userCreatedat;
    }

    public boolean getUserState() {
        return userState;
    }

    public void setUserState(boolean userState) {
        this.userState = userState;
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

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getEmployee() {
        return employee;
    }

    public void setEmployee(int employee) {
        this.employee = employee;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public static class RoleModel {
        @SerializedName("role_desc")
        private String roleDesc;
        @SerializedName("permissions")
        private String permissions;
        @SerializedName("role_name")
        private String roleName;
        @SerializedName("roleid")
        private int roleid;

        public String getRoleDesc() {
            return roleDesc;
        }

        public void setRoleDesc(String roleDesc) {
            this.roleDesc = roleDesc;
        }

        public String getPermissions() {
            return permissions;
        }

        public void setPermissions(String permissions) {
            this.permissions = permissions;
        }

        public String getRoleName() {
            return roleName;
        }

        public void setRoleName(String roleName) {
            this.roleName = roleName;
        }

        public int getRoleid() {
            return roleid;
        }

        public void setRoleid(int roleid) {
            this.roleid = roleid;
        }
    }

    public static class EmployeeModel {
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
    }

    public UserModel() {

    }
}
