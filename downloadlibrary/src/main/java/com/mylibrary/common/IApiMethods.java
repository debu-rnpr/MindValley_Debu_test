package com.mylibrary.common;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by debu on 11/11/16.
 */
public interface IApiMethods<T> {
    @GET
    Call<ResponseBody> fetchResponse(@Url String url);
}
