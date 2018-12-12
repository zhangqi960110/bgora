package com.pcassem.www.huaweithyj.news.presenter;

import com.pcassem.www.huaweithyj.entity.NewsDetailsEntity;
import com.pcassem.www.huaweithyj.entity.NewsEntity;
import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.news.model.NewsData;
import com.pcassem.www.huaweithyj.news.view.NewsView;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

public class NewsPresenter implements Presenter {


    private NewsData data;
    private CompositeSubscription compositeSubscription;

    private NewsView newsView;
    private ResultEntity<NewsEntity> newsEntity;

    private ResultEntity<NewsDetailsEntity> newsDetailsEntity;


    public NewsPresenter(NewsView newsView) {
        this.newsView = newsView;
    }


    public void getNewsList(String userid, int page_index, int page_size) {
        compositeSubscription.add(data.newsList(userid, page_index, page_size)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResultEntity<NewsEntity>>() {
                    @Override
                    public void onCompleted() {
                        newsView.onSuccess(newsEntity);
                    }

                    @Override
                    public void onError(Throwable e) {
                        newsView.onError();

                    }

                    @Override
                    public void onNext(ResultEntity<NewsEntity> newsEntityResultEntity) {
                        newsEntity = newsEntityResultEntity;
                    }
                }));
    }

    public void getSearchNewsList(String userid, String company, int page_index, int page_size) {
        compositeSubscription.add(data.searchNewsList(userid, company, page_index, page_size)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResultEntity<NewsEntity>>() {
                    @Override
                    public void onCompleted() {
                        newsView.onSuccess(newsEntity);
                    }

                    @Override
                    public void onError(Throwable e) {
                        newsView.onError();
                    }

                    @Override
                    public void onNext(ResultEntity<NewsEntity> newsEntityResultEntity) {
                        newsEntity = newsEntityResultEntity;
                    }
                }));
    }

    public void getNewsDetails(String seid) {
        compositeSubscription.add(data.newsDetails(seid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResultEntity<NewsDetailsEntity>>() {
                    @Override
                    public void onCompleted() {
                        newsView.onSuccessDetails(newsDetailsEntity);
                    }

                    @Override
                    public void onError(Throwable e) {
                        newsView.onError();
                    }

                    @Override
                    public void onNext(ResultEntity<NewsDetailsEntity> newsDetailsEntityResultEntity) {
                        newsDetailsEntity = newsDetailsEntityResultEntity;
                    }
                }));
    }

    @Override
    public void onCreate() {
        data = new NewsData();
        compositeSubscription = new CompositeSubscription();
    }

    @Override
    public void onStop() {

        if (compositeSubscription.hasSubscriptions()) {
            compositeSubscription.unsubscribe();
        }
    }
}
