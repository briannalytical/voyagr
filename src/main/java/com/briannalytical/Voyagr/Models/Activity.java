package com.briannalytical.Voyagr.Models;

import java.math.BigDecimal;

public class Activity extends Expense {

    private String activityName;
    private BigDecimal activityCost;
    private String activityReservationInfo;

    public Activity() {}

    public Activity(String activityName, BigDecimal activityCost, String activityReservationInfo) {
        super();
        this.activityName = activityName;
        this.activityCost = activityCost;
        this.activityReservationInfo = activityReservationInfo;
    }

    public String getActivityName() {
        return activityName;
    }
    public BigDecimal getActivityCost() {
        return activityCost;
    }
    public String getActivityReservationInfo() {return activityReservationInfo;}

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }
    public void setActivityCost(BigDecimal activityCost) {
        this.activityCost = activityCost;
    }
    public void setActivityReservationInfo(String activityReservationInfo){this.activityReservationInfo = activityReservationInfo;}
}
