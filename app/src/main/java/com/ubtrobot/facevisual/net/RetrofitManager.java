package com.ubtrobot.facevisual.net;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @auther tangedegushi
 * @creat 2020/8/13
 * @Decribe
 */
public class RetrofitManager {

    private static final String url = "https://iai.tencentcloudapi.com/";
    private final Retrofit retrofit;

    public static RetrofitManager get(){
        return RetrofitInstance.getInstance();
    }

    private RetrofitManager() {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync())
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }

    public <T>T createService(Class<T> c){
        return retrofit.create(c);
    }

    private static class RetrofitInstance{
        static final RetrofitManager manager = new RetrofitManager();
        static RetrofitManager getInstance(){
            return manager;
        }
    }

}
