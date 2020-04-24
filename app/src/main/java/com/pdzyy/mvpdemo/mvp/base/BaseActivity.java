package com.pdzyy.mvpdemo.mvp.base;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.pdzyy.mvpdemo.mvp.view.LifeCycleMvpActivity;

public abstract class BaseActivity extends LifeCycleMvpActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
