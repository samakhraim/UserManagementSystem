public class Main {
    public static void main(String[] args) {
        User staff1 = new Staff(11820, "Sama", 15, 0.55, 8);
        User staff2 = new Staff(1, "SS", 15, 0.55, 8);
        User staff3 = new Staff(2, "sami", 30, 0.65, 6);
        User manager = new Manager(6, "Yaman", 35, 4.5, 8);
        User director = new Director(7, "Hind", 40, 6.2, 7);


        manager.userData.addStaffForManager(manager, staff2);
        manager.userData.addStaffForManager(manager, staff1);
        director.userData.addStaffForDirector(director, staff3);

        director.userData.addManagerForDirector(director, manager);
        director.userData.addManagerForDirector(director, manager);
        System.out.println();
        StaffListReport managerReport = new StaffListReport(manager);
        managerReport.generateStaffListReport();
        System.out.println();

        StaffListReport direReport = new StaffListReport(director);
        direReport.generateStaffListReport();
        System.out.println();

        IBudgetReport directorBudgetReport = new BudgetReport( director);
        directorBudgetReport.generateBudgetReport();
        System.out.println();

        IBudgetReport managerBudgetReport = new BudgetReport( manager);
        managerBudgetReport.generateBudgetReport();
    }
}
