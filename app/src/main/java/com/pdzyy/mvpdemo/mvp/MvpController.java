package com.pdzyy.mvpdemo.mvp;

import android.os.Bundle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MvpController implements ILifeCycle {

    private Set<ILifeCycle> mLifeCycles = new HashSet<>();

    public void savePresenter(ILifeCycle lifeCycle) {
        mLifeCycles.add(lifeCycle);
    }

    @Override
    public void onCreate() {
        Iterator<ILifeCycle> iterator = mLifeCycles.iterator();
        while (iterator.hasNext()) {
            ILifeCycle next = iterator.next();
            next.onCreate();
        }
    }

    @Override
    public void onDestroy() {

    }

}
