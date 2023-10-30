public class Staff extends User {


    public Staff(int id,String name,int age,double hourlyRate,int totalHours){

        super(id,name,age,hourlyRate,totalHours);
    }
    @Override

    public String toString() {
        return "Staff [ID: " + getId() + ", Name: " + getName() + ", Age: " + getAge() +
                ", Hourly Rate: " + getHourlyRate() + ", Total Hours: " + getTotalHours() + "]";
    }

}
