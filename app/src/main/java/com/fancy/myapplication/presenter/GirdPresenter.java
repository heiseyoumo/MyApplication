package com.fancy.myapplication.presenter;

import com.fancy.myapplication.model.GirdModeImpl;
import com.fancy.myapplication.model.GirdModel;
import com.fancy.myapplication.view.GirdView;

import java.util.List;

/**
 * @author pengkuanwang
 * @date 2019-06-16
 */
public class GirdPresenter extends BasePresenter<GirdView> {
    GirdModel girdModel = new GirdModeImpl();

    public void fetch() {
        girdModel.showGirl(new GirdModel.GirdOnLoadListener() {
            @Override
            public void onComplete(List<String> list) {
                getView().showGirls(list);
            }
        });
    }
}
