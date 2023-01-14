package com.company.vehicles;
import com.company.vehicles.Car;
import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private int speed;
    public SportCar(String carClass, String carBrand, double weight, Engine engine, Driver driver, int speed) {
        super(carClass, carBrand, weight, engine, driver);
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
    @Override
    public String toString() {
        return getCarBrand() +" "+ getCarClass() + " "+ getWeight()+" "+getDriver() + " "+getEngine()  +" "+ getSpeed();
    }
}
