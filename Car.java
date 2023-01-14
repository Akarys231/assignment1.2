package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car{
    private String carClass;
    private String carBrand;
    private double weight;
    private  Engine engine;
    private Driver driver;
    public Car(String carClass, String carBrand, double weight, Engine engine, Driver driver){
        this.carClass = carClass;
        this.carBrand = carBrand;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
    }

    public double getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public void start(){
        System.out.println("Let's go!");
    }
    public void stop(){
        System.out.println("Stop!");
    }
    public void turnLeft(){
        System.out.println("Turn Left");
    }
    public void turnRight(){
        System.out.println("Turn Right");
    }
    public String toString() {
        return getCarBrand() + getCarClass() + getDriver() + getEngine() + getWeight();
    }

}
