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

    public BigDecimal getAmount() {return amount;}
    public LocalDateTime getDate() {
        return date;
    }
    public String getDescription() {
        return description;
    }
    public User getUser() {
        return user;
    }
    public Trip getTrip() {
        return trip;
    }

    public void setAmount(BigDecimal amount) {this.amount = amount;}
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setTrip(Trip trip) {
        this.trip = trip;
    }
}


