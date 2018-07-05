package com.example.apple.mvpbase.mvp;

public interface BaseView<T> {
    void setPresenter(T presenter);

    void showLoading(String title, String message);
}
