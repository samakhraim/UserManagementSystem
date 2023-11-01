import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
    private final Map<User, List<User>> managerStaffMap = new HashMap<>();
    private final Map<User, List<User>> directorStaffMap = new HashMap<>();
    private final Map<User, List<User>> directorManagerMap = new HashMap<>();

    public void addStaffForManager(User manager, User staff) {
        List<User> managerStaffList = managerStaffMap.get(manager);
        if (managerStaffList == null) {
            managerStaffList = new ArrayList<>();
            managerStaffMap.put(manager, managerStaffList);
        }
        managerStaffList.add(staff);
        System.out.println("Staff added to manager " + manager.getName());
    }

    public void addStaffForDirector(User director, User staff) {
        List<User> directorStaffList = directorStaffMap.get(director);
        if (directorStaffList == null) {
            directorStaffList = new ArrayList<>();
            directorStaffMap.put(director, directorStaffList);
        }
        directorStaffList.add(staff);
        System.out.println("Staff added to director " + director.getName());
    }


    public void addManagerForDirector(User director, User manager) {
      List<User> directorManagerList=directorManagerMap.get(director);
      if(directorManagerList==null){
          directorManagerList=new ArrayList<>();
          directorManagerMap.put(director, directorManagerList);
      }
        directorManagerList.add(manager);
        System.out.println("Manager added to director " + director.getName());

    }

    public List<User> getStaffForManager(User manager) {
        return managerStaffMap.get(manager);
    }

    public List<User> getStaffForDirector(User director) {
        return directorStaffMap.get(director);
    }

    public List<User> getManagerForDirector(User director) {
        return directorManagerMap.get(director);
    }
}
