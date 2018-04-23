package org.hades.wonder.framework.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import org.hades.wonder.framework.bean.ResponseStatusBean;
import org.hades.wonder.framework.utils.AppStatusManager;


/**
 * Created by Hades on 2017/9/21.
 */
public abstract class RootActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        checkStatus(savedInstanceState);
    }

    protected void checkStatus(Bundle savedInstanceState) {
        switch(AppStatusManager.getInstance().getAppStatus()) {
            case -1:
                this.restartApp(savedInstanceState);
                break;
            case 2:
                this.initView(savedInstanceState);
        }
    }

    private void initView(Bundle savedInstanceState){
        setContentView(getLayoutId());
        initData();
        initEvent();
        this.subScribeUI(savedInstanceState);
    }

    protected abstract int getLayoutId();
    protected abstract void initData();
    protected abstract void initEvent();
    /**
    * 创建时间 2017/9/22
    * author Hades
    * 描述 注册LiveData观察者
    **/
    protected abstract void subScribeUI(Bundle savedInstanceState);

    /**
    * 创建时间 2017/9/22
    * author Hades
    * 描述 重启app接口
    **/
    protected abstract void restartApp(Bundle savedInstanceState);

    /**
    * 创建时间 2017/11/1
    * author Hades
    * 描述 ViewModel返回数据后调用
    **/
    protected void onResponse(ResponseStatusBean responseStatusBean){
        if (1 == responseStatusBean.status){
            onSuccess();
        }else if (0 == responseStatusBean.status){
            onFaild();
        }else {
            onError();
        }
    }
    protected abstract void onSuccess();
    protected abstract void onFaild();
    protected abstract void onError();
}
