package com.pcassem.www.huaweithyj.news.view;


import com.pcassem.www.huaweithyj.entity.NewsDetailsEntity;
import com.pcassem.www.huaweithyj.entity.NewsEntity;
import com.pcassem.www.huaweithyj.entity.ResultEntity;

public interface NewsView {

    void onSuccessDetails(ResultEntity<NewsDetailsEntity> newsDetailsEntity);

    void onSuccess(ResultEntity<NewsEntity> newsEntity);

    void onError();
}
