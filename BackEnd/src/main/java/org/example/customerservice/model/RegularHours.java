package org.example.customerservice.model;

public class RegularHours {
    private String day;
    private String hours;

    public RegularHours(String day, String hours) {
        this.day = day;
        this.hours = hours;
    }

    public String getDay() {
        return day;
    }

    public String getHours() {
        return hours;
    }
}

