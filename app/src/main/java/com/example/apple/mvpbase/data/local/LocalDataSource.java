package com.example.apple.mvpbase.data.local;

import android.content.Context;

import com.example.apple.mvpbase.data.DataSource;
import com.example.apple.mvpbase.mvp.model.User;

public class LocalDataSource implements DataSource {
    private static LocalDataSource ourInstance = new LocalDataSource();

    public static LocalDataSource getInstance(Context context) {
        return ourInstance;
    }

    private LocalDataSource() {
    }

    @Override
    public void login(
            String email,
            String password,
            LoginCallBack callBack) {

        callBack.success(new User());
    }
}
