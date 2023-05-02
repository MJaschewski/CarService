package com.example.carservice.controller;

import com.example.carservice.model.Car;
import com.example.carservice.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class CarController {
    private CarService carService = new CarService();

    @PostMapping("car/post")
    public Car addCar(@RequestBody Car car){
        return carService.addCar(car);
    }

    @GetMapping("car/get")
    public List<Car> getCars(){
        return carService.getCars();
    }

    @DeleteMapping("car/{carID}")
    public Car removeCar(@PathVariable UUID carID){
        return carService.removeCar(carID);
    }
    @PutMapping("car/{carID}")
    public Car changeCar(@PathVariable UUID carID, @RequestBody Car car){
       carService.getCar(carID).setManufacturer(car.getManufacturer());
       carService.getCar(carID).setNumberOfWheels(car.getNumberOfWheels());
       carService.getCar(carID).setCertificate(car.isCertificate());

        return carService.getCar(carID);
    }
}
