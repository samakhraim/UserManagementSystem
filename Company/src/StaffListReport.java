public class StaffListReport implements IReport {

    private final  User user;
    private final DataBase dataBase;

    public StaffListReport(User user, DataBase dataBase) {
        this.user = user;
        this.dataBase = dataBase;
    }

    @Override
    public void Generate() {
        if (user instanceof Manager) {
            Manager manager = (Manager) user;
            manager.getManagerStaffList(dataBase);
        } else if (user instanceof Director) {
            Director director = (Director) user;
            director.getDirectorStaffList(dataBase);
        }
    }
}
