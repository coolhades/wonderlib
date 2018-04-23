package org.hades.wonder.sample.components;

import org.hades.wonder.framework.net.NetProvider;
import org.hades.wonder.framework.net.RetrofitProvider;
import org.hades.wonder.sample.http.RetrofitManager;
import org.hades.wonder.sample.module.RetrofitConfigProvider;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Hades on 2017/11/2.
 */
@Singleton
@Component(modules = {RetrofitProvider.class, NetProvider.class, RetrofitConfigProvider.class})
public interface RetrofitComponent {
    void inject(RetrofitManager retrofitManager);
}
