package com.pcassem.www.huaweithyj.entity;

import com.google.gson.annotations.SerializedName;

public class ResultEntity<T> extends BaseEntity {


    /**
     * status : success
     * result : {"username":"zhangqi","role":"staff","userid":2,"token":"6e8mbt0m5og3rr1mi4pofgv3pk"}
     * errorMsg :
     * successMsg : 登录成功
     */

    @SerializedName("status")
    private String status;
    @SerializedName("result")
    private T result;
    @SerializedName("errorMsg")
    private String errorMsg;
    @SerializedName("successsMsg")
    private String successMsg;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getSuccessMsg() {
        return successMsg;
    }

    public void setSuccessMsg(String successMsg) {
        this.successMsg = successMsg;
    }

}
