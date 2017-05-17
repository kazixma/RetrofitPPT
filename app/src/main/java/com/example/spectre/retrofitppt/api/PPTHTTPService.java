package com.example.spectre.retrofitppt.api;

import android.util.Log;

import com.example.spectre.retrofitppt.api.deserializer.SomethingDeserializer;
import com.example.spectre.retrofitppt.model.Something;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Spectre on 5/17/2017.
 */

public class PPTHTTPService {
    public interface OnResponseCallback<T> {
        void onResponse(boolean success, Throwable error, T data, String errorString);
    }

    private static final String BASE_URL = "http://212.83.180.212/ifixapi/api/";
    private PPTService service;



    public PPTHTTPService(){

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(createGsonConverter())
                .baseUrl(BASE_URL)
                .build();

        service = retrofit.create(PPTService.class);
    }

    public void getStation(final OnResponseCallback<Something> callBack) {
        Call<Something> callStation = this.service.getStation(1,0);


        callStation.enqueue(new Callback<Something>() {
            @Override
            public void onResponse(Call<Something> call, Response<Something> response) {
                Log.d("BEST22",response.body()+"");
                callBack.onResponse(response.isSuccessful(), null, response.body(), "");
            }

            @Override
            public void onFailure(Call<Something> call, Throwable t) {
                Log.d("BEST22",t.getLocalizedMessage());
                callBack.onResponse(false, t, null, "Not found");
            }
        });

    }

    private Converter.Factory createGsonConverter() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Something.class, new SomethingDeserializer());

        Gson gson = gsonBuilder.create();
        return GsonConverterFactory.create(gson);
    }

}
