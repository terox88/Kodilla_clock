package com.kodilla.clock;

import java.time.LocalTime;
import java.util.*;

public class Program {
    public static void main (String[] args) {
        Clock clock1 = new Clock(14, 24, 55);
        Clock clock2 = new Clock(18, 59, 55);
        Clock clock3 = new Clock(22, 23, 12);
        Clock clock4 = new Clock(14, 24, 55);
        Clock clock5 = new Clock(15, 24, 55);
        Clock clock6 = new Clock(4, 24, 55);
        Clock clock7 = new Clock(2, 24, 55);
        clock7.setTime(LocalTime.now());
        List<Clock> clockList = new LinkedList<>();

        clockList.add(clock1);
        clockList.add(clock2);
        clockList.add(clock3);
        clockList.add(clock4);
        clockList.add(clock5);
        clockList.add(clock6);
        clockList.add(clock7);

        System.out.println("Time before change");
        for(Clock clock : clockList) {
            System.out.println(clock);
        }

        for(Clock clock : clockList) {
            clock.setTime(clock.getTime().plusMinutes(1));
        }

        System.out.println("Time after change");
        for(Clock clock : clockList) {
            System.out.println(clock);
        }

        System.out.println("\nExtra exercise");
        for(int i = 0; i <= 100; i += 4) {
            System.out.println(i);
        }




    }
}
