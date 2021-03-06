package com.example.apple.mvpbase.mvp.screen_demo;

import com.example.apple.mvpbase.data.DataSource;
import com.example.apple.mvpbase.data.Repository;
import com.example.apple.mvpbase.mvp.model.User;


public class DemoPresenter implements DemoContract.Presenter {

    private Repository mRepository = null;
    private DemoContract.View mView = null;

    private DemoPresenter() {
    }

    public DemoPresenter(Repository repository, DemoContract.View view) {

        mRepository = repository;
        mView = view;

        mView.setPresenter(this);
    }

}
