package com.briannalytical.Voyagr.Models;

import java.math.BigDecimal;
import java.util.List;

public class TotalBudget {
    private final BigDecimal maxBudget;
    private final BigDecimal budgetRemaining;
    private final BigDecimal budgetAllocated;

    public TotalBudget(BigDecimal maxBudget, BigDecimal budgetRemaining, BigDecimal budgetAllocated) {
        this.maxBudget = maxBudget;
        this.budgetRemaining = budgetRemaining;
        this.budgetAllocated = budgetAllocated;
    }

    public BigDecimal getMaxBudget() {
        return maxBudget;
    }
    public BigDecimal getBudgetRemaining() {
        return budgetRemaining;
    }
    public BigDecimal getBudgetAllocated() {
        return budgetAllocated;
    }


    public BigDecimal totalTripBudgetAllocated(List<CategoryBudget> categoryBudgets) {
        BigDecimal totalAllocated = BigDecimal.ZERO;
        for (CategoryBudget budget : categoryBudgets) {
            totalAllocated = totalAllocated.add(budget.getBudgetAmount());
        }
        return totalAllocated;
    }

    public BigDecimal calculateTripBudgetSpent(List<Expense> tripExpenses) {
        BigDecimal totalSpent = BigDecimal.ZERO;
        for (Expense expense : tripExpenses) {
            totalSpent = totalSpent.add(expense.getAmount());
        }
        return totalSpent;
    }
    public BigDecimal calculateActualRemaining(List<Expense> tripExpenses) {
        return maxBudget.subtract(calculateTripBudgetSpent(tripExpenses));
    }


}