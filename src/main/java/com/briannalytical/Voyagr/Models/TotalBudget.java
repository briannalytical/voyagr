package com.briannalytical.Voyagr.Models;

import java.math.BigDecimal;

public class TotalBudget {
    private BigDecimal maxBudget;
    private BigDecimal budgetRemaining;
    private BigDecimal budgetAllocated;

    public BigDecimal calculateRemaining() {
        return maxBudget.subtract(budgetAllocated);
    }
}