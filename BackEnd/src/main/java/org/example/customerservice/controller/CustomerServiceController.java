package org.example.customerservice.controller;

import org.example.customerservice.model.RegularHours;
import org.example.customerservice.model.SpecialHours;
import org.example.customerservice.model.SpecialHoursResponse;
import org.example.customerservice.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hours")
public class CustomerServiceController {
    private final CustomerService customerService;

    public CustomerServiceController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/regular")
    public List<RegularHours> getRegularHours() {
        return customerService.getRegularHours();
    }

    @GetMapping("/special")
    public ResponseEntity<SpecialHoursResponse> getSpecialHour(@RequestHeader("date") String date) {
        return customerService.getSpecialHour(date)
                .map(specialHour -> ResponseEntity.ok(new SpecialHoursResponse(specialHour, "We are operating in Special Hours Today!!")))
                .orElseGet(() -> {
                    List<RegularHours> regularHours = customerService.getRegularHours();
                    String message = "No special hours for this date. Regular hours apply";
                    return ResponseEntity.ok(new SpecialHoursResponse(null, message));
                });
    }

    @PostMapping("/special")
    public ResponseEntity<SpecialHours> addSpecialHour(@RequestBody SpecialHours specialHour) {
        customerService.addSpecialHour(specialHour);
        return ResponseEntity.status(HttpStatus.CREATED).body(specialHour);
    }
}
