package  com.company.professions;

import com.company.details.Engine;
import com.company.professions.Person;
public class Driver extends Person {

    private int drivingExperience;
    public Driver(String fullName, int drivingExperience, int age) {
        super(fullName, age);
        this.drivingExperience = drivingExperience;
    }

    @Override
    public void setFullName(String fullName) {
        super.setFullName(fullName);
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }
    @Override
    public String toString() {
        return getFullName() + " " + getAge() +" " + getDrivingExperience();
    }
}
