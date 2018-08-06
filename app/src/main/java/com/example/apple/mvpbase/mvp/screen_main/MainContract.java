package com.example.apple.mvpbase.mvp.screen_main;

import com.example.apple.mvpbase.mvp.BasePresenter;
import com.example.apple.mvpbase.mvp.BaseView;


public class MainContract {

    interface View extends BaseView<Presenter> {


    }

    interface Presenter extends BasePresenter {

    }
}
