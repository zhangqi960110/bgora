package com.pcassem.www.huaweithyj.personal.model;

import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.entity.UserEntity;
import com.pcassem.www.huaweithyj.http.PersonalAPI;
import com.pcassem.www.huaweithyj.http.RetrofitHelper;

import rx.Observable;


public class PersonalData {

    private PersonalAPI personalAPI;

    public PersonalData(){
        this.personalAPI = RetrofitHelper.getInstance().getPersonalAPI();
    }

    //登陆
    public Observable<ResultEntity<UserEntity>> login(String username, String password){
        return personalAPI.login(username,password);
    }

    //退出登陆
    public Observable<ResultEntity> logOut(String userid){
        return personalAPI.logOut(userid);
    }

    //修改密码
    public Observable<ResultEntity> changePassword(String userid, String password){
        return personalAPI.changePassword(userid,password);
    }

}
