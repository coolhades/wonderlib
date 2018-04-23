package org.hades.wonder.sample.module;

import org.hades.wonder.framework.net.RetrofitConfig;
import org.hades.wonder.sample.constants.ApiUrl;

/**
 * Created by Hades on 2017/11/2.
 */

public class BaseUrl extends RetrofitConfig {
    @Override
    public String baseUrl() {
        return ApiUrl.url;
    }
}
