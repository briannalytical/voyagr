package com.briannalytical.Voyagr.Models;

import java.math.BigDecimal;

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

    public BigDecimal calculateRemaining() {
        return maxBudget.subtract(budgetAllocated);
    }
}