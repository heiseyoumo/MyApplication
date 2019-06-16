package com.fancy.myapplication.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengkuanwang
 * @date 2019-06-16
 */
public class GirdModeImpl implements GirdModel {
    List<String> list = new ArrayList<>();

    public GirdModeImpl() {
        for (int i = 0; i < 8; i++) {
            list.add("item" + i);
        }
    }

    @Override
    public void showGirl(final GirdOnLoadListener listener) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    listener.onComplete(list);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        ).start();
    }
}
