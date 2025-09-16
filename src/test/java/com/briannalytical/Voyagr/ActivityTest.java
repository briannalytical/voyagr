package com.briannalytical.Voyagr;

import com.briannalytical.Voyagr.Models.Activity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ActivityTest {

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
}
