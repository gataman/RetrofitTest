package com.gurcanataman.retrofitdeneme.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by gurcanataman on 27.11.2017.
 */

public class ApiClient {


    public static Retrofit retrofit=null;
    public static String BASE_URL = "https://www.doviz.com/api/v1/currencies/all/";



    public static Retrofit getApiClient(){
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        if(retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }


}
