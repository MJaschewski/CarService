package com.example.carservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor

public class Car {
    private UUID id;
    private String manufacturer;
    private int numberOfWheels;
    boolean certificate;

    public Car(String manufacturer, int numberOfWheels, boolean certificate) {
        this.manufacturer = manufacturer;
        this.numberOfWheels = numberOfWheels;
        this.certificate = certificate;
    }
}
