import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
    private final Map<User, List<User>> managerStaffMap = new HashMap<>();
    private final Map<User, List<User>> directorStaffMap = new HashMap<>();
    private final Map<User, List<User>> directorManagerMap = new HashMap<>();

    public void addStaffForManager(User manager, User staff) {
        managerStaffMap.computeIfAbsent(manager, k -> new ArrayList<>()).add(staff);
        System.out.println("Staff added to manager "+manager.getName());
    }

    public void addStaffForDirector(User director, User staff) {
        directorStaffMap.computeIfAbsent(director, k -> new ArrayList<>()).add(staff);
        System.out.println("Staff added to director "+director.getName());
    }


    public void addManagerForDirector(User director, User manager) {
        directorManagerMap.computeIfAbsent(director, k -> new ArrayList<>()).add(manager);
        System.out.println("Manager added to director "+director.getName());
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
