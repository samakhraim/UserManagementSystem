import java.util.ArrayList;
import java.util.List;
class Director extends User{


    List<User> directorManagerList;
    List<User> directorStaffList;
    public Director(int id, String name, int age, double hourlyRate, int totalHours,List<User> directorStaff ,List<User> directorManager) {
        super(id, name, age, hourlyRate, totalHours);
        this.directorStaffList=directorStaff;
        this.directorManagerList=directorManager;

    }
    public List<User> getDirectorManagerList(){
        System.out.println("Staff List for Manager " + getName() + ":");
        for (User manager : directorManagerList) {
            System.out.println(manager);
        }
        return null;
    }

    public List<User> getDirectorStaffList(){
        System.out.println("Staff List for Manager " + getName() + ":");
        for (User manager : directorManagerList) {
            System.out.println(manager);
        }
        return null;
    }
    @Override
    public String toString() {
        return "Director [ID: " + getId() + ", Name: " + getName() + ", Age: " + getAge() +
                ", Hourly Rate: " + getHourlyRate() + ", Total Hours: " + getTotalHours() + "]";
    }

}
