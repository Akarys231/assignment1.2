public class Animal {
    private String food;
    private String location;
    public Animal(String food, String location){
        this.food = food;
        this.location = location;
    }
    public void setFood(String food){
        this.food = food;
    }
    public String getFood(){
        return this.food;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return this.location;
    }
    public void makeNoise(){
        System.out.println(getClass() + " is making noise in the " + location);
    }

    public void eat(){
        System.out.println(getClass() + " is eating" + food);
    }

    public void sleep(){
        System.out.println(getClass() + " is sleeping");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
