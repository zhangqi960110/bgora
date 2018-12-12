package com.pcassem.www.huaweithyj.entity;

import com.google.gson.annotations.SerializedName;

public class UserEntity extends BaseEntity {


    /**
     * username : zhangqi
     * role : staff
     * userid : 2
     * token : 71arquguruic4qkucv2v3r48ke
     * phone : 18670026045
     */

    @SerializedName("username")
    private String username;
    @SerializedName("role")
    private String role;
    @SerializedName("userid")
    private int userid;
    @SerializedName("token")
    private String token;
    @SerializedName("phone")
    private String phone;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
