package org.hades.wonder.sample.module;

import org.hades.wonder.framework.net.RetrofitConfig;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Hades on 2017/11/2.
 */
@Module
public class RetrofitConfigProvider {

    @Provides
    RetrofitConfig providerBaseUrl(){
        return new BaseUrl();
    }
}
