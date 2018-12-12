package com.pcassem.www.huaweithyj.work.model;

import com.pcassem.www.huaweithyj.entity.DeviceEntity;
import com.pcassem.www.huaweithyj.entity.FaultDetailsEntity;
import com.pcassem.www.huaweithyj.entity.FaultEntity;
import com.pcassem.www.huaweithyj.entity.ProductDetailsEntity;
import com.pcassem.www.huaweithyj.entity.ProductEntity;
import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.entity.ServiceEntity;
import com.pcassem.www.huaweithyj.entity.SignInDetailsEntity;
import com.pcassem.www.huaweithyj.entity.SigninEntity;
import com.pcassem.www.huaweithyj.http.RetrofitHelper;
import com.pcassem.www.huaweithyj.http.WorkAPI;
import com.pcassem.www.huaweithyj.work.SignInActivity;


import retrofit2.http.Field;
import retrofit2.http.Query;
import rx.Observable;


public class WorkData {

    private WorkAPI workAPI;

    public WorkData() {
        this.workAPI = RetrofitHelper.getInstance().getWorkAPI();
    }

    public Observable<ResultEntity<ServiceEntity>> completedList(String userid, int page_index, int page_size) {
        return workAPI.completedList(userid, page_index, page_size);
    }

    public Observable<ResultEntity<ServiceEntity>> completingList(String userid, int page_index, int page_size) {
        return workAPI.completingList(userid, page_index, page_size);
    }

    public Observable<ResultEntity<ProductEntity>> productList(int page_index, int page_size) {
        return workAPI.productList(page_index, page_size);
    }

    public Observable<ResultEntity<ProductDetailsEntity>> productDetails(String pid) {
        return workAPI.productDetails(pid);
    }

    public Observable<ResultEntity<DeviceEntity>> deviceList(int page_index, int page_size) {
        return workAPI.deviceList(page_index, page_size);
    }

    public Observable<ResultEntity<FaultEntity>> faultList(String eid, int page_index, int page_size) {
        return workAPI.faultList(eid, page_index, page_size);
    }

    public Observable<ResultEntity<FaultDetailsEntity>> faultDetails(String fid) {
        return workAPI.faultDetails(fid);
    }

    public Observable<ResultEntity<SigninEntity>> signInList(String userid, int page_index, int page_size) {
        return workAPI.signInList(userid, page_index, page_size);
    }

    public Observable<ResultEntity<SigninEntity>> overtimeList(String userid, int page_index, int page_size) {
        return workAPI.overtimeList(userid, page_index, page_size);
    }

    public Observable<ResultEntity<SignInDetailsEntity>> signInDetails(String rid) {
        return workAPI.signInDetails(rid);
    }

    public Observable<ResultEntity> addSignIn(String userid, int type, String timestart, String position) {
        return workAPI.addSignIn(userid, type, timestart, position);
    }

    public Observable<ResultEntity> addSignOut(String userid, String rid, String timeend) {
        return workAPI.addSignOut(userid, rid, timeend);
    }

    public Observable<ResultEntity<ServiceEntity>> searchCompleted(String userid, String company, int page_index, int page_size) {
        return workAPI.searchCompleted(userid, company, page_index, page_size);
    }

    public Observable<ResultEntity<ServiceEntity>> searchCompleting(String userid, String company, int page_index, int page_size) {
        return workAPI.searchCompleting(userid, company, page_index, page_size);
    }

    public Observable<ResultEntity<ProductEntity>> searchProduct(String categories, int page_index, int page_size) {
        return workAPI.searchProduct(categories, page_index, page_size);
    }

    public Observable<ResultEntity<DeviceEntity>> searchDevice(String code, int page_index, int page_size) {
        return workAPI.searchDevice(code, page_index, page_size);
    }

}
