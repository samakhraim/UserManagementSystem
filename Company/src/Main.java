// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        User staff1 =new User(11820,"sama",15,0.55,8);
        User staff2 =new User(1,"ss",15,0.55,8);
        User manager=new Manager(5,"ahmad",44,5.2,7,List.of(staff2,staff1));

        Manager manager1=new Manager(5,"ahmad",44,5.2,7,List.of(staff2,staff1));

        System.out.println(manager1.getManagerStaffList());



    }
}
