package com.mirat.homework.airline;


import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Objects;

public class Airline {

    private String destination;
    private String flight;
    private String plane;
    private LocalTime departureTime;
    private DayOfWeek[] weekDays;

    public Airline(String destination, String flight, String plane, LocalTime departureTime, DayOfWeek... weekDays) {
        this.destination = destination;
        this.flight = flight;
        this.plane = plane;
        this.departureTime = departureTime;
        this.weekDays = weekDays;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getPlane() {
        return plane;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfWeek[] getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(DayOfWeek[] weekDays) {
        this.weekDays = weekDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(destination, airline.destination) &&
                Objects.equals(flight, airline.flight) &&
                Objects.equals(plane, airline.plane) &&
                Objects.equals(departureTime, airline.departureTime) &&
                Arrays.equals(weekDays, airline.weekDays);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(destination, flight, plane, departureTime);
        result = 31 * result + Arrays.hashCode(weekDays);
        return result;
    }

    @Override
    public String toString() {
        return String.format("%-11s%-7s%-7s%-5s%-7s%-5s%-16s%-6s%-13s%-100s", "Destination: ", destination, "| Flight: ", flight, "| Plane: ", plane, "| Departure Time: ", departureTime, "| Day of Week: ", Arrays.toString(weekDays).replace("[", "").replace("]", ""));
    }
}
