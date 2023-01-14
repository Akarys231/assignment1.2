package com.company.professions;
import com.company.vehicles.Car;

public class Person {
    private int age;
    private String fullName;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFullName() {
        return fullName;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return getFullName()+ " "+getAge();
    }
}
