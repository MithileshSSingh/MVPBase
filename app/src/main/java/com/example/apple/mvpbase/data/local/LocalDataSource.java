package com.example.apple.mvpbase.data.local;

import android.content.Context;

import com.example.apple.mvpbase.data.DataSource;

public class LocalDataSource implements DataSource {

    private static LocalDataSource INSTANCE = null;

    private Context mContext;

    private LocalDataSource() {

    }

    private LocalDataSource(Context context) {
        mContext = context;
    }

    public static LocalDataSource getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new LocalDataSource(context);
        }

        return INSTANCE;
    }
}
