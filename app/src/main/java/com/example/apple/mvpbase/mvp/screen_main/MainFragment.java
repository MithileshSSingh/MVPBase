package com.example.apple.mvpbase.mvp.screen_main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apple.mvpbase.R;
import com.example.apple.mvpbase.mvp.BaseFragment;
import com.example.apple.mvpbase.mvp.model.User;

/**
 * Created by apple on 30/10/17.
 */

public class MainFragment extends BaseFragment implements MainContract.View {

    public static final String TAG = MainFragment.class.getSimpleName();

    private MainContract.Presenter mPresenter;
    private User data;

    public MainFragment() {
    }

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.login, container, false);
        setHasOptionsMenu(true);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        init();
    }

    @Override
    protected void init() {
        initView();
        initMembers();
        initListeners();
        initData();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initMembers() {

    }

    @Override
    protected void initListeners() {

    }

    @Override
    protected void initData() {

    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showLoading(String title, String message) {

    }

    @Override
    public void loginSuccess(User user) {

    }

    @Override
    public void loginFailed(int errorCode, String errorMessage) {

    }
}
