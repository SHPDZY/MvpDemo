package com.pdzyy.mvpdemo.mvp.presenter;

import com.pdzyy.mvpdemo.mvp.ILifeCycle;
import com.pdzyy.mvpdemo.mvp.IMvpView;
import com.pdzyy.mvpdemo.mvp.MvpController;

import java.lang.ref.WeakReference;

public abstract class LifeCycleMvpPresenter<T extends IMvpView> implements ILifeCycle {

    private WeakReference<T> weakReference;

    public LifeCycleMvpPresenter(T iMvpView) {
        if (weakReference == null) {
            weakReference = new WeakReference<T>(iMvpView);
        } else {
            T view = weakReference.get();
            if (view != iMvpView) {
                weakReference = new WeakReference<T>(iMvpView);
            }
        }
        MvpController mvpController = iMvpView.getMvpController();
        mvpController.savePresenter(this);
    }

    protected T getView() {
        if (weakReference != null) {
            T view = weakReference.get();
            if (view != null) {
                return view;
            }
        }
        return getEmptyView();

    }

    protected abstract T getEmptyView();


}
