package com.briannalytical.Voyagr.Models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Accommodation extends Expense{

    private final LocalDate checkInDate;
    private final LocalDate checkOutDate;
    private final String reservationLink;

    public Accommodation(LocalDate checkInDate, LocalDate checkOutDate, String reservationLink) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.reservationLink = reservationLink;
    }

    public Accommodation(BigDecimal amount, LocalDateTime date, String description, User user, Trip trip, String reservationLink, LocalDate checkInDate, LocalDate checkOutDate) {
        super(amount, date, description, user, trip);
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.reservationLink = reservationLink;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }
    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }
    public String getReservationLink() {
        return reservationLink;
    }

    public int calculateNights() {
        return (int) ChronoUnit.DAYS.between(checkInDate, checkOutDate);
    }
    enum AccommodationType {
        HOTEL, AIRBNB, HOSTEL, CAMPING, RESORT, VACATION_RENTAL, TIMESHARE, FAMILYORFRIENDS, OTHER
    }
}
