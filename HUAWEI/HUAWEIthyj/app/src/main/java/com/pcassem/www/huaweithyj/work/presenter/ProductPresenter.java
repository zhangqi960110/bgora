package com.pcassem.www.huaweithyj.work.presenter;

import com.pcassem.www.huaweithyj.entity.ProductDetailsEntity;
import com.pcassem.www.huaweithyj.entity.ProductEntity;
import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.news.presenter.Presenter;
import com.pcassem.www.huaweithyj.work.model.WorkData;
import com.pcassem.www.huaweithyj.work.view.ProductView;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

public class ProductPresenter implements Presenter {

    private WorkData data;
    private CompositeSubscription compositeSubscription;

    private ProductView productView;
    private ResultEntity<ProductEntity> productEntity;
    private ResultEntity<ProductDetailsEntity> productDetailsEntity;

    public ProductPresenter(ProductView productView){
        this.productView = productView;
    }

    public void getProductList(int page_index, int page_size){
        compositeSubscription.add(data.productList(page_index,page_size)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Observer<ResultEntity<ProductEntity>>() {
            @Override
            public void onCompleted() {
                productView.onSuccess(productEntity);
            }

            @Override
            public void onError(Throwable e) {
                productView.onError();
            }

            @Override
            public void onNext(ResultEntity<ProductEntity> productEntityResultEntity) {
                productEntity = productEntityResultEntity;
            }
        }));
    }

    public void getSearchProduct(String categories,int page_index, int page_size){
        compositeSubscription.add(data.searchProduct(categories,page_index,page_size)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResultEntity<ProductEntity>>() {
                    @Override
                    public void onCompleted() {
                        productView.onSuccess(productEntity);
                    }

                    @Override
                    public void onError(Throwable e) {
                        productView.onError();
                    }

                    @Override
                    public void onNext(ResultEntity<ProductEntity> productEntityResultEntity) {
                        productEntity = productEntityResultEntity;
                    }
                }));
    }

    public void getProductDetails(String pid){
        compositeSubscription.add(data.productDetails(pid)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Observer<ResultEntity<ProductDetailsEntity>>() {
            @Override
            public void onCompleted() {
                productView.onSuccessDetails(productDetailsEntity);
            }

            @Override
            public void onError(Throwable e) {
                productView.onError();
            }

            @Override
            public void onNext(ResultEntity<ProductDetailsEntity> productDetailsEntityResultEntity) {
                productDetailsEntity = productDetailsEntityResultEntity;
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
