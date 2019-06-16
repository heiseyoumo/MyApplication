package com.fancy.myapplication;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.fancy.myapplication.presenter.GirdPresenter;
import com.fancy.myapplication.view.GirdView;

import java.util.List;

/**
 * @author pengkuanwang
 * @date 2019-06-16
 */
public class DemoActivity extends AbstractBaseActivity<GirdView, GirdPresenter> implements GirdView {
    @Override
    public void initData() {
        presenter.fetch();
        super.initData();
    }

    @Override
    public int getContentViewResId() {
        return R.layout.demo;
    }

    @Override
    protected GirdPresenter createPresenter() {
        return new GirdPresenter();
    }

    @Override
    public void showGirls(final List<String> list) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(DemoActivity.this, "list.size():" + list.size(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public static void launch(Context context) {
        Intent intent = new Intent(context, DemoActivity.class);
        context.startActivity(intent);
    }
}
