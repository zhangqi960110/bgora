package com.pcassem.www.huaweithyj.personal.presenter;

import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.entity.UserEntity;
import com.pcassem.www.huaweithyj.news.presenter.Presenter;
import com.pcassem.www.huaweithyj.personal.model.PersonalData;
import com.pcassem.www.huaweithyj.personal.view.PersonalView;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

public class PersonalPresenter implements Presenter {

    private PersonalView personalView;
    private PersonalData data;
    private CompositeSubscription compositeSubscription;

    private ResultEntity<UserEntity> userEntity;

    private ResultEntity resultEntity;


    public PersonalPresenter(PersonalView personalView){
        this.personalView = personalView;
    }

    public void login(String username, String password){
        compositeSubscription.add(data.login(username, password)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Observer<ResultEntity<UserEntity>>() {
            @Override
            public void onCompleted() {
                personalView.onSuccess(userEntity);
            }

            @Override
            public void onError(Throwable e) {
                personalView.onError();
            }

            @Override
            public void onNext(ResultEntity<UserEntity> userEntityResultEntity) {
                userEntity = userEntityResultEntity;
            }
        }));
    }

    public void loginOut(String userid){
        compositeSubscription.add(data.logOut(userid)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Observer<ResultEntity>() {
            @Override
            public void onCompleted() {
                personalView.onSuccessOut(resultEntity);
            }

            @Override
            public void onError(Throwable e) {
                personalView.onError();
            }

            @Override
            public void onNext(ResultEntity resultEntity1) {
                resultEntity = resultEntity1;
            }
        }));
    }

    public void changePassword(String userid, String password){
        compositeSubscription.add(data.changePassword(userid,password)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Observer<ResultEntity>() {
            @Override
            public void onCompleted() {
                personalView.onSuccess(resultEntity);
            }

            @Override
            public void onError(Throwable e) {
                personalView.onError();
            }

            @Override
            public void onNext(ResultEntity resultEntity1) {
                resultEntity = resultEntity1;
            }
        }));
    }


    @Override
    public void onCreate() {
        data = new PersonalData();
        compositeSubscription = new CompositeSubscription();
    }

    @Override
    public void onStop() {
        if (compositeSubscription.hasSubscriptions()) {
            compositeSubscription.unsubscribe();
        }
    }
}
