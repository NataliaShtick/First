package company;

import company.IO.JsonIO;
import company.IO.XmlIO;
import company.User.User;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;


public class App {
    public static void main(String[] args) throws IOException, JAXBException{
        Repository listUsers = new Repository();
        CarAdd carAdd = new CarAdd();
        User user1 = new User();
        User user2 = new User();
        user1.setName("Vict");
        user1.setSurName("Step");
        user1.setTel("123");
        user2.setName("Kate");
        user2.setSurName("Danim");
        user2.setTel("456");
        user1.setID(1);
        user2.setID(2);
        user1.setBirthday(LocalDate.of(2000, Month.APRIL, 3));
        user2.setBirthday(LocalDate.of(1999, Month.JANUARY, 8));
        /*company.Car.Car car1 =new company.Car.Car();
        company.Car.Car car2 =new company.Car.Car();
        car1.setModel("bmv");
        car1.setNumber("AD9876");
        car1.setColor("red");
        car1.setDateOfIssue(LocalDate.of(1997,Month.AUGUST,7));
        car2.setColor("black");
        car2.setModel("sm");
        car2.setNumber("FT7547");
        car2.setDateOfIssue(LocalDate.of(1988,Month.JULY,15));
        carAdd.add(car1,car2);*/

        listUsers.add(user1, user2);
        //carAdd.add(car1,car2);

            //json file
        JsonIO jsonIO = new JsonIO();
        jsonIO.write(user1, "D://test1.json");

            //json file list
        JsonIO jsonIO1 = new JsonIO();
        jsonIO1.writeUsers(listUsers, "D://test3.json");
        //System.out.println("list users");

                // xml file
                XmlIO xmlIO = new XmlIO();
                xmlIO.write(user1, "D://test2.xml");
       // System.out.println(user1 + "  value user1 ");
                // xml file list
            XmlIO xmlIO1 = new XmlIO();
            xmlIO1.writeUsers(listUsers, "D://test4.xml");

    }

}