package org.hades.wonder.sample;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestFragment testFragment = new TestFragment();
        PlusOneFragment plusOneFragment = new PlusOneFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction
                .add(R.id.root, testFragment)
                .show(testFragment)
                .add(R.id.plus, plusOneFragment)
                .show(plusOneFragment)
                .commitAllowingStateLoss();

    }




}
