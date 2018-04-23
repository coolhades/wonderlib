package org.hades.wonder.sample;


import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.hades.wonder.framework.view.RootFragment;


/**
 * A fragment with a Google +1 button.
 */
public class PlusOneFragment extends RootFragment {
    TestViewModel testViewModel;

    private Button button;

    public PlusOneFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_plus_one;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected void subScribUI(Bundle savedInstanceState) {
        testViewModel = ViewModelProviders.of(getActivity()).get(TestViewModel.class);
        getLifecycle().addObserver(new MyLifeCycleObserver("sssss"));

    }

    @Override
    protected void onSuccess() {

    }

    @Override
    protected void onFaild() {

    }

    @Override
    protected void onError() {

    }

    @Override
    public void onResume() {
        super.onResume();
    }



}
