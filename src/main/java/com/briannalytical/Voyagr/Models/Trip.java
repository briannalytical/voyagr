package com.briannalytical.Voyagr.Models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Trip {
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal totalBudget;
    private User user;
    private List<CategoryBudget> categoryBudgets;
    private List<DailyBudget> dailyBudgets;
}
