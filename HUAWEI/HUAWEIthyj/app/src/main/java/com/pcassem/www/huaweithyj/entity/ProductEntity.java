package com.pcassem.www.huaweithyj.entity;

import java.util.List;

public class ProductEntity extends BaseEntity {

    /**
     * listData : [{"pid":29,"categories":"空调","model":"KG28FS254C","manufacturer":"艾默生"},{"pid":25,"categories":"空调","model":"KG28FS239C","manufacturer":"西门子"},{"pid":24,"categories":"空调","model":"KG28FS238C","manufacturer":"西门子"},{"pid":23,"categories":"空调","model":"KG28FS334C","manufacturer":"西门子"},{"pid":22,"categories":"UPS","model":"UHA1R-0036","manufacturer":"艾默生"},{"pid":20,"categories":"UPS","model":"UHA1R-0035","manufacturer":"艾默生"},{"pid":19,"categories":"空调","model":"UHA1R-0034","manufacturer":"西门子"},{"pid":18,"categories":"空调","model":"UHA1R-0033","manufacturer":"西门子"},{"pid":10,"categories":"空调","model":"KG28FS237C","manufacturer":"西门子"},{"pid":9,"categories":"空调","model":"KG28FS236C","manufacturer":"西门子"}]
     * totalCount : 18
     * currentPage : 0
     * totalPage : 2
     * prePage : 1
     * nextPage : 1
     * pageSize : 10
     * beginPage : 1
     * pageIndex : {"beginIndex":1,"endIndex":2}
     */

    private int totalCount;
    private int currentPage;
    private int totalPage;
    private int prePage;
    private int nextPage;
    private int pageSize;
    private int beginPage;
    private PageIndexBean pageIndex;
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
         * endIndex : 2
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
         * pid : 29
         * categories : 空调
         * model : KG28FS254C
         * manufacturer : 艾默生
         */

        private int pid;
        private String categories;
        private String model;
        private String manufacturer;

        public int getPid() {
            return pid;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }

        public String getCategories() {
            return categories;
        }

        public void setCategories(String categories) {
            this.categories = categories;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }
    }
}
