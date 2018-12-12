package com.pcassem.www.huaweithyj.work.presenter;


import android.widget.Toast;

import com.pcassem.www.huaweithyj.entity.NewsEntity;
import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.entity.ServiceEntity;
import com.pcassem.www.huaweithyj.news.presenter.Presenter;
import com.pcassem.www.huaweithyj.work.model.WorkData;
import com.pcassem.www.huaweithyj.work.view.ServiceView;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

public class ServicePresenter implements Presenter {

    private WorkData data;
    private CompositeSubscription compositeSubscription;

    private ServiceView serviceView;
    private ResultEntity<ServiceEntity> completedEntity;
    private ResultEntity<ServiceEntity> completingEntity;


    public ServicePresenter(ServiceView serviceView) {
        this.serviceView = serviceView;
    }

    public void getCompletedList(String userid, int page_index, int page_size) {
        compositeSubscription.add(data.completedList(userid, page_index, page_size)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResultEntity<ServiceEntity>>() {
                    @Override
                    public void onCompleted() {
                        serviceView.onSuccess(completedEntity);
                    }

                    @Override
                    public void onError(Throwable e) {
                        serviceView.onError();
                    }

                    @Override
                    public void onNext(ResultEntity<ServiceEntity> listDataBeanResultEntity) {
                        completedEntity = listDataBeanResultEntity;
                    }
                }));
    }

    public void getCompletingList(String userid, int page_index, int page_size) {
        compositeSubscription.add(data.completingList(userid, page_index, page_size)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResultEntity<ServiceEntity>>() {
                    @Override
                    public void onCompleted() {
                        serviceView.onSuccess(completingEntity);
                    }

                    @Override
                    public void onError(Throwable e) {
                        serviceView.onError();
                    }

                    @Override
                    public void onNext(ResultEntity<ServiceEntity> listDataBeanResultEntity) {
                        completingEntity = listDataBeanResultEntity;
                    }
                }));
    }

    public void getSearchCompleted(String userid, String company, int page_index, int page_size) {
        compositeSubscription.add(data.searchCompleted(userid, company, page_index, page_size)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResultEntity<ServiceEntity>>() {
                    @Override
                    public void onCompleted() {
                        serviceView.onSuccess(completedEntity);
                    }

                    @Override
                    public void onError(Throwable e) {
                        serviceView.onError();
                        System.out.println("--------------"+e);
                    }

                    @Override
                    public void onNext(ResultEntity<ServiceEntity> serviceEntityResultEntity) {
                        completedEntity = serviceEntityResultEntity;
                    }
                }));
    }

    public void getSearchCompleting(String userid, String company, int page_index, int page_size) {
        compositeSubscription.add(data.searchCompleting(userid, company, page_index, page_size)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResultEntity<ServiceEntity>>() {
                    @Override
                    public void onCompleted() {
                        serviceView.onSuccess(completingEntity);
                    }

                    @Override
                    public void onError(Throwable e) {
                        serviceView.onError();
                    }

                    @Override
                    public void onNext(ResultEntity<ServiceEntity> serviceEntityResultEntity) {
                        completingEntity = serviceEntityResultEntity;
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
