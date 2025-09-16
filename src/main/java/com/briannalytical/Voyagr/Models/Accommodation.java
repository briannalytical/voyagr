package com.briannalytical.Voyagr.Models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Accommodation extends Expense{

    private String accommodationName;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String reservationLink;
    enum AccommodationType {
        HOTEL, AIRBNB, HOSTEL, CAMPING, RESORT, VACATION_RENTAL, TIMESHARE, FAMILYORFRIENDS, OTHER
    }

    public Accommodation() {super();}

    public Accommodation(String accommodationName, LocalDate checkInDate, LocalDate checkOutDate, String reservationLink) {
        super();
        this.accommodationName = accommodationName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.reservationLink = reservationLink;
    }

    public Accommodation(BigDecimal amount, LocalDateTime date, String description, User user, Trip trip, String accommodationName, String reservationLink, LocalDate checkInDate, LocalDate checkOutDate) {
        super(amount, date, description, user, trip);
        this.accommodationName = accommodationName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.reservationLink = reservationLink;
    }

    public String getAccommodationName() {return accommodationName;}
    public LocalDate getCheckInDate() {return checkInDate;}
    public LocalDate getCheckOutDate() {return checkOutDate;}
    public String getReservationLink() {return reservationLink;}

    public void setAccommodationName(String accommodationName) {this.accommodationName = accommodationName;}
    public void setCheckInDate(LocalDate checkInDate) {this.checkInDate = checkInDate;}
    public void setCheckOutDate(LocalDate checkOutDate) {this.checkOutDate = checkOutDate;}
    public void setReservationLink(String reservationLink) {this.reservationLink = reservationLink;}

    public int calculateNights() {
        return (int) ChronoUnit.DAYS.between(checkInDate, checkOutDate);
    }
}
