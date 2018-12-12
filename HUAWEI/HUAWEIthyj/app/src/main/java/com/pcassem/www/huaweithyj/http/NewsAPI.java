package com.pcassem.www.huaweithyj.http;

import com.pcassem.www.huaweithyj.entity.NewsDetailsEntity;
import com.pcassem.www.huaweithyj.entity.NewsEntity;
import com.pcassem.www.huaweithyj.entity.ResultEntity;


import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface NewsAPI {

    //获取消息列表
    @GET("/app/news/newslist")
    Observable<ResultEntity<NewsEntity>> newsList(@Query("userid") String userid, @Query("page_index") int page_index, @Query("page_size") int page_size);

    //消息详情
    @GET("/app/news/details")
    Observable<ResultEntity<NewsDetailsEntity>> newsDetails(@Query("seid") String seid);

    //搜索消息
    @GET("/app/news/searchnews")
    Observable<ResultEntity<NewsEntity>> searchNewsList(@Query("userid") String userid, @Query("company") String company, @Query("page_index") int page_index, @Query("page_size") int page_size);
}
