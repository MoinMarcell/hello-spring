package com.github.moinmarcell.hellospring.model;

import java.util.Objects;

public class Car {
    String brand;
    int tires;
    boolean hasTuev;

    public Car(String brand, int tires, boolean hasTuev) {
        this.brand = brand;
        this.tires = tires;
        this.hasTuev = hasTuev;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public boolean isHasTuev() {
        return hasTuev;
    }

    public void setHasTuev(boolean hasTuev) {
        this.hasTuev = hasTuev;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (tires != car.tires) return false;
        if (hasTuev != car.hasTuev) return false;
        return Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + tires;
        result = 31 * result + (hasTuev ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "com.github.moinmarcell.hellospring.model.Car{" +
                "brand='" + brand + '\'' +
                ", tires=" + tires +
                ", hasTuev=" + hasTuev +
                '}';
    }


}
