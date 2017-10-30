package com.example.apple.mvpbase.di;

import android.content.Context;

import com.example.apple.mvpbase.data.Repository;
import com.example.apple.mvpbase.data.local.LocalDataSource;
import com.example.apple.mvpbase.data.remote.RemoteDataSource;

/**
 * Created by mithilesh on 9/4/16.
 */
public class RepositoryInjector {

    public static Repository provideRepository(Context context) {
        return Repository.getInstance(
                LocalDataSource.getInstance(context),
                RemoteDataSource.getInstance(context)
        );
    }
}
