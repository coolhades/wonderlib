package org.hades.wonder.sample.constants;

import org.hades.wonder.sample.bean.UserBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Hades on 2017/10/30.
 */

public class ApiService {

    //增加一个参数
//    is_academy = 1 院校版
//    is_academy = 0 企业版
    public interface NewLoginApi {
        @FormUrlEncoded
        @POST("useract/login")
        Observable<UserBean> login(@Field("account") String account,
                                             @Field("passwd") String passwd,
                                             @Field("is_academy") int is_academy,
                                             @Field("model") String model
        );
    }

}
