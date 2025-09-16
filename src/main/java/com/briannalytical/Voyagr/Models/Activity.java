package com.briannalytical.Voyagr.Models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Activity extends Expense {

    private String activityName;
    private BigDecimal activityCost;
    private String activityReservationInfo;
    private LocalTime startTime;
    private LocalTime endTime;

    public Activity(String activityName, BigDecimal activityCost, String activityReservationInfo, LocalTime startTime, LocalTime endTime) {
        this.activityName = activityName;
        this.activityCost = activityCost;
        this.activityReservationInfo = activityReservationInfo;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Activity(BigDecimal amount, LocalDateTime date, String description, User user, Trip trip, String activityName, BigDecimal activityCost, String activityReservationInfo, LocalTime startTime, LocalTime endTime) {
        super(amount, date, description, user, trip);
        this.activityName = activityName;
        this.activityCost = activityCost;
        this.activityReservationInfo = activityReservationInfo;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getActivityName() {
        return activityName;
    }
    public BigDecimal getActivityCost() {
        return activityCost;
    }
    public String getActivityReservationInfo() {return activityReservationInfo;}
    public LocalTime getStartTime() {return startTime;}
    public LocalTime getEndTime() {return endTime;}

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }
    public void setActivityCost(BigDecimal activityCost) {
        this.activityCost = activityCost;
    }
    public void setActivityReservationInfo(String activityReservationInfo){this.activityReservationInfo = activityReservationInfo;}
    public void setStartTime(LocalTime startTime) {this.startTime = startTime;}
    public void getEndTime(LocalTime endTime) {this.endTime = endTime;}


    public boolean hasCompleteTimeInfo() {
        return startTime != null && endTime != null;
    }
    public boolean overlapsWith(Activity otherActivity) {
        // First check if activities are on the same date
        if (!this.getDate().toLocalDate().equals(otherActivity.getDate().toLocalDate())) {
            return false; // Different dates can't overlap
        }
        if (this.startTime == null || otherActivity.startTime == null) {
            return false; // Can't check overlap without start times
        }
        LocalTime thisEnd = (this.endTime != null) ? this.endTime : this.startTime.plusHours(1); // assume 1 hour if no end time
        LocalTime otherEnd = (otherActivity.endTime != null) ? otherActivity.endTime : otherActivity.startTime.plusHours(1);
        // Check for overlap: activities overlap if one starts before the other ends
        return this.startTime.isBefore(otherEnd) && thisEnd.isAfter(otherActivity.startTime);
    }
}
