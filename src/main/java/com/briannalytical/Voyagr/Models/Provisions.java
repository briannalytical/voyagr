package com.briannalytical.Voyagr.Models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Provisions extends Expense {

    private String subcategory;

    public Provisions(String subcategory) {
        this.subcategory = subcategory;
    }

    public Provisions(BigDecimal amount, LocalDateTime date, String description, User user, Trip trip, String subcategory) {
        super(amount, date, description, user, trip);
        this.subcategory = subcategory;
    }

    public String getSubcategory() {
        return subcategory;
    }
    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    @Override
    public String getCategoryName() {
        return "Provisions";
    }
}
