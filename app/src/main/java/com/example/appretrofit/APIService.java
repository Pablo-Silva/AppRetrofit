package com.example.appretrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {

    @POST("/post")
    @FormUrlEncoded
    Call<Filme> savePost(@Field("titulo") String titulo,
                         @Field("duracao") String duracao,
                         @Field("genero") String genero);
}
