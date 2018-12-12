package com.pcassem.www.huaweithyj.entity;

import com.google.gson.annotations.SerializedName;

public class FaultDetailsEntity extends BaseEntity {

    /**
     * fid : 1
     * code : 86015711
     * model :  KG28FS230C
     * categories : 空调
     * manufacturer : 西门子
     * service_type : 维修服务
     * time : 2018-10-18
     * fault_type : null
     * fault_des : 压缩机坏了
     * solution : 不知道
     */

    @SerializedName("fid")
    private int fid;
    @SerializedName("code")
    private String code;
    @SerializedName("model")
    private String model;
    @SerializedName("categories")
    private String categories;
    @SerializedName("manufacturer")
    private String manufacturer;
    @SerializedName("service_type")
    private String service_type;
    @SerializedName("time")
    private String time;
    @SerializedName("fault_type")
    private Object fault_type;
    @SerializedName("fault_des")
    private String fault_des;
    @SerializedName("solution")
    private String solution;

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Object getFault_type() {
        return fault_type;
    }

    public void setFault_type(Object fault_type) {
        this.fault_type = fault_type;
    }

    public String getFault_des() {
        return fault_des;
    }

    public void setFault_des(String fault_des) {
        this.fault_des = fault_des;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
}
