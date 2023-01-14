public class Cat extends Animal{
    private String name = "Cat";
    public Cat(String food, String location){
        super(food, location);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise(){
        System.out.println(getName() + " is making noise in the " + getLocation());
    }
    @Override
    public void eat(){
        System.out.println(getName() + " is eating " + getFood());
    }
    @Override
    public void sleep(){
        System.out.println(getName() + " is sleeping");
    }

    @Override
    public String toString() {
        return getName() + " " + getFood() + " " + getLocation();
    }
}
