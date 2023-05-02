package com.example.carservice.controller;

import com.example.carservice.model.Car;
import com.example.carservice.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/CarService")
public class CarController {
    private CarService carService = new CarService();

    @PostMapping("post_car")
    public Car addCar(Car car){
        carService.addCar(car);
        return car;
    }

    @GetMapping("get_cars")
    public String getCars(){
        return carService.getCars().toString();
    }
}
