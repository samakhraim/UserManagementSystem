public class StaffListReport implements StaffListGenerator {
    private final User user;

    public StaffListReport(User user) {
        this.user = user;
    }

    @Override
    public void generateStaffListReport() {
        if (user instanceof Manager) {
            Manager manager = (Manager) user;
            manager.getManagerStaffList();
        } else if (user instanceof Director) {
            Director director = (Director) user;
            director.getDirectorStaffList();
        }
    }
}