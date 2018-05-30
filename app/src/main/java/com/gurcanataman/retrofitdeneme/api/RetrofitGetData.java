package com.gurcanataman.retrofitdeneme.api;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by gurcanataman on 28.11.2017.
 */

public interface RetrofitGetData {

    @GET("latest")
    Call<ResponseModel[]> getLatest();


}
