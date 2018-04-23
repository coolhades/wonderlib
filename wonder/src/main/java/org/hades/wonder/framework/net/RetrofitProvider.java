package org.hades.wonder.framework.net;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Hades on 2017/11/2.
 */
@Module
public class RetrofitProvider {

    @Singleton
    @Provides
    Retrofit provideRetrofit(RetrofitConfig config, final OkHttpClient okHttpClient){
        return new Retrofit.Builder()
                .baseUrl(config.baseUrl())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }
}
