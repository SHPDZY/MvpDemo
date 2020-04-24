package com.pdzyy.mvpdemo.mvp;

public interface IMainActivityContract {

    interface IView extends IMvpView {
        void sayHello(String msg);
    }

    interface IPresenter extends ILifeCycle {
        void initPresenter();
    }

    IView mIEmptyView = new IView() {
        @Override
        public void sayHello(String msg) {

        }

        @Override
        public MvpController getMvpController() {
            return null;
        }
    };
}
