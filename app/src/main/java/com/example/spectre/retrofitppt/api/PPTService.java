package com.example.spectre.retrofitppt.api;

import com.example.spectre.retrofitppt.model.Something;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Spectre on 5/17/2017.
 */

public interface PPTService {
    //    @GET("EForm/GetMyTask?")
//    Call<String> getStation(@Query("stepType") String stepType,
//                                               @Query("empCode") int empCode,
//                                               @Query("intMonth") int Month,
//                                               @Query("intYear") int Year);
    @GET("EForm/GetInfoWork?")
    Call<Something> getStation(@Query("HeaderID") int empCode,
                               @Query("ObjectID") int Month
    );

}
