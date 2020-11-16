package com.mirat.homework.airline;

import com.mirat.homework.View;
import java.time.DayOfWeek;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Airline airline1 = new Airline("Minsk", "B53", "A320", LocalTime.parse("06:30"), DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY);
        Airline airline2 = new Airline("Moscow", "A153", "B737", LocalTime.parse("03:30"), DayOfWeek.THURSDAY);
        Airline airline3 = new Airline("Chicago", "U07", "B787", LocalTime.parse("10:15"), DayOfWeek.SUNDAY);
        Airline airline4 = new Airline("Paris", "K97", "A321", LocalTime.parse("13:45"), DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);
        Airline airline5 = new Airline("Warsaw", "L530", "E190", LocalTime.parse("19:00"), DayOfWeek.WEDNESDAY);

        Airport airport = new Airport();
        airport.addAirline(airline1);
        airport.addAirline(airline2);
        airport.addAirline(airline3);
        airport.addAirline(airline4);
        airport.addAirline(airline5);

        View.print(airport.findByDestination("Warsaw"));
        System.out.println("*********************************************");

        View.print(airport.findByDayOfWeek(DayOfWeek.SUNDAY));
        System.out.println("*********************************************");

        View.print(airport.findByDayOfWeekAndDepartureTime(DayOfWeek.WEDNESDAY, LocalTime.parse("13:45")));
    }
}
