package com.fancy.myapplication.model;

import java.util.List;

/**
 * @author pengkuanwang
 * @date 2019-06-16
 */
public interface GirdModel {
    void showGirl(GirdOnLoadListener listener);

    interface GirdOnLoadListener {
        /**
         * 获取数据源成功回调
         *
         * @param list 数据源
         */
        void onComplete(List<String> list);
    }
}
