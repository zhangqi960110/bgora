package com.pcassem.www.huaweithyj.work.presenter;

import com.pcassem.www.huaweithyj.entity.DeviceEntity;
import com.pcassem.www.huaweithyj.entity.FaultDetailsEntity;
import com.pcassem.www.huaweithyj.entity.FaultEntity;
import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.news.presenter.Presenter;
import com.pcassem.www.huaweithyj.work.CompletedActivity;
import com.pcassem.www.huaweithyj.work.model.WorkData;
import com.pcassem.www.huaweithyj.work.view.FaultView;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

public class FaultPresenter implements Presenter {

    private WorkData data;
    private CompositeSubscription compositeSubscription;

    private FaultView faultView;
    private ResultEntity<DeviceEntity> deviceEntity;
    private ResultEntity<FaultEntity> faultEntity;
    private ResultEntity<FaultDetailsEntity> faultDetails;

    public FaultPresenter(FaultView faultView){
        this.faultView = faultView;
    }

    public void getDeviceList(int page_index, int page_size) {
        compositeSubscription.add(data.deviceList(page_index,page_size)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Observer<ResultEntity<DeviceEntity>>() {
            @Override
            public void onCompleted() {
                faultView.onDevice(deviceEntity);
            }

            @Override
            public void onError(Throwable e) {
                faultView.onError();
            }

            @Override
            public void onNext(ResultEntity<DeviceEntity> deviceEntityResultEntity) {
                deviceEntity = deviceEntityResultEntity;
            }
        }));
    }

    public void getSearchDevice(String code, int page_index, int page_size) {
        compositeSubscription.add(data.searchDevice(code,page_index,page_size)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResultEntity<DeviceEntity>>() {
                    @Override
                    public void onCompleted() {
                        faultView.onDevice(deviceEntity);
                    }

                    @Override
                    public void onError(Throwable e) {
                        faultView.onError();
                    }

                    @Override
                    public void onNext(ResultEntity<DeviceEntity> deviceEntityResultEntity) {
                        deviceEntity = deviceEntityResultEntity;
                    }
                }));
    }

    public void getFaultList(String eid,int page_index, int page_size){
        compositeSubscription.add(data.faultList(eid,page_index,page_size)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Observer<ResultEntity<FaultEntity>>() {
            @Override
            public void onCompleted() {
                faultView.onFault(faultEntity);
            }

            @Override
            public void onError(Throwable e) {
                faultView.onError();
            }

            @Override
            public void onNext(ResultEntity<FaultEntity> faultEntityResultEntity) {
                faultEntity = faultEntityResultEntity;
            }
        }));
    }

    public void getFaultDetails(String fid){
        compositeSubscription.add(data.faultDetails(fid)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Observer<ResultEntity<FaultDetailsEntity>>() {
            @Override
            public void onCompleted() {
                faultView.onFaultDetails(faultDetails);
            }

            @Override
            public void onError(Throwable e) {
                faultView.onError();
            }

            @Override
            public void onNext(ResultEntity<FaultDetailsEntity> faultDetailsEntityResultEntity) {
                faultDetails = faultDetailsEntityResultEntity;
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
        if (compositeSubscription.hasSubscriptions()){
            compositeSubscription.unsubscribe();
        }
    }
}
