package com.briannalytical.Voyagr.Models;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Miscellaneous extends Expense {

    private String misName;
    private BigDecimal misBudget;

    public Miscellaneous(String misName, BigDecimal misBudget) {
        this.misName = misName;
        this.misBudget = misBudget;
    }
    public Miscellaneous(BigDecimal amount, LocalDateTime date, String description, User user, Trip trip, String misName, BigDecimal misBudget) {
        super(amount, date, description, user, trip);
        this.misName = misName;
        this.misBudget = misBudget;
    }

    public String getMisName() {
        return misName;
    }
    public BigDecimal getMisBudget() {
        return misBudget;
    }

    public void setMisName(String misName) {
        this.misName = misName;
    }
    public void setMisBudget(BigDecimal misBudget) {
        this.misBudget = misBudget;
    }

}
