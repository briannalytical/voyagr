package com.briannalytical.Voyagr;

import com.briannalytical.Voyagr.Models.Activity;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.validation.constraints.AssertTrue;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class ActivityTest {

    //TODO: additional tests for corrected overlapswith method
    @Test
    public void startTime_isNotNull() {
        // Arrange
        Activity activity = new Activity();
        activity.setStartTime(LocalTime.of(16, 20));
        // Act & Assert
        Assertions.assertNotNull(activity.getStartTime());
    }

    @Test
    public void startTime_isNull() {
        // Arrange
        Activity activity = new Activity();
        // Act & Assert
        assertNull(activity.getStartTime());
    }

    @Test
    public void hasCompleteTimeInfo_isNotNull() {
        // Arrange
        Activity activity = new Activity();
        activity.setStartTime(LocalTime.of(16,20));
        activity.setEndTime(LocalTime.of(18,0));
        // Act & Assert
        assertTrue(activity.hasCompleteTimeInfo());
    }

    @Test
    public void duration_throwsException_whenEndTimeIsEarlierThanStartTime() {
        // Arrange
        Activity activity = new Activity();
        activity.setStartTime(LocalTime.of(16,20));
        activity.setEndTime(LocalTime.of(14,20));
        // Act & Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            activity.getDuration();
        });
    }

    @Test
    public void hasReservation_isNotNull() {
        // Assert
        Activity activity = new Activity();
        activity.setActivityReservationInfo("Reservation number #12345");
        //
        assertTrue(activity.hasReservation());
    }

    @Test
    public void overlapsWith_allowsActivities_onSameDate() {
        // Arrange
        Activity activity1 = new Activity();
        activity1.setDate(LocalDateTime.of(2025, 5, 15, 0, 0));
        activity1.setStartTime(LocalTime.of(14, 0));
        activity1.setEndTime(LocalTime.of(16, 0));
        Activity activity2 = new Activity();
        activity2.setDate(LocalDateTime.of(2025, 5, 15, 0, 0));
        activity2.setStartTime(LocalTime.of(15, 0));
        activity2.setEndTime(LocalTime.of(17, 0));
        // Act & Assert
        assertTrue(activity1.overlapsWith(activity2));
    }

    @Test
    public void overlapsWith_differentDates_doNotOverlap_haveSameTimes() {
        // Arrange
        Activity activity1 = new Activity();
        activity1.setDate(LocalDateTime.of(2025, 5, 7, 0, 0)); // May 7th
        activity1.setStartTime(LocalTime.of(14, 0));
        activity1.setEndTime(LocalTime.of(16, 0));

        Activity activity2 = new Activity();
        activity2.setDate(LocalDateTime.of(2025, 5, 25, 0, 0)); // May 25th (different date)
        activity2.setStartTime(LocalTime.of(15, 0)); // Same times as activity1
        activity2.setEndTime(LocalTime.of(17, 0));
        // Act and Assert
        assertFalse(activity1.overlapsWith(activity2));
    }

    @Test
    public void overlapsWith_activitiesStartTimes_areNotNull() {
        // Arrange
        Activity activity1 = new Activity();
        Activity activity2 = new Activity();
        activity2.setStartTime(LocalTime.of(16, 20));
        assertFalse(activity1.overlapsWith(activity2));
    }
}
