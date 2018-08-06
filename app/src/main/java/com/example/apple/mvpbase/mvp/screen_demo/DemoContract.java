package com.example.apple.mvpbase.mvp.screen_demo;

import com.example.apple.mvpbase.mvp.BasePresenter;
import com.example.apple.mvpbase.mvp.BaseView;
import com.example.apple.mvpbase.mvp.model.User;


public class DemoContract {

    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {

    }
}
