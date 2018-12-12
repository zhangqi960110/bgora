package com.pcassem.www.huaweithyj.work.presenter;

import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.news.presenter.Presenter;
import com.pcassem.www.huaweithyj.work.model.WorkData;
import com.pcassem.www.huaweithyj.work.view.PunchInView;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

public class PunchInPresenter implements Presenter {

    private WorkData data;
    private CompositeSubscription compositeSubscription;

    private PunchInView punchInView;
    private ResultEntity resultEntity;

    public PunchInPresenter(PunchInView punchInView){
        this.punchInView = punchInView;
    }

    public void addSignIn(String userid, int type, String timestart, String position){
        compositeSubscription.add(data.addSignIn(userid,type,timestart,position)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Observer<ResultEntity>() {
            @Override
            public void onCompleted() {
                punchInView.onSign(resultEntity);
            }

            @Override
            public void onError(Throwable e) {
                punchInView.onError();
            }

            @Override
            public void onNext(ResultEntity resultEntity1) {
                resultEntity = resultEntity1;
            }
        }));
    }

    public void addSignOut(String userid, String rid, String timeend){
        compositeSubscription.add(data.addSignOut(userid,rid,timeend)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Observer<ResultEntity>() {
            @Override
            public void onCompleted() {
                punchInView.onSign(resultEntity);
            }

            @Override
            public void onError(Throwable e) {
                punchInView.onError();
            }

            @Override
            public void onNext(ResultEntity resultEntity1) {
                resultEntity = resultEntity1;
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
