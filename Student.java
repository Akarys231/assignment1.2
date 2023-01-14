public class Student{
    private String firstName, lastName, group;
    private double averageMark;
    public Student(String firstName, String lastName, String group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    public Student(){
        this.firstName = "firstName";
        this.lastName = "lastName";
        this.group = "group";
        this.averageMark = 0;
    }
    protected void getScholarship(){
        if(this.averageMark == 5){
            System.out.println("100$");
        }
        else{
            System.out.println("80$");
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
