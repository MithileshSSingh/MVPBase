package com.example.apple.mvpbase.data.remote;

import com.example.apple.mvpbase.mvp.model.User;

import retrofit.Call;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by mithilesh on 8/22/16.
 */
public class ApiClient {

    public static class ServiceType {
        public static final String BASE_URL = "";

        public static final String LOGIN = BASE_URL + "";
    }

    public static class HttpErrorCode {
        public static final Integer NO_CODE = 000;
        public static final Integer LOGIN_FAILED = 401;
    }

    public interface APICalls {
        @FormUrlEncoded
        @POST(ServiceType.LOGIN)
        Call<User> login(
                @Field("email") String email,
                @Field("password") String password);

    }

}
