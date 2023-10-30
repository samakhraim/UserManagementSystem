import java.util.ArrayList;
import java.util.List;

public class Manager extends User  {

    private final List<User> managerStaffList;


    public Manager (int id,String name,int age,double hourlyRate,int totalHours,List<User> managerStaff){
        super(id,name,age,hourlyRate,totalHours);
        this.managerStaffList=managerStaff;
    }

    public List<User> getManagerStaffList(){
        System.out.println("Staff List for Manager " + getName() + ":");
        for (User staff : managerStaffList) {
            System.out.println(staff);
        }
        return null;
    }
    @Override
    public String toString() {
        return "Manager[ID: " + getId() + ", Name: " + getName() + ", Age: " + getAge() +
                ", Hourly Rate: " + getHourlyRate() + ", Total Hours: " + getTotalHours() + "]";
    }

}
