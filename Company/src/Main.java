public class Main {
    public static void main(String[] args) {
        User staff1 = new Staff(11820, "Sama", 15, 0.55, 8);
        User staff2 = new Staff(1, "SS", 15, 0.55, 8);
        User staff3 = new Staff(2, "John", 30, 0.65, 6);
        User manager = new Manager(6, "Yaman", 35, 4.5, 8);
        User director = new Director(7, "Hind", 40, 6.2, 7);

        DataBase staffData = new DataBase();
        staffData.addStaffForManager(manager, staff2);
        staffData.addStaffForManager(manager, staff1);
        System.out.println();
        staffData.addStaffForDirector(director, staff3);
        staffData.addManagerForDirector(director, manager);
        System.out.println();
        System.out.println();
        staffData.addManagerForDirector(director, manager);

        StaffListReport managerReport = new StaffListReport(manager, staffData);
        managerReport.Generate();
        StaffListReport direReport = new StaffListReport(director, staffData);
        direReport.Generate();

        BudgetReport directorBudgetReport =new BudgetReport(staffData,director);

        directorBudgetReport.Generate();
        System.out.println();
        BudgetReport managerBudgetReport=new BudgetReport(staffData,manager);
        managerBudgetReport.Generate();



    }
}
