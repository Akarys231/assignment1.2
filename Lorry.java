package com.company.vehicles;
import com.company.vehicles.Car;
import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private int capacity;

    public Lorry(String carClass, String carBrand, double weight, Engine engine, Driver driver, int capacity) {
        super(carClass, carBrand, weight, engine, driver);
        this.capacity = capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return getCarBrand() + " "+getCarClass() + " "+getWeight()+" "+getDriver() +" "+ getEngine() +" "  + getCapacity();
    }
}

