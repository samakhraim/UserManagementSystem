import java.util.ArrayList;
import java.util.List;

class Director extends User {
   private List<User> managerList ;
   private List<User> staffList ;

    public Director(int id, String name, int age, double hourlyRate, int totalHours) {
        super(id, name, age, hourlyRate, totalHours);

        staffList=new ArrayList<>();
        managerList=new ArrayList<>();
    }

    public void getDirectorStaffList(DataBase staffData) {
        System.out.println("Staff List for Director " + getName() + ":");
         staffList = staffData.getStaffForDirector(this);
        if (staffList != null && !staffList.isEmpty()) {
            for (User staff : staffList) {
                System.out.println(staff);
            }
        } else {
            System.out.println("No staff assigned to this Director.");
        }
    }

    public void getDirectorManagerList(DataBase managerData) {
        System.out.println("Manager List for Director " + getName() + ":");
         managerList = managerData.getManagerForDirector(this);
        if (managerList != null && !managerList.isEmpty()) {
            for (User manager : managerList) {
                System.out.println(manager);
            }
        } else {
            System.out.println("No managers assigned to this Director.");
        }
    }


}
