package com.fancy.myapplication;

import android.os.Bundle;

import com.fancy.myapplication.presenter.BasePresenter;

/**
 * @author pengkuanwang
 * @date 2019-06-16
 */
public abstract class AbstractBaseActivity<V, P extends BasePresenter<V>> extends BaseActivity {
    P presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        presenter = createPresenter();
        presenter.attachView((V) this);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    /**
     * 创建一个presenter
     *
     * @return 创建一个presenter
     */
    protected abstract P createPresenter();
}
