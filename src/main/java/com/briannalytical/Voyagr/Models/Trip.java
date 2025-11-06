package com.briannalytical.Voyagr.Models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Trip {
    private String tripName;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal totalBudget;
    private User user;
    private List<Plan> plans;
    private List<CategoryBudget> categoryBudgets;
    private List<DailyBudget> dailyBudgets;

    public Trip(String tripName, LocalDate startDate, LocalDate endDate, BigDecimal totalBudget, User user, List<Plan> plans, List<CategoryBudget> categoryBudgets, List<DailyBudget> dailyBudgets) {
        this.tripName = tripName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalBudget = totalBudget;
        this.user = user;
        this.plans = plans;
        this.categoryBudgets = categoryBudgets;
        this.dailyBudgets = dailyBudgets;
    }

    public String getTripName() {return tripName;}
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public BigDecimal getTotalBudget() {
        return totalBudget;
    }
    public User getUser() {
        return user;
    }
    public List<CategoryBudget> getCategoryBudgets() {
        return categoryBudgets;
    }
    public List<DailyBudget> getDailyBudgets() {
        return dailyBudgets;
    }
    public List<Plan> getPlans() {return plans;}

    public void setTripName(String tripName) {this.tripName = tripName;}
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public void setTotalBudget(BigDecimal totalBudget) {
        this.totalBudget = totalBudget;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setCategoryBudgets(List<CategoryBudget> categoryBudgets) {
        this.categoryBudgets = categoryBudgets;
    }
    public void setDailyBudgets(List<DailyBudget> dailyBudgets) {
        this.dailyBudgets = dailyBudgets;
    }
    public void setPlans(List<Plan> plans) {this.plans = plans;}
}
