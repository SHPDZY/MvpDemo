package com.pdzyy.mvpdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.pdzyy.mvpdemo.mvp.IMainActivityContract;
import com.pdzyy.mvpdemo.mvp.base.BaseActivity;

public class MainActivity extends BaseActivity implements IMainActivityContract.IView{

    private IMainActivityContract.IPresenter mActivityPresenter;
    private TextView mTvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initPresenter();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setData();
    }

    private void initView() {
        mTvText = (TextView) findViewById(R.id.tv_text);
    }

    private void initPresenter() {
        mActivityPresenter = new MainActivityPresenter(this);
    }

    private void setData() {
        mActivityPresenter.initPresenter();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void sayHello(String msg) {
        mTvText.setText(msg);
    }
}
