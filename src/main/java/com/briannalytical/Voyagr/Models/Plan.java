package com.briannalytical.Voyagr.Models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Plan {

    private String planName;
    private List<CategoryBudget> categoryBudgets;
    private List<Expense> plannedExpenses;


    public Plan() {}

    public Plan(String planName) {
        this.planName = planName;
        this.categoryBudgets = new ArrayList<>();
        this.plannedExpenses = new ArrayList<>();
    }


    public String getPlanName() { return planName; }

    public List<CategoryBudget> getCategoryBudgets() { return categoryBudgets; }

    public List<Expense> getPlannedExpenses() { return plannedExpenses; }


    public void setPlanName(String planName) { this.planName = planName; }

    public void setCategoryBudgets(List<CategoryBudget> categoryBudgets) {this.categoryBudgets = categoryBudgets;}

    public void setPlannedExpenses(List<Expense> plannedExpenses) {this.plannedExpenses = plannedExpenses;}


    // see allocation for a specific category
    public BigDecimal getCategoryAllocation(String categoryName) {
        for (CategoryBudget budget : categoryBudgets) {
            if (budget.getCategoryName().equals(categoryName)) {
                return budget.getBudgetAmount();
            }
        }
        return BigDecimal.ZERO;
    }

    // see how much budget is still unallocated
    public BigDecimal getRemainingToAllocate(BigDecimal totalTripBudget) {
        return totalTripBudget.subtract(getTotalAllocated());
    }

    // validate the plan doesn't exceed total budget
    public boolean isValidAllocation(BigDecimal totalTripBudget) {
        return getTotalAllocated().compareTo(totalTripBudget) <= 0;
    }

    // helper to sum all allocations
    public BigDecimal getTotalAllocated() {
        BigDecimal total = BigDecimal.ZERO;
        for (CategoryBudget budget : categoryBudgets) {
            total = total.add(budget.getBudgetAmount());
        }
        return total;
    }
}