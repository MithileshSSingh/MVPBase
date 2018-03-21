package com.example.apple.mvpbase.mvp.screen_demo;

import com.example.apple.mvpbase.data.DataSource;
import com.example.apple.mvpbase.data.Repository;
import com.example.apple.mvpbase.mvp.model.User;

/**
 * Created by apple on 30/10/17.
 */

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


    @Override
    public void login(
            String email,
            String password) {

        mRepository.login(
                email,
                password,
                new DataSource.LoginCallBack() {
                    @Override
                    public void success(User user) {
                        mView.loginSuccess(user);
                    }

                    @Override
                    public void failed(int errorCode, String msgError) {
                        mView.loginFailed(errorCode, msgError);
                    }
                }
        );
    }
}
