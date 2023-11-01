

public class User {

    private final int id;
    private final String name;
    private final int age;
    private final  double hourlyRate;
    private final int totalHours;

    DataBase userData;

    public User(int id,String name,int age,double hourlyRate,int totalHours){
        this.id=id;
        this.name=name;
        this.age=age;
        this.hourlyRate=hourlyRate;
        this.totalHours=totalHours;
        this.userData=new DataBase();
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){

        return age;
    }
    public double getHourlyRate(){
        return hourlyRate;
    }
    public int getTotalHours(){
        return  totalHours;
    }


    @Override
    public String toString() {
        return "[ID: " + getId() + ", Name: " + getName() + ", Age: " + getAge() +
                ", Hourly Rate: " + getHourlyRate() + ", Total Hours: " + getTotalHours() + "]";
    }
}
