package org.hades.wonder.sample;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.hades.wonder.framework.view.RootFragment;
import org.hades.wonder.sample.bean.UserBean;


/**
 * Created by Hades on 2017/9/22.
 */

public class TestFragment extends RootFragment {
    private TextView text;
    TestViewModel testViewModel;
    private EditText edit;
    private Button fetch;
    private Button updata;


    public TestFragment() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fg_test;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        text = (TextView) view.findViewById(R.id.text);
        edit = (EditText) view.findViewById(R.id.edit);

        fetch = (Button) view.findViewById(R.id.fetch);
        updata = (Button) view.findViewById(R.id.updata);

    }

    UserBean mUserBean;
    @Override
    protected void subScribUI(Bundle savedInstanceState) {
        //实现订阅 绑定数据
        testViewModel = ViewModelProviders.of(getActivity()).get(TestViewModel.class);

        testViewModel.loadMore().observe(this, new Observer<UserBean>() {
            @Override
            public void onChanged(@Nullable UserBean userBean) {
                mUserBean = userBean;
                onResponse(userBean);

            }
        });

        testViewModel.fetchData().observe(this, new Observer<UserBean>() {
            @Override
            public void onChanged(@Nullable UserBean userBean) {
                mUserBean = userBean;
                onResponse(userBean);
            }
        });

    }

    @Override
    protected void onSuccess() {
        //追加数据
        text.setText(mUserBean.data.getUser_nick_name()+mUserBean.data.getUser_id());
    }

    @Override
    protected void onFaild() {

    }

    @Override
    protected void onError() {
        Toast.makeText(getContext(), "onError", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {
        edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
//                testViewModel.setString(edit.getText().toString());
            }
        });

        fetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testViewModel.fetchData();
            }
        });

        updata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testViewModel.loadMore();
            }
        });


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
