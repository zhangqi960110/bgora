package com.pcassem.www.huaweithyj.http;

import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.entity.UserEntity;


import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

public interface PersonalAPI {

    //登录
    @FormUrlEncoded
    @POST("/web/login/getLoginData")
    Observable<ResultEntity<UserEntity>> login(@Field("username") String username, @Field("password") String password);

    //注销
    @FormUrlEncoded
    @POST("/web/login/logOut")
    Observable<ResultEntity> logOut(@Field("userid") String userid);

    //修改密码
    @FormUrlEncoded
    @POST("/app/personal/change")
    Observable<ResultEntity> changePassword(@Field("userid") String userid, @Field("password") String password);
}
