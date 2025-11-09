package com.briannalytical.Voyagr;

import com.briannalytical.Voyagr.Models.CategoryBudget;
import com.briannalytical.Voyagr.Models.Plan;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PlanTests {

    @Test
    public void getCategoryAllocation_DisplaysAllocationByCategory() {
        // arrange
        Plan plan = new Plan("Plan 1");
        CategoryBudget budget = new CategoryBudget();
        budget.setBudgetAmount(new BigDecimal("3,000"));
        plan.setCategoryBudgets();
        // act

    }
}
