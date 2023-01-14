public class Aspirant extends Student{
    private String firstName, lastName, group;
    private double averageMark;
    public Aspirant(String firstName, String lastName, String group, double averageMark){
        super(firstName, lastName, group, averageMark);
    }
    @Override
    public void getScholarship(){
        if(this.averageMark == 5){
            System.out.println("200$");
        }
        else{
            System.out.println("180$");
        }
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getGroup(){
        return this.group;
    }
    public double getAverageMark(){
        return this.averageMark;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setGroup(String group){
        this.group = group;
    }
    public void setAverageMark(int averageMark){
        this.averageMark = averageMark;
    }
}
