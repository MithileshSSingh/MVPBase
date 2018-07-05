package com.example.apple.mvpbase.mvp.screen_login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apple.mvpbase.R;
import com.example.apple.mvpbase.di.RepositoryInjector;
import com.example.apple.mvpbase.mvp.BaseFragment;
import com.example.apple.mvpbase.mvp.model.User;


public class LoginFragment extends BaseFragment implements LoginContract.View {

    public static final String TAG = LoginFragment.class.getSimpleName();

    private LoginContract.Presenter mPresenter;
    private User data;

    public LoginFragment() {
    }

    public static LoginFragment newInstance() {
        return new LoginFragment();
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
        mPresenter = new LoginPresenter(
                RepositoryInjector.provideRepository(getContext()), this
        );

    }

    @Override
    protected void initListeners() {

    }

    @Override
    protected void initData() {
        mPresenter.login(
                "",
                ""
        );
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
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
