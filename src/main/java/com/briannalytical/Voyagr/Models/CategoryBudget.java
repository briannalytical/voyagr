package com.briannalytical.Voyagr.Models;

import java.math.BigDecimal;

public class CategoryBudget {
    private Trip trip;
    private String categoryName;
    private BigDecimal budgetAmount;

    public CategoryBudget(Trip trip, String categoryName, BigDecimal budgetAmount) {
        this.trip = trip;
        this.categoryName = categoryName;
        this.budgetAmount = budgetAmount;
    }

    public Trip getTrip() {
        return trip;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public BigDecimal getBudgetAmount() {
        return budgetAmount;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public void setBudgetAmount(BigDecimal budgetAmount) {
        this.budgetAmount = budgetAmount;
    }
}
