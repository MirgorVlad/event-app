package org.mirgor.petproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mirgor.petproject.service.CalendarIntegration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalendarIntegrationIT {

    @Autowired
    private CalendarIntegration calendarIntegration;

    @Test
    public void testFetchNewEventsWithRealGoogle() {
        Assertions.assertDoesNotThrow(() -> {
            calendarIntegration.fetchNewEvents();
        });
    }
}

