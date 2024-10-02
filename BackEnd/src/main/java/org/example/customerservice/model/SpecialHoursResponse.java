package org.example.customerservice.model;

public class SpecialHoursResponse {
    private SpecialHours specialHours;
    private String message;

    public SpecialHoursResponse(SpecialHours specialHours, String message) {
        this.specialHours = specialHours;
        this.message = message;
    }

    public SpecialHours getSpecialHours() {
        return specialHours;
    }

    public String getMessage() {
        return message;
    }
}
