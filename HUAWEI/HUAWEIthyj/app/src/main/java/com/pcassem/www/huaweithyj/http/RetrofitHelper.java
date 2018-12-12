package com.pcassem.www.huaweithyj.http;

import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHelper {

    OkHttpClient client = new OkHttpClient();
    GsonConverterFactory factory = GsonConverterFactory.create(new GsonBuilder().create());

    private static RetrofitHelper instance = null;
    private Retrofit mRetrofit = null;

    public static RetrofitHelper getInstance(){
        if (instance == null){
            instance = new RetrofitHelper();
        }
        return instance;
    }

    public RetrofitHelper(){
        initRetrofit();
    }

    private void initRetrofit(){
        mRetrofit = new Retrofit.Builder()
                .baseUrl("http://47.107.83.137:8080/")
                .client(client)
                .addConverterFactory(factory)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    public NewsAPI getNewsAPI(){
        return mRetrofit.create(NewsAPI.class);
    }

    public WorkAPI getWorkAPI(){
        return mRetrofit.create(WorkAPI.class);
    }

    public PersonalAPI getPersonalAPI(){
        return mRetrofit.create(PersonalAPI.class);
    }
}
