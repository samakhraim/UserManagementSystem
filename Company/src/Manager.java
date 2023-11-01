
import java.util.ArrayList;
import java.util.List;

class Manager extends User {

    private List<User> staffList;
    public Manager(int id, String name, int age, double hourlyRate, int totalHours) {
        super(id, name, age, hourlyRate, totalHours);
        staffList=new ArrayList<User>();
    }

    public void getManagerStaffList() {
        System.out.println("Staff List for Manager " + getName() + ":");
         staffList = userData.getStaffForManager(this);
        if (staffList != null && !staffList.isEmpty()) {
            for (User staff : staffList) {
                System.out.println(staff);
            }
        } else {
            System.out.println("No staff assigned to this manager.");
        }
    }

}