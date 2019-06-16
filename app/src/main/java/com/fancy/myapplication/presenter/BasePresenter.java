package com.fancy.myapplication.presenter;

import java.lang.ref.WeakReference;

/**
 * @author pengkuanwang
 * @date 2019-06-16
 */
public class BasePresenter<V> {
    WeakReference<V> weakReference;

    public void attachView(V girdView) {
        weakReference = new WeakReference<>(girdView);
    }

    public void detachView() {
        weakReference.clear();
        weakReference = null;
    }

    public V getView() {
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
