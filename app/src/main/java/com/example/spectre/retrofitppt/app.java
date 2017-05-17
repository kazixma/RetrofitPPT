package com.example.spectre.retrofitppt;

import android.app.Application;

import com.example.spectre.retrofitppt.api.PPTHTTPService;

/**
 * Created by Spectre on 5/17/2017.
 */

public class app extends Application {

    private PPTHTTPService service;
    @Override
    public void onCreate() {
        super.onCreate();
        service = new PPTHTTPService();
    }

    public PPTHTTPService getService() {
        return service;
    }

    public void setService(PPTHTTPService service) {
        this.service = service;
    }
}
