package com.briannalytical.Voyagr.Models;
import java.math.BigDecimal;
import java.time.LocalDate;

public class DailyBudget {
    private Trip trip;
    private LocalDate date;
    private BigDecimal budgetAmount;

    public DailyBudget(Trip trip, LocalDate date, BigDecimal budgetAmount) {
        this.trip = trip;
        this.date = date;
        this.budgetAmount = budgetAmount;
    }

    public Trip getTrip() {
        return trip;
    }
    public LocalDate getDate() {
        return date;
    }
    public BigDecimal getBudgetAmount() {
        return budgetAmount;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setBudgetAmount(BigDecimal budgetAmount) {
        this.budgetAmount = budgetAmount;
    }
}
