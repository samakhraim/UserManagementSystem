import java.util.List;

public class BudgetReport implements IBudgetReport {
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
        }
        else
            if (user instanceof Director) {
            generateDirectorBudget((Director) user);
        }
    }

    private void generateManagerBudget(Manager manager) {
        double totalCost = manager.getHourlyRate() * manager.getTotalHours();

        System.out.println("Budget Report for Manager " + manager.getName() + ":");
        System.out.println("Total Cost: $" + totalCost);
    }

    private void generateDirectorBudget(Director director) {
        double totalCost = director.getHourlyRate() * director.getTotalHours();

        System.out.println("Budget Report for Director " + director.getName() + ":");
        System.out.println("Total Cost: $" + totalCost);
    }
}
