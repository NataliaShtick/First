import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        ArrayList UserList = new ArrayList();
        new ArrayList();
        User user1 = new User();
        User user2 = new User();
        user1.setName("Vict");
        user1.setSurName("Step");
        user2.setName("Kate");
        user2.setSurName("Danim");
        user1.setID(9);

        Collections.sort(UserList);
        System.out.print(UserList);
        Car car1 = new Car();
        Car car2 = new Car();
        car1.setModel("ford");
        car1.setColor("red");
        car2.setModel("bmv");
        car2.setColor("white");
    }
}
