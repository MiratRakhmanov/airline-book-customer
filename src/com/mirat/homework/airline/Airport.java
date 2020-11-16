package com.mirat.homework.airline;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Airline> airportSchedule;

    public Airport() {
        this.airportSchedule = new ArrayList<>();
    }

    public void addAirline(Airline airline) {
        airportSchedule.add(airline);
    }

    public List<Airline> getAirportSchedule() {
        return airportSchedule;
    }

    public List<Airline> findByDestination(String destination) {
        List<Airline> result = new ArrayList<>();
        for (Airline airline : airportSchedule) {
            if(airline.getDestination().equalsIgnoreCase(destination)) {
                result.add(airline);
            }
        }
        return result;
    }

    public List<Airline> findByDayOfWeek(DayOfWeek dayOfWeek) {
        List<Airline> result = new ArrayList<>();
        for (Airline airline : airportSchedule) {
            for(DayOfWeek day : airline.getWeekDays()) {
                if(day.equals(dayOfWeek)) {
                    result.add(airline);
                }
            }
        }
        return result;
    }

    public List<Airline> findByDayOfWeekAndDepartureTime(DayOfWeek dayOfWeek, LocalTime time) {
        List<Airline> result = new ArrayList<>();
        for (Airline airline : airportSchedule) {
            for(DayOfWeek day : airline.getWeekDays()) {
                if(day.equals(dayOfWeek) && airline.getDepartureTime().compareTo(time) > 0) {
                    result.add(airline);
                }
            }
        }
        return result;
    }
}
