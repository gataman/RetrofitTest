package com.gurcanataman.retrofitdeneme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;
import com.gurcanataman.retrofitdeneme.api.ApiClient;
import com.gurcanataman.retrofitdeneme.api.ResponseModel;
import com.gurcanataman.retrofitdeneme.api.RetrofitGetData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Verileri almak için interface yardımıyla istek yolluyoruz:

        RetrofitGetData retrofitGetData = ApiClient.getApiClient().create(RetrofitGetData.class);
        Call<ResponseModel[]> call = retrofitGetData.getLatest();

        // Gelen cevabı parse ediyoruz:
        call.enqueue(new Callback<ResponseModel[]>() {
            @Override
            public void onResponse(Call<ResponseModel[]> call, Response<ResponseModel[]> response) {
                if (response.body()!=null){
                    Log.e("GELEN JSON", ""+new Gson().toJson(response.body()));
                    for (ResponseModel model: response.body()){
                        Log.e("Currency Name",""+model.getFullName());
                    }

                }


            }

            @Override
            public void onFailure(Call<ResponseModel[]> call, Throwable t) {
                Log.e("HATA", ""+t.getLocalizedMessage());


            }
        });




    }
}
