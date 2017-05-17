package com.example.spectre.retrofitppt.model;

/**
 * Created by Spectre on 5/17/2017.
 */

public class StationDetail {
    String FL_Code;
    String FL_Name;
    String FunctionName;
    int Area_ID;
    String AreaDescription;
    String UnitName;
    String GroupName;
    String SubGroupName;
    String FullLink;
    String statusShow;
    int percentShow;


    public String getFL_Code() {
        return FL_Code;
    }

    public void setFL_Code(String FL_Code) {
        this.FL_Code = FL_Code;
    }

    public String getFL_Name() {
        return FL_Name;
    }

    public void setFL_Name(String FL_Name) {
        this.FL_Name = FL_Name;
    }

    public String getFunctionName() {
        return FunctionName;
    }

    public void setFunctionName(String functionName) {
        FunctionName = functionName;
    }

    public int getArea_ID() {
        return Area_ID;
    }

    public void setArea_ID(int area_ID) {
        Area_ID = area_ID;
    }

    public String getAreaDescription() {
        return AreaDescription;
    }

    public void setAreaDescription(String areaDescription) {
        AreaDescription = areaDescription;
    }

    public String getUnitName() {
        return UnitName;
    }

    public void setUnitName(String unitName) {
        UnitName = unitName;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public String getSubGroupName() {
        return SubGroupName;
    }

    public void setSubGroupName(String subGroupName) {
        SubGroupName = subGroupName;
    }

    public String getFullLink() {
        return FullLink;
    }

    public void setFullLink(String fullLink) {
        FullLink = fullLink;
    }

    public String getStatusShow() {
        return statusShow;
    }

    public void setStatusShow(String statusShow) {
        this.statusShow = statusShow;
    }

    public int getPercentShow() {
        return percentShow;
    }

    public void setPercentShow(int percentShow) {
        this.percentShow = percentShow;
    }
}
