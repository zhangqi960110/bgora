package com.pcassem.www.huaweithyj.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DeviceEntity extends BaseEntity {


    /**
     * listData : [{"eid":1,"code":"86015711","model":" KG28FS230C","categories":"空调","manufacturer":"西门子"},{"eid":2,"code":"86015712","model":"UHA1R-0030","categories":"UPS","manufacturer":"艾默生"},{"eid":3,"code":"86015713","model":"UHA1R-0030","categories":"UPS","manufacturer":"艾默生"},{"eid":6,"code":"86015714","model":"UHA1R-0030","categories":"UPS","manufacturer":"艾默生"},{"eid":7,"code":"86015715","model":"UHA1R-0031","categories":"UPS","manufacturer":"艾默生"},{"eid":8,"code":"86015716","model":null,"categories":null,"manufacturer":null},{"eid":9,"code":"86015717","model":"UHA1R-0036","categories":"UPS","manufacturer":"艾默生"},{"eid":10,"code":"86015718","model":"KG28FS231C","categories":"空调","manufacturer":"西门子"},{"eid":11,"code":"86015719","model":"KG28FS232C","categories":"空调","manufacturer":"西门子"},{"eid":12,"code":"86015720","model":"UF-LTS10-1P","categories":"UPS","manufacturer":"艾默生"}]
     * totalCount : 52
     * currentPage : 0
     * totalPage : 6
     * prePage : 1
     * nextPage : 1
     * pageSize : 10
     * beginPage : 1
     * pageIndex : {"beginIndex":1,"endIndex":5}
     */

    @SerializedName("totalCount")
    private int totalCount;
    @SerializedName("currentPage")
    private int currentPage;
    @SerializedName("totalPage")
    private int totalPage;
    @SerializedName("prePage")
    private int prePage;
    @SerializedName("nextPage")
    private int nextPage;
    @SerializedName("pageSize")
    private int pageSize;
    @SerializedName("beginPage")
    private int beginPage;
    @SerializedName("pageIndex")
    private PageIndexBean pageIndex;
    @SerializedName("listData")
    private List<ListDataBean> listData;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPrePage() {
        return prePage;
    }

    public void setPrePage(int prePage) {
        this.prePage = prePage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getBeginPage() {
        return beginPage;
    }

    public void setBeginPage(int beginPage) {
        this.beginPage = beginPage;
    }

    public PageIndexBean getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(PageIndexBean pageIndex) {
        this.pageIndex = pageIndex;
    }

    public List<ListDataBean> getListData() {
        return listData;
    }

    public void setListData(List<ListDataBean> listData) {
        this.listData = listData;
    }

    public static class PageIndexBean {
        /**
         * beginIndex : 1
         * endIndex : 5
         */

        private int beginIndex;
        private int endIndex;

        public int getBeginIndex() {
            return beginIndex;
        }

        public void setBeginIndex(int beginIndex) {
            this.beginIndex = beginIndex;
        }

        public int getEndIndex() {
            return endIndex;
        }

        public void setEndIndex(int endIndex) {
            this.endIndex = endIndex;
        }
    }

    public static class ListDataBean {
        /**
         * eid : 1
         * code : 86015711
         * model :  KG28FS230C
         * categories : 空调
         * manufacturer : 西门子
         */

        @SerializedName("eid")
        private int eid;
        @SerializedName("code")
        private String code;
        @SerializedName("model")
        private String model;
        @SerializedName("categories")
        private String categories;
        @SerializedName("manufacturer")
        private String manufacturer;

        public int getEid() {
            return eid;
        }

        public void setEid(int eid) {
            this.eid = eid;
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
    }
}
