package com.example.apple.mvpbase.data;

import com.example.apple.mvpbase.mvp.model.User;

/**
 * Created by mithilesh on 8/17/16.
 */
public interface DataSource {

    interface LoginCallBack {
        void success(User user);

        void failed(int errorCode, String msgError);
    }

    void login(
            String email,
            String password,
            LoginCallBack callBack);
}
