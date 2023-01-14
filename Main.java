import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Recursive output
        Recursive rec = new Recursive(4,8);
        rec.recursiveOutput();
        System.out.println();
        rec.recursiveOutput(5,1);
        System.out.println();

        //Inheritance student
        Student stud0 = new Student("Akarys", "Nuradinov","2207",3.7);
        Student stud1 = new Aspirant("Akarys", "Nuradinov","2207",3.7);
        stud0.getScholarship();
        stud1.getScholarship();
        Student[] students = new Student[4];
        students[0] = stud0;
        students[1] = stud1;
        students[2] = new Aspirant("Daniyar", "Bekbolatov", "2117",3.2);
        students[3] = new Student("Kairat", "Nurtas", "2119",3.4);
        students[0].getScholarship();
        students[1].getScholarship();
        students[2].getScholarship();
        students[3].getScholarship();

        //Cars
        Driver driver = new Driver("Abish Ergali", 20, 45);
        Engine engine = new Engine(2700, "BMW");
        Car lorry = new Lorry("X5", "BMW", 1600, engine, driver, 2500);
        Car tesla = new SportCar("Model S", "Tesla",1300, engine, driver, 250);
        System.out.println(driver);
        System.out.println(tesla);
        System.out.println(lorry);
        System.out.println();
        lorry.turnLeft();
        tesla.start();
        Animal cat = new Cat("Et", "dom");
        Animal dog = new Dog("Zhuyndy", "dala");
        Animal horse = new Horse("Shop", "Kora");
        dog.makeNoise();
        cat.eat();
        horse.sleep();
        System.out.println(cat);
        Veterinary vet = new Veterinary();
        vet.treatAnimal(dog);
        Animal[] animals = {cat, dog, horse};
        for(int i = 0; i < 3; i++){
            vet.treatAnimal(animals[i]);
        }
    }
}