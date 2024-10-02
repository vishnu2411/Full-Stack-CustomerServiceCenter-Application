package org.example.customerservice.service;

import org.example.customerservice.model.RegularHours;
import org.example.customerservice.model.SpecialHours;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final List<RegularHours> regularHours = new ArrayList<>();
    private final List<SpecialHours> specialHours = new ArrayList<>();

    public CustomerService() {
        // Initialize with some regular hours
        regularHours.add(new RegularHours("Monday - Thursday", "8 AM - 7:45 PM"));
        regularHours.add(new RegularHours("Friday", "9 AM - 7:45 PM"));
        regularHours.add(new RegularHours("Saturday", "9 AM - 5:45 PM"));
        regularHours.add(new RegularHours("Sunday", "9 AM - 5:45 PM"));
    }

    public List<RegularHours> getRegularHours() {
        return regularHours;
    }

    public Optional<SpecialHours> getSpecialHour(String date) {
        return specialHours.stream()
                .filter(sh -> sh.getDate().equals(date))
                .findFirst();
    }

    public void addSpecialHour(SpecialHours specialHour) {
        specialHours.add(specialHour);
    }
}
