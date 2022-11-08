package com.github.moinmarcell.hellospring.controller;

import com.github.moinmarcell.hellospring.model.Car;
import com.github.moinmarcell.hellospring.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/addcar")
    public Car addCar(@RequestBody Car carToAdd){
        carService.addCar(carToAdd);
        return carToAdd;
    }

    @GetMapping("/getcars")
    public List<Car> getCars(){
        return carService.getCars();
    }

}
