package com.fancy.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/**
 * @author pengkuanwang
 * @date 2019-06-16
 */
public abstract class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        initData();
    }

    /**
     * 初始化数据
     */
    public void initData() {

    }

    public View getContentView() {
        int layoutResID = getContentViewResId();
        return LayoutInflater.from(this).inflate(layoutResID, null);
    }

    /**
     * 获取资源id
     *
     * @return 资源id
     */
    public abstract int getContentViewResId();
}
