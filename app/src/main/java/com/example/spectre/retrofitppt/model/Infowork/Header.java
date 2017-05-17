package com.example.spectre.retrofitppt.model.Infowork;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Spectre on 5/17/2017.
 */

public class Header{
    @SerializedName("header_id")
    private int HeaderID;
    @SerializedName("name")
    private String name;
    @SerializedName("group")
    private String group;
}
