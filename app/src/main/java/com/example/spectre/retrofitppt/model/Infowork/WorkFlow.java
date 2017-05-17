package com.example.spectre.retrofitppt.model.Infowork;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Spectre on 5/17/2017.
 */

public class WorkFlow{
    @SerializedName("workflow_id")
    private int WorkflowID;
    @SerializedName("StatusName")
    private String statusName;
}
