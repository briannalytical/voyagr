package com.briannalytical.Voyagr;

import com.briannalytical.Voyagr.Models.Accommodation;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class AccommodationTest {

    @Test
    public void calculateNights_withNullCheckInDate_shouldThrowException() {
        // Arrange - create accommodation object with null date
        Accommodation accommodation = new Accommodation();
        accommodation.setCheckInDate(null);
        accommodation.setCheckOutDate(LocalDate.of(2025, 5, 7));
        // Act & Assert - verify exception is thrown
        assertThrows(IllegalStateException.class, accommodation::calculateNights);
    }
    @Test
    public void calculateNights_withNullCheckOutDate_shouldThrowException() {
        // Arrange - create accommodation object with null date
        Accommodation accommodation = new Accommodation();
        accommodation.setCheckInDate(LocalDate.of(2025, 5, 25));
        accommodation.setCheckOutDate(null);
        // Act & Assert - verify exception is thrown
        assertThrows(IllegalStateException.class, accommodation::calculateNights);
    }
    @Test
    public void individualDate_correspondsWithGivenAccommodationDates() {
        // Arrange
        Accommodation accommodation = new Accommodation();
        accommodation.setCheckInDate(LocalDate.of(2025,5,7));
        accommodation.setCheckOutDate(LocalDate.of(2025,5,25));
        // Act
        int nights = accommodation.calculateNights();
        // Assert
        assertEquals(18, nights);
    }
    @Test
    public void calculateNights_withCheckOutBeforeCheckIn_shouldThrowException() {
        Accommodation accommodation = new Accommodation();
        accommodation.setCheckInDate(LocalDate.of(2025, 5, 25)); // later date
        accommodation.setCheckOutDate(LocalDate.of(2025, 5, 7));  // earlier date

        assertThrows(IllegalArgumentException.class, accommodation::calculateNights);
    }
}
