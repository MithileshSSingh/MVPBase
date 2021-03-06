package com.example.apple.mvpbase.data.remote;

import android.content.Context;

import com.example.apple.mvpbase.data.DataSource;

public class RemoteDataSource implements DataSource {


    private static RemoteDataSource INSTANCE = null;

    private Context mContext;

    private RemoteDataSource() {

    }

    private RemoteDataSource(Context context) {
        mContext = context;
    }

    public static RemoteDataSource getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new RemoteDataSource(context);
        }

        return INSTANCE;
    }
}
