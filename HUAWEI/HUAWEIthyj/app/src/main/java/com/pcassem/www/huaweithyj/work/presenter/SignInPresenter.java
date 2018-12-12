package com.pcassem.www.huaweithyj.work.presenter;

import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.entity.SignInDetailsEntity;
import com.pcassem.www.huaweithyj.entity.SigninEntity;
import com.pcassem.www.huaweithyj.news.presenter.Presenter;
import com.pcassem.www.huaweithyj.work.model.WorkData;
import com.pcassem.www.huaweithyj.work.view.SignInView;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

public class SignInPresenter implements Presenter {

    private WorkData data;
    private CompositeSubscription compositeSubscription;
    private ResultEntity<SigninEntity> signinEntity;
    private ResultEntity<SigninEntity> overtimeEntity;
    private ResultEntity<SignInDetailsEntity> signInDetailsEntity;


    private SignInView signInView;

    public SignInPresenter(SignInView signInView) {
        this.signInView = signInView;
    }

    public void getSignList(String userid, int page_index, int page_size) {
        compositeSubscription.add(data.signInList(userid, page_index, page_size)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResultEntity<SigninEntity>>() {
                    @Override
                    public void onCompleted() {
                        signInView.onSuccess(signinEntity);
                    }

                    @Override
                    public void onError(Throwable e) {
                        signInView.onError();
                    }

                    @Override
                    public void onNext(ResultEntity<SigninEntity> signinEntityResultEntity) {
                        signinEntity = signinEntityResultEntity;
                    }
                }));
    }

    public void getOvertimeList(String userid, int page_index, int page_size){
        compositeSubscription.add(data.overtimeList(userid,page_index,page_size)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Observer<ResultEntity<SigninEntity>>() {
            @Override
            public void onCompleted() {
                signInView.onSuccess(overtimeEntity);
            }

            @Override
            public void onError(Throwable e) {
                signInView.onError();
            }

            @Override
            public void onNext(ResultEntity<SigninEntity> signinEntityResultEntity) {
                overtimeEntity = signinEntityResultEntity;
            }
        }));
    }

    public void getSignInDetails(String rid){
        compositeSubscription.add(data.signInDetails(rid)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Observer<ResultEntity<SignInDetailsEntity>>() {
            @Override
            public void onCompleted() {
                signInView.onSuccessDetails(signInDetailsEntity);
            }

            @Override
            public void onError(Throwable e) {
                signInView.onError();
            }

            @Override
            public void onNext(ResultEntity<SignInDetailsEntity> signInDetailsEntityResultEntity) {
                signInDetailsEntity = signInDetailsEntityResultEntity;
            }
        }));
    }

    @Override
    public void onCreate() {
        data = new WorkData();
        compositeSubscription = new CompositeSubscription();
    }

    @Override
    public void onStop() {
        if (compositeSubscription.hasSubscriptions()) {
            compositeSubscription.unsubscribe();
        }
    }
}
