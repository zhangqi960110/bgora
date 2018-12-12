package com.pcassem.www.huaweithyj.entity;

import java.util.List;

public class SigninEntity extends BaseEntity {

        /**
         * listData : [{"rid":22,"position":"长沙dYpyZ","timestart":"2018-10-13","timeend":"2018-10-13"},{"rid":17,"position":"长沙nlTn8","timestart":"2018-10-13","timeend":"2018-10-13"},{"rid":16,"position":"长沙oHsQm","timestart":"2018-10-13","timeend":"2018-10-13"},{"rid":13,"position":"长沙TZBSK","timestart":"2018-10-13","timeend":"2018-10-13"},{"rid":10,"position":"长沙3slsC","timestart":"2018-10-13","timeend":"2018-10-13"}]
         * totalCount : 5
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
             * rid : 22
             * position : 长沙dYpyZ
             * timestart : 2018-10-13
             * timeend : 2018-10-13
             */

            private int rid;
            private String position;
            private String timestart;
            private String timeend;

            public int getRid() {
                return rid;
            }

            public void setRid(int rid) {
                this.rid = rid;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getTimestart() {
                return timestart;
            }

            public void setTimestart(String timestart) {
                this.timestart = timestart;
            }

            public String getTimeend() {
                return timeend;
            }

            public void setTimeend(String timeend) {
                this.timeend = timeend;
            }
        }
}
