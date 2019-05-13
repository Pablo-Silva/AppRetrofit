package com.example.appretrofit;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @POST("post")
//    @Headers({"Accept: application/json", "Content-Type: application/json"})
//    @FormUrlEncoded
    Call<Void> savePost(@Body RequestBody filme);
}
