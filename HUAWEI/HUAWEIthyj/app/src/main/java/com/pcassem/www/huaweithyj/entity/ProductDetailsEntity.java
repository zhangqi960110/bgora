package com.pcassem.www.huaweithyj.entity;

import com.google.gson.annotations.SerializedName;

public class ProductDetailsEntity extends BaseEntity {

    /**
     * pid : 1
     * model :  KG28FS230C
     * categories : 空调
     * manufacturer : 西门子
     * instruction : xxxx
     */

    @SerializedName("pid")
    private int pid;
    @SerializedName("model")
    private String model;
    @SerializedName("categories")
    private String categories;
    @SerializedName("manufacturer")
    private String manufacturer;
    @SerializedName("instruction")
    private String instruction;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
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

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
}
