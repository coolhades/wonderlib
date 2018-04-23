package org.hades.wonder.framework.net;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by Hades on 2017/10/30.
 */
@Module
public class NetProvider {

    @Singleton
    @Provides
    HttpLoggingInterceptor getLoggingInterceptor(){
        return new HttpLoggingInterceptor();
    }

    @Singleton
    @Provides
    OkHttpClient getOkHttpClient(HttpLoggingInterceptor loggingInterceptor){
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient().newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)//设置超时时间
                .readTimeout(10, TimeUnit.SECONDS)//设置读取超时时间
                .writeTimeout(10, TimeUnit.SECONDS)//设置写入超时时间
                .addInterceptor(loggingInterceptor)
                .build();

    }



}
