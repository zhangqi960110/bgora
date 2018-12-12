package com.pcassem.www.huaweithyj.entity;

import java.util.List;

public class FaultEntity extends BaseEntity {


    /**
     * listData : [{"fid":39,"code":"86015711","service_type":"巡检服务","time":"2018-01-13"},{"fid":33,"code":"86015711","service_type":"维修服务","time":""},{"fid":31,"code":"86015711","service_type":"维修服务","time":""},{"fid":30,"code":"86015711","service_type":"巡检服务","time":""},{"fid":28,"code":"86015711","service_type":"维修服务","time":"2018-10-18"},{"fid":26,"code":"86015711","service_type":"维修服务","time":""},{"fid":14,"code":"86015711","service_type":"巡检服务","time":"2018-02-28"},{"fid":8,"code":"86015711","service_type":"维修服务","time":"2018-10-01"},{"fid":6,"code":"86015711","service_type":"巡检服务","time":"2018-10-01"},{"fid":1,"code":"86015711","service_type":"维修服务","time":"2018-10-18"}]
     * totalCount : 10
     * currentPage : 0
     * totalPage : 1
     * prePage : 1
     * nextPage : 1
     * pageSize : 20
     * beginPage : 1
     * pageIndex : {"beginIndex":1,"endIndex":1}
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
         * endIndex : 1
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
         * fid : 39
         * code : 86015711
         * service_type : 巡检服务
         * time : 2018-01-13
         */

        private int fid;
        private String code;
        private String service_type;
        private String time;

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
    }
}
