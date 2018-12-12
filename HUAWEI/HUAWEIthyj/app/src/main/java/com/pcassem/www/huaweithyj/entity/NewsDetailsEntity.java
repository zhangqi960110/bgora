package com.pcassem.www.huaweithyj.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NewsDetailsEntity extends BaseEntity {


    /**
     * seid : 1
     * company : 奇奇科技有限公司
     * number : CT1212014
     * name : 简易
     * phone : 19807653465
     * expect_time : 2018-10-18
     * position : yyy
     * equipment : [{"code":null,"model":null,"categories":null,"manufacturer":null},{"code":null,"model":null,"categories":null,"manufacturer":null}]
     */

    @SerializedName("seid")
    private int seid;
    @SerializedName("company")
    private String company;
    @SerializedName("number")
    private String number;
    @SerializedName("name")
    private String name;
    @SerializedName("phone")
    private String phone;
    @SerializedName("expect_time")
    private String expect_time;
    @SerializedName("position")
    private String position;
    @SerializedName("equipment")
    private List<EquipmentBean> equipment;

    public int getSeid() {
        return seid;
    }

    public void setSeid(int seid) {
        this.seid = seid;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExpect_time() {
        return expect_time;
    }

    public void setExpect_time(String expect_time) {
        this.expect_time = expect_time;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<EquipmentBean> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<EquipmentBean> equipment) {
        this.equipment = equipment;
    }

    public static class EquipmentBean {
        /**
         * code : null
         * model : null
         * categories : null
         * manufacturer : null
         */

        @SerializedName("code")
        private Object code;
        @SerializedName("model")
        private Object model;
        @SerializedName("categories")
        private Object categories;
        @SerializedName("manufacturer")
        private Object manufacturer;

        public Object getCode() {
            return code;
        }

        public void setCode(Object code) {
            this.code = code;
        }

        public Object getModel() {
            return model;
        }

        public void setModel(Object model) {
            this.model = model;
        }

        public Object getCategories() {
            return categories;
        }

        public void setCategories(Object categories) {
            this.categories = categories;
        }

        public Object getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(Object manufacturer) {
            this.manufacturer = manufacturer;
        }
    }
}
