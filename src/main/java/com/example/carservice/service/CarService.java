package com.example.carservice.service;

import com.example.carservice.model.Car;
import com.example.carservice.repository.CarRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
public class CarService {
    private CarRepository carRepository = new CarRepository();

    public Car addCar(Car car){
        car.setId(UUID.randomUUID());
        carRepository.addCar(car);
        return car;
    }

    public Car getCar(UUID carID){
        return carRepository.getCar(carID);
    }

    public Car removeCar(UUID carID){
        Car deletedCar = carRepository.removeCar(carID);
        return deletedCar;
    }

    public List<Car> getCars(){
        return carRepository.getCars();
    }

    @Override
    public String toString() {
        return "CarService{" +
                "carRepository=" + carRepository +
                '}';
    }
}
