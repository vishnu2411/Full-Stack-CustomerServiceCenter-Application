package org.example.customerservice.model;

public class SpecialHours {
    private String date;
    private String hours;
    private String message;

    public SpecialHours(String date, String hours, String message) {
        this.date = date;
        this.hours = hours;
        this.message = message;
    }

    public SpecialHours(String message){
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public String getHours() {
        return hours;
    }

    public String getMessage() {
        return message;
    }
}


