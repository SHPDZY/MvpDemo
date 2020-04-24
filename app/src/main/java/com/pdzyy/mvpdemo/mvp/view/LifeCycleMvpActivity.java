package com.pdzyy.mvpdemo.mvp.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.pdzyy.mvpdemo.mvp.IMvpView;
import com.pdzyy.mvpdemo.mvp.MvpController;

public class LifeCycleMvpActivity extends AppCompatActivity implements IMvpView {

    private MvpController mMvpController;

    @Override
    public MvpController getMvpController() {
        if (mMvpController == null) {
            mMvpController = new MvpController();
        }
        return mMvpController;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MvpController mvpController = getMvpController();
        if(mvpController!=null){
            mvpController.onCreate();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MvpController mvpController = getMvpController();
        if(mvpController!=null){
            mvpController.onDestroy();
        }
    }
}
