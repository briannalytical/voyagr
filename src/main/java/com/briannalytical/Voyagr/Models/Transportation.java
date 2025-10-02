package com.briannalytical.Voyagr.Models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transportation extends Expense {
    private String transportType;
    private String fromLocation;
    private String toLocation;

    public Transportation(String transportType, String fromLocation, String toLocation) {
        this.transportType = transportType;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
    }
    public Transportation(BigDecimal amount, LocalDateTime date, String description, User user, Trip trip, String transportType, String fromLocation, String toLocation) {
        super(amount, date, description, user, trip);
        this.transportType = transportType;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
    }

    public String getTransportType() {
        return transportType;
    }
    public String getFromLocation() {
        return fromLocation;
    }
    public String getToLocation() {
        return toLocation;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }
    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }
    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    @Override
    public String getCategoryName() {
        return "Transportation";
    }
}