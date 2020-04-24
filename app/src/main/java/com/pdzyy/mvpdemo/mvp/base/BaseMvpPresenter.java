package com.pdzyy.mvpdemo.mvp.base;

import android.os.Bundle;
import android.util.Log;

import com.pdzyy.mvpdemo.mvp.IMvpView;
import com.pdzyy.mvpdemo.mvp.presenter.LifeCycleMvpPresenter;

public abstract class BaseMvpPresenter<T extends IMvpView> extends LifeCycleMvpPresenter<T> {

    public BaseMvpPresenter(T iMvpView) {
        super(iMvpView);
    }

    @Override
    public void onCreate() {
        Log.e("BaseMvpPresenter","onCreate");
    }

    @Override
    public void onDestroy() {
        Log.e("BaseMvpPresenter","onDestroy");

    }

}
