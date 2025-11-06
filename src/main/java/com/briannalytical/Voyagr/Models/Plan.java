package com.briannalytical.Voyagr.Models;

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
}