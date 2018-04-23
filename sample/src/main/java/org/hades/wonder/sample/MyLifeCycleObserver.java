package org.hades.wonder.sample;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;


/**
 * Created by Hades on 2017/925.
 * LifecycleObserver java7 use annotation
 * once in java8 use DefaultLifeCycleObserver
 */

public class MyLifeCycleObserver implements LifecycleObserver {

    String string;
    public MyLifeCycleObserver(String data) {
        this.string = data;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void onResumed(){
        Log.d("MyLifeCycleObserver", "onResumed string=" + string);
    }

}
