package org.hades.wonder.sample;

import android.arch.lifecycle.MutableLiveData;

import org.hades.wonder.framework.constants.ResponseStatus;
import org.hades.wonder.sample.bean.UserBean;
import org.hades.wonder.sample.constants.ApiService;
import org.hades.wonder.sample.http.RetrofitManager;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Hades on 2017/10/30.
 */

class TestRepository {
    MutableLiveData<UserBean> stringLiveData = new MutableLiveData<>();

    @Inject
    public TestRepository() {

    }

    MutableLiveData<UserBean> login() {
        RetrofitManager.getInstance().createService(ApiService.NewLoginApi.class)
                .login("13880001004", "123456", 0, "direct")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<UserBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(UserBean value) {
                        stringLiveData.postValue(value);
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        UserBean userBean = new UserBean();
                        userBean.setStatus(ResponseStatus.onError);
                        stringLiveData.postValue(userBean);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
        return stringLiveData;
    }


}
