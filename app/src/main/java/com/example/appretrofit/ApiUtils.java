package com.example.appretrofit;

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "https://spring-boot-api-exemple.herokuapp.com/filmes/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
