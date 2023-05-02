package com.example.carservice.repository;

import com.example.carservice.model.Car;

import java.util.*;

public class CarRepository {
    private Map<UUID, Car> carRepository = new HashMap<>();

    public CarRepository() {
    }

    public CarRepository(Map<UUID, Car> carRepository) {
        this.carRepository = carRepository;
    }

    public Car addCar(Car car){
        carRepository.put(car.getId(), car);
        return carRepository.get(car.getId());
    }

    public List<Car> getCars(){
        List<Car> carList = new ArrayList<>();
        for (Car cars : carRepository.values()){
            carList.add(cars);
        }
        return carList;
    }

    @Override
    public String toString() {
        return "CarRepository{" +
                "carRepository=" + carRepository +
                '}';
    }
}

