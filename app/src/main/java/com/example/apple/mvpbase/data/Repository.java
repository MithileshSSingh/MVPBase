package com.example.apple.mvpbase.data;

import com.example.apple.mvpbase.mvp.model.User;

public class Repository implements DataSource {


    private static Repository INSTANCE = null;

    private DataSource mLocalDataSource = null;
    private DataSource mRemoteDataSource = null;

    private Repository() {

    }

    private Repository(DataSource localDataSource, DataSource remoteDataSource) {
        mLocalDataSource = localDataSource;
        mRemoteDataSource = remoteDataSource;
    }

    public static Repository getInstance(DataSource localDataSource, DataSource remoteDataSource) {

        if (INSTANCE == null) {
            INSTANCE = new Repository(localDataSource, remoteDataSource);
        }

        return INSTANCE;
    }

    @Override
    public void login(
            final String email,
            final String password,
            LoginCallBack callBack) {

        mLocalDataSource.login(
                email,
                password,
                new LoginCallBack() {
                    @Override
                    public void success(User user) {
                        if (user == null) {

                            mRemoteDataSource.login(
                                    email,
                                    password,
                                    new LoginCallBack() {
                                        @Override
                                        public void success(User user) {

                                        }

                                        @Override
                                        public void failed(int errorCode, String msgError) {

                                        }
                                    }
                            );


                        }
                    }

                    @Override
                    public void failed(int errorCode, String msgError) {

                        mRemoteDataSource.login(
                                email,
                                password,
                                new LoginCallBack() {
                                    @Override
                                    public void success(User user) {

                                    }

                                    @Override
                                    public void failed(int errorCode, String msgError) {

                                    }
                                }
                        );


                    }
                }
        );
    }
}