package com.briannalytical.Voyagr.Models;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;

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


    public BigDecimal getAssumedDailyBudget(List<CategoryBudget> categoryBudgets, int totalTripDays) {
        BigDecimal totalCategoryBudgets = BigDecimal.ZERO;
        for (CategoryBudget budget : categoryBudgets) {
            totalCategoryBudgets = totalCategoryBudgets.add(budget.getBudgetAmount());
        }
        return totalCategoryBudgets.divide(new BigDecimal(totalTripDays), RoundingMode.HALF_UP);
    }

    public BigDecimal getAllocatedDailyBudget(List<CategoryBudget> categoryBudgets, int totalTripDays) {
        BigDecimal totalAllocated = BigDecimal.ZERO;
        for (CategoryBudget categoryBudget : categoryBudgets) {
            BigDecimal dailyPortion = categoryBudget.getBudgetAmount().divide(new BigDecimal(totalTripDays));
            totalAllocated = totalAllocated.add(dailyPortion);
        }
        return totalAllocated;
    }

    public BigDecimal getActualDailySpent(List<Expense> tripExpenses) {
        BigDecimal totalActualSpent = BigDecimal.ZERO;
        for (Expense expense : tripExpenses) {
            if (expense.getDate().toLocalDate().equals(this.date)) {
                totalActualSpent = totalActualSpent.add(expense.getAmount());
            }
        }
        return totalActualSpent;
    }

    public BigDecimal getDailyBudgetOverUnder(List<CategoryBudget> categoryBudgets, List<Expense> tripExpenses, int totalTripDays) {
        BigDecimal allocated = getAllocatedDailyBudget(categoryBudgets, totalTripDays);
        BigDecimal actual = getActualDailySpent(tripExpenses);
        return allocated.subtract(actual);
    }

}
