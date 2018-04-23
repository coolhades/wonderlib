package org.hades.wonder.sample.http;


import org.hades.wonder.sample.components.DaggerRetrofitComponent;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class RetrofitManager {
    @Inject
    Retrofit retrofit;

    private RetrofitManager() {
        DaggerRetrofitComponent.create().inject(this);
    }

    private static class SingletonInstance {
        private static final RetrofitManager INSTANCE = new RetrofitManager();
    }

    public static RetrofitManager getInstance() {
        return SingletonInstance.INSTANCE;
    }

    public  <S> S createService(Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }
}