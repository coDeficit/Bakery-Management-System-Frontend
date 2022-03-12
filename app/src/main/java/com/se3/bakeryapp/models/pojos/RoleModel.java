package com.se3.bakeryapp.models.pojos;

import com.google.gson.annotations.SerializedName;

public abstract class RoleModel {

    @SerializedName("role_desc")
    private String roleDesc;
    @SerializedName("permissions")
    private String permissions;
    @SerializedName("role_name")
    private String roleName;
    @SerializedName("roleid")
    private int roleid;

    public RoleModel() {

    }

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
