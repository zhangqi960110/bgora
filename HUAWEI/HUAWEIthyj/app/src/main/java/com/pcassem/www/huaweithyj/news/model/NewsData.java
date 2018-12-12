package com.pcassem.www.huaweithyj.news.model;

import com.pcassem.www.huaweithyj.entity.NewsDetailsEntity;
import com.pcassem.www.huaweithyj.entity.NewsEntity;
import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.http.NewsAPI;
import com.pcassem.www.huaweithyj.http.RetrofitHelper;

import rx.Observable;

public class NewsData {

    private NewsAPI newsAPI;

    public NewsData(){
        this.newsAPI = RetrofitHelper.getInstance().getNewsAPI();
    }


    //获取消息列表
    public Observable<ResultEntity<NewsEntity>> newsList(String userid, int page_index, int page_size){
        return newsAPI.newsList(userid, page_index, page_size);
    }

    //获取消息详情
    public Observable<ResultEntity<NewsDetailsEntity>> newsDetails(String seid){
        return newsAPI.newsDetails(seid);
    }

    //搜索消息
    public Observable<ResultEntity<NewsEntity>> searchNewsList(String userid, String company, int page_index, int page_size){
        return newsAPI.searchNewsList(userid,company,page_index,page_size);
    }

}
