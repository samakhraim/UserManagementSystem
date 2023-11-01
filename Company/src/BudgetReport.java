import java.util.List;

public class BudgetReport implements IBudgetReport{

    private final DataBase dataBase;
    private final User user;

    public BudgetReport(DataBase dataBase, User user) {
        this.dataBase = dataBase;
        this.user = user;
    }

    @Override
    public void generateBudgetReport() {
        if (user instanceof Manager) {
            generateManagerBudget((Manager) user);
        } else if (user instanceof Director) {
            generateDirectorBudget((Director) user);
        }
    }

    private void generateManagerBudget(Manager manager) {
        List<User> staffList = dataBase.getStaffForManager(manager);
        double totalCost = 0;

        if (staffList != null && !staffList.isEmpty()) {
            for (User staff : staffList) {
                totalCost += staff.getHourlyRate() * staff.getTotalHours();
            }
        }

        System.out.println("Budget Report for Manager " + manager.getName() + ":");
        System.out.println("Total Cost: $" + totalCost);
    }

    private void generateDirectorBudget(Director director) {
        List<User> managerList = dataBase.getManagerForDirector(director);
        double totalCost = 0;

        if (managerList != null && !managerList.isEmpty()) {
            for (User manager : managerList) {
                List<User> staffList = dataBase.getStaffForManager((Manager) manager);
                if (staffList != null && !staffList.isEmpty()) {
                    for (User staff : staffList) {
                        totalCost += staff.getHourlyRate() * staff.getTotalHours();
                    }
                }
            }
        }

        System.out.println("Budget Report for Director " + director.getName() + ":");
        System.out.println("Total Cost: $" + totalCost);
    }

}
