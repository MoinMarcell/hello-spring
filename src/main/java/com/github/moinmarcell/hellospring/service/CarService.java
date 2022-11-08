package com.github.moinmarcell.hellospring.service;

import com.github.moinmarcell.hellospring.model.Car;
import com.github.moinmarcell.hellospring.repo.CarRepo;

import java.util.List;

public class CarService {

    CarRepo carRepo;

    public CarService() {
        carRepo = new CarRepo();
    }

    public Car addCar(Car carToAdd){
        return carRepo.addCar(carToAdd);
    }

    public List<Car> getCars(){
        return carRepo.getCars();
    }

}
