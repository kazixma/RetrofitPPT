package com.example.spectre.retrofitppt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.spectre.retrofitppt.api.PPTHTTPService;
import com.example.spectre.retrofitppt.model.Something;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app test  = (app) getApplicationContext();
        test.getService().getStation(new PPTHTTPService.OnResponseCallback<Something>() {
            @Override
            public void onResponse(boolean success, Throwable error, Something data, String errorString) {
                if(success){
                    Log.d("BEST22","success");
                }else{
                    Log.d("BEST22","fail");

                }
            }
        });
    }
}
