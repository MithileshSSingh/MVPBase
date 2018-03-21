package com.example.apple.mvpbase.mvp.screen_demo;

import com.example.apple.mvpbase.mvp.BasePresenter;
import com.example.apple.mvpbase.mvp.BaseView;
import com.example.apple.mvpbase.mvp.model.User;

/**
 * Created by apple on 30/10/17.
 */

public class DemoContract {

    interface View extends BaseView<Presenter> {

        void loginSuccess(User user);

        void loginFailed(int errorCode, String errorMessage);

    }

    interface Presenter extends BasePresenter {
        void login(
                String email,
                String password);

    }
}
