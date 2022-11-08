package com.github.moinmarcell.hellospring.repo;

import com.github.moinmarcell.hellospring.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepo {
    List<Car> cars;

    public CarRepo(List<Car> cars) {
        this.cars = cars;
    }

    public CarRepo() {
        cars = new ArrayList<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Car addCar(Car carToAdd){
        cars.add(carToAdd);
        return carToAdd;
    }
}
