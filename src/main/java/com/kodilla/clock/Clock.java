package com.kodilla.clock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clock {
    private LocalTime time;
    private static int clockCounter;
    private int clockNumber;
    public Clock(int hour, int minute, int seconds) {
        clockCounter++;
        this.clockNumber = clockCounter;
        if(hour > 23 || minute > 60 || seconds > 60) {
            System.out.println("Wrong format of time for clock number " + clockNumber +" chose 0 -23 for hours, 0-60 for minutes and seconds");
        } else {
            this.time = LocalTime.of(hour, minute, seconds);

        }
    }
    public LocalTime getTime() {
        return time;
    }
    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH mm ss");
        return "Clock number " + clockNumber + " shows time: " + time.format(formatter);
    }
}
