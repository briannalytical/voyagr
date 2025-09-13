package com.briannalytical.Voyagr.Models;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.time.temporal.ChronoUnit;

public class Days {

    private LocalDate beginDate;
    private LocalDate endDate;
    private List<LocalDate> individualDate;

    public Days(LocalDate beginDate, LocalDate endDate, List<LocalDate> individualDate) {
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.individualDate = individualDate;
    }

    public LocalDate getBeginDate() {return beginDate;}
    public LocalDate getEndDate() {return endDate;}
    public List<LocalDate> getIndividualDate() {return individualDate;}

    public void setBeginDate(LocalDate beginDate) {this.beginDate = beginDate;}
    public void setEndDate(LocalDate endDate) {this.endDate = endDate;}
    public void setIndividualDate(List<LocalDate> individualDate) {this.individualDate = individualDate;}

    public int getTotalDays() {
        return (int) ChronoUnit.DAYS.between(beginDate, endDate) + 1;
    }
}


