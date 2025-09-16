package com.briannalytical.Voyagr;

import com.briannalytical.Voyagr.Models.Accommodation;
import com.briannalytical.Voyagr.Models.Trip;
import com.briannalytical.Voyagr.Models.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Hotel extends Accommodation {

    private String hotelName;
    private BigDecimal perNightCost;
    private BigDecimal totalCost;

    // Empty constructor
    public Hotel() {
        super();
    }

    // Hotel-specific constructor
    public Hotel(String hotelName, BigDecimal perNightCost, BigDecimal totalCost) {
        super();
        this.hotelName = hotelName;
        this.perNightCost = perNightCost;
        this.totalCost = totalCost;
    }

    public Hotel(LocalDate checkInDate, LocalDate checkOutDate, String reservationLink, String hotelName, BigDecimal perNightCost, BigDecimal totalCost) {
        super();
        this.setCheckInDate(checkInDate);
        this.setCheckOutDate(checkOutDate);
        this.setReservationLink(reservationLink);
        this.hotelName = hotelName;
        this.perNightCost = perNightCost;
        this.totalCost = totalCost;
    }

    // Full constructor with all Expense fields
    public Hotel(BigDecimal amount, LocalDateTime date, String description, User user, Trip trip, LocalDate checkInDate, LocalDate checkOutDate, String reservationLink, String hotelName, BigDecimal perNightCost, BigDecimal totalCost) {
        super();
        this.setAmount(amount);
        this.setDate(date);
        this.setDescription(description);
        this.setUser(user);
        this.setTrip(trip);
        this.setCheckInDate(checkInDate);
        this.setCheckOutDate(checkOutDate);
        this.setReservationLink(reservationLink);
        this.hotelName = hotelName;
        this.perNightCost = perNightCost;
        this.totalCost = totalCost;
    }
}
