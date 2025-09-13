package com.briannalytical.Voyagr.Models;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Lodging extends Expense {

    private String hotelName;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Lodging(String hotelName, LocalDate checkIn, LocalDate checkOut) {
        this.hotelName = hotelName;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    public Lodging(BigDecimal amount, LocalDateTime date, String description, User user, Trip trip, String hotelName, LocalDate checkIn, LocalDate checkOut) {
        super(amount, date, description, user, trip);
        this.hotelName = hotelName;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String getHotelName() {
        return hotelName;
    }
    public LocalDate getCheckIn() {
        return checkIn;
    }
    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }
    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public int calculateTotalTripDays() {

    }
}
