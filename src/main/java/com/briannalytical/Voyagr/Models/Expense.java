package com.briannalytical.Voyagr.Models;
import java.math.BigDecimal;
import java.time.LocalDateTime;

// Base class - contains what ALL expenses have
public abstract class Expense {
    private BigDecimal amount;
    private LocalDateTime date;
    private String description;
    private User user;
    private Trip trip;

    public Expense() {}

    public Expense(BigDecimal amount, LocalDateTime date, String description, User user, Trip trip) {
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.user = user;
        this.trip = trip;
    }
}
