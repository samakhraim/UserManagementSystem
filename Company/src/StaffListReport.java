public class StaffListReport implements StaffListGenerator {
    private final User user;

    public StaffListReport(User user) {
        this.user = user;
    }

    @Override
    public void generateStaffListReport(DataBase dataBase) {
        if (user instanceof Manager manager) {
            manager.getManagerStaffList(dataBase);
        }
        else

            if (user instanceof Director director) {
                director.getDirectorStaffList(dataBase);
        }
    }
}

