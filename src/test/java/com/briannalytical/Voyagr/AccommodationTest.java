package com.briannalytical.Voyagr;

import com.briannalytical.Voyagr.Models.Accommodation;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccommodationTest {

    @Test
    public void calculateNights_withNullDates_shouldThrowException() {
        // Arrange - create accommodation object with null date
        Accommodation accommodation = new Hotel(); // or whatever concrete class
        accommodation.setCheckInDate(null);
        accommodation.setCheckOutDate(LocalDate.of(2025, 3, 3)); // valid date
        // Act & Assert - verify exception is thrown
        assertThrows(IllegalStateException.class, accommodation::calculateNights);
    }

}
