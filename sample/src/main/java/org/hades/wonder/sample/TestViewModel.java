package org.hades.wonder.sample;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import org.hades.wonder.framework.viewmodel.RootViewModel;
import org.hades.wonder.sample.bean.UserBean;
import org.hades.wonder.sample.components.DaggerTestComponent;

import javax.inject.Inject;

/**
 * Created by Hades on 2017/9/25.
 */

public class TestViewModel extends RootViewModel {

    MutableLiveData<UserBean> liveData = new MutableLiveData<>();

    @Inject
    TestModel model;

    public TestViewModel() {
        DaggerTestComponent.create().inject(this);
    }

    public LiveData<UserBean> getData(){
        return liveData;
    }

    public void setString(String string){

    }

    public LiveData<UserBean> fetchData(){
        liveData = model.fetchData();
        return liveData;
    }

    public LiveData<UserBean> loadMore(){
        liveData = model.loadMore();
        return liveData;
    }

}
