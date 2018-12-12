package com.pcassem.www.huaweithyj.http;

import com.pcassem.www.huaweithyj.entity.DeviceEntity;
import com.pcassem.www.huaweithyj.entity.FaultDetailsEntity;
import com.pcassem.www.huaweithyj.entity.FaultEntity;
import com.pcassem.www.huaweithyj.entity.ProductDetailsEntity;
import com.pcassem.www.huaweithyj.entity.ProductEntity;
import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.entity.ServiceEntity;
import com.pcassem.www.huaweithyj.entity.SignInDetailsEntity;
import com.pcassem.www.huaweithyj.entity.SigninEntity;
import com.pcassem.www.huaweithyj.entity.UserEntity;
import com.pcassem.www.huaweithyj.work.SignInActivity;


import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

public interface WorkAPI {

    //获取已完成列表
    @GET("/app/work/completed")
    Observable<ResultEntity<ServiceEntity>> completedList(@Query("userid") String userid, @Query("page_index") int page_index, @Query("page_size") int page_size);

    //获取待完成服务列表
    @GET("/app/work/completing")
    Observable<ResultEntity<ServiceEntity>> completingList(@Query("userid") String userid, @Query("page_index") int page_index, @Query("page_size") int page_size);

    //获取产品列表
    @GET("/app/work/productlist")
    Observable<ResultEntity<ProductEntity>> productList(@Query("page_index") int page_index, @Query("page_size") int page_size);

    //获取产品详情
    @GET("/app/work/productdetails")
    Observable<ResultEntity<ProductDetailsEntity>> productDetails(@Query("pid") String pid);

    //获取设备列表
    @GET("/app/work/devicelist")
    Observable<ResultEntity<DeviceEntity>> deviceList(@Query("page_index") int page_index, @Query("page_size") int page_size);

    //获取故障列表
    @GET("/app/work/faultlist")
    Observable<ResultEntity<FaultEntity>> faultList(@Query("eid") String eid, @Query("page_index") int page_index, @Query("page_size") int page_size);

    //获取故障详情
    @GET("/app/work/faultdetails")
    Observable<ResultEntity<FaultDetailsEntity>> faultDetails(@Query("fid") String fid);

    //签到列表
    @GET("/app/work/signin")
    Observable<ResultEntity<SigninEntity>> signInList(@Query("userid") String userid, @Query("page_index") int page_index, @Query("page_size") int page_size);

    //加班列表
    @GET("/app/work/overtime")
    Observable<ResultEntity<SigninEntity>> overtimeList(@Query("userid") String userid, @Query("page_index") int page_index, @Query("page_size") int page_size);

    //考勤详情
    @GET("/app/work/attendancedetails")
    Observable<ResultEntity<SignInDetailsEntity>> signInDetails(@Query("rid") String rid);

    //考勤签到提交
    @FormUrlEncoded
    @POST("/app/work/addsignin")
    Observable<ResultEntity> addSignIn(@Field("userid") String userid, @Field("type") int type, @Field("timestart") String timestart, @Field("position") String position);

    //考勤签退提交
    @FormUrlEncoded
    @POST("/app/work/addsigout")
    Observable<ResultEntity> addSignOut(@Field("userid") String userid, @Field("rid") String rid, @Field("timeend") String timeend);

    //搜索已完成服务
    @GET("/app/work/searchcompleted")
    Observable<ResultEntity<ServiceEntity>> searchCompleted(@Query("userid") String userid, @Query("company") String company, @Query("page_index") int page_index, @Query("page_size") int page_size);

    //搜索待完成服务
    @GET("/app/work/searchcompleting")
    Observable<ResultEntity<ServiceEntity>> searchCompleting(@Query("userid") String userid, @Query("company") String company, @Query("page_index") int page_index, @Query("page_size") int page_size);

    //搜索产品
    @GET("/app/work/searchproductlist")
    Observable<ResultEntity<ProductEntity>> searchProduct(@Query("categories") String categories, @Query("page_index") int page_index, @Query("page_size") int page_size);

    //搜索设备
    @GET("/app/work/searchdevicelist")
    Observable<ResultEntity<DeviceEntity>> searchDevice(@Query("code") String code, @Query("page_index") int page_index, @Query("page_size") int page_size);

}
