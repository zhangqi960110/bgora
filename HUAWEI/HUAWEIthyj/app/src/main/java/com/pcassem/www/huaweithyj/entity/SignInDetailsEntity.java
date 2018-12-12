package com.pcassem.www.huaweithyj.entity;

public class SignInDetailsEntity extends BaseEntity {

        /**
         * rid : 1
         * position : 长沙xxx
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
