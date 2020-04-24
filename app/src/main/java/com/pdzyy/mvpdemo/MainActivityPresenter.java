package com.pdzyy.mvpdemo;

import com.pdzyy.mvpdemo.mvp.base.BaseMvpPresenter;
import com.pdzyy.mvpdemo.mvp.IMainActivityContract;

public class MainActivityPresenter extends BaseMvpPresenter<IMainActivityContract.IView> implements IMainActivityContract.IPresenter{

    public MainActivityPresenter(IMainActivityContract.IView iMvpView) {
        super(iMvpView);
    }

    @Override
    public void initPresenter() {
        getView().sayHello("hello mainActivity");
    }

    @Override
    protected IMainActivityContract.IView getEmptyView() {
        return IMainActivityContract.mIEmptyView;
    }

}
