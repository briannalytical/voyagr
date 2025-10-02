package com.briannalytical.Voyagr.Models;

import java.math.BigDecimal;
import java.util.List;

public class CategoryBudget {
    private Trip trip;
    private String categoryName;
    private BigDecimal totalBudgetAmount;

    public CategoryBudget(Trip trip, String categoryName, BigDecimal budgetAmount) {
        this.trip = trip;
        this.categoryName = categoryName;
        this.totalBudgetAmount = budgetAmount;
    }

    public Trip getTrip() {
        return trip;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public BigDecimal getBudgetAmount() {
        return totalBudgetAmount;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public void setBudgetAmount(BigDecimal budgetAmount) {
        this.totalBudgetAmount = budgetAmount;
    }


    public BigDecimal getAmountSpent(List<Expense> tripExpenses) {
        BigDecimal spent = BigDecimal.ZERO;
        for (Expense expense : tripExpenses) {
            if (expense.getCategoryName().equals(this.categoryName)) {
                spent = spent.add(expense.getAmount());
            }
        }
        return spent;
    }

}
