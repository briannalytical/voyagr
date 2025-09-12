package com.briannalytical.Voyagr.Models;

import java.math.BigDecimal;

public class Activity extends Expense {

    private String activityName;
    private BigDecimal activityCost;

    public Activity(String activityName, BigDecimal activityCost) {
        this.activityName = activityName;
        this.activityCost = activityCost;
    }

    public String getActivityName() {
        return activityName;
    }
    public BigDecimal getActivityCost() {
        return activityCost;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }
    public void setActivityCost(BigDecimal activityCost) {
        this.activityCost = activityCost;
    }
}
