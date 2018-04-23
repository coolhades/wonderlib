package org.hades.wonder.framework.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.hades.wonder.framework.bean.ResponseStatusBean;

/**
 * Created by Hades on 2017/9/22.
 */

public abstract class RootFragment extends Fragment {
    protected Activity mActivity;
    protected View mRootView;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mActivity = (Activity) context;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView=inflater.inflate(getLayoutId(), container, false);
        initView(mRootView, savedInstanceState);
        return mRootView;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        subScribUI(savedInstanceState);

        initData();
        initEvent();
    }

    protected abstract int getLayoutId();
    //绑定ui
    protected abstract void initView(View view, Bundle savedInstanceState);
    protected abstract void initData();
    protected abstract void initEvent();
    /**
     * 创建时间 2017/9/22
     * author Hades
     * 描述 注册LiveData观察者 处理数据
     **/
    protected abstract void subScribUI(Bundle savedInstanceState);

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
