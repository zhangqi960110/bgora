package com.pcassem.www.huaweithyj.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ServiceEntity extends BaseEntity {


    /**
     * listData : [{"seid":15,"company":"好歌声传媒有限公司","expect_time":"2018-02-28","service_type":"维修服务"},{"seid":14,"company":"上好佳食品有限公司","expect_time":"2018-11-20","service_type":"巡检服务"}]
     * totalCount : 2
     * currentPage : 0
     * totalPage : 1
     * prePage : 1
     * nextPage : 1
     * pageSize : 10
     * beginPage : 1
     * pageIndex : {"beginIndex":1,"endIndex":1}
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
         * endIndex : 1
         */

        @SerializedName("beginIndex")
        private int beginIndex;
        @SerializedName("endIndex")
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
         * seid : 15
         * company : 好歌声传媒有限公司
         * expect_time : 2018-02-28
         * service_type : 维修服务
         */

        @SerializedName("seid")
        private int seid;
        @SerializedName("company")
        private String company;
        @SerializedName("expect_time")
        private String expect_time;
        @SerializedName("service_type")
        private String service_type;

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

        public String getExpect_time() {
            return expect_time;
        }

        public void setExpect_time(String expect_time) {
            this.expect_time = expect_time;
        }

        public String getService_type() {
            return service_type;
        }

        public void setService_type(String service_type) {
            this.service_type = service_type;
        }
    }
}
