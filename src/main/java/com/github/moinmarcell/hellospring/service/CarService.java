package com.github.moinmarcell.hellospring.service;

import com.github.moinmarcell.hellospring.model.Car;
import com.github.moinmarcell.hellospring.repo.CarRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
