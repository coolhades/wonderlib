package org.hades.wonder.sample;

import android.arch.lifecycle.MutableLiveData;

import org.hades.wonder.framework.model.RootModel;
import org.hades.wonder.sample.bean.UserBean;

import javax.inject.Inject;

/**
 * Created by Hades on 2017/10/30.
 */

public class TestModel implements RootModel {


    TestRepository testRepository;

    //Dagger2 依赖注入 Repository
    @Inject
    public TestModel(TestRepository repository) {
        this.testRepository = repository;
    }

    public MutableLiveData<UserBean> fetchData(){
        return testRepository.login();
    }

    public MutableLiveData<UserBean> loadMore(){
        return testRepository.login();
    }
}
