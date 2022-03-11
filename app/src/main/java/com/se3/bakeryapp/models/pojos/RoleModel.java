package com.se3.bakeryapp.models.pojos;

import com.google.gson.annotations.SerializedName;

public class RoleModel {
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
    private long roleid = 0;

    public RoleModel() {

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

    public long getRoleid() {
        return roleid;
    }

    public void setRoleid(long roleid) {
        this.roleid = roleid;
    }
}
