package com.company;

import java.time.Duration;
import java.time.LocalTime;

public interface Visitable {
    default LocalTime getOpeningTime() {
        return LocalTime.parse("09:30");
    }
    default LocalTime getClosingTime() {
        return LocalTime.parse("20:00");
    }

    static Duration getVisitingDuration(LocalTime closingTime, LocalTime openingTime){ // subpunctul 3
        return Duration.between(closingTime, openingTime);
    }
}
