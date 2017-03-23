
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Month;


public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Repository repository = new Repository();
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
        user1.setBirthday(LocalDate.of(2000,Month.APRIL,3));
        user2.setBirthday(LocalDate.of(1999,Month.JANUARY,8));
        /*Car car1 =new Car();
        Car car2 =new Car();
        car1.setModel("bmv");
        car1.setNumber("AD9876");
        car1.setColor("red");
        car2.setColor("black");
        car2.setModel("sm");
        car2.setNumber("FT7547");
        carAdd.add(car1,car2);*/

        repository.add(user1,user2);

       // repository.add(user1, user2);
       //System.out.println(repository);

       /* try {
            PrintWriter out = new PrintWriter(new File("D://temp.xml"));
            JAXBContext context = JAXBContext.newInstance(Repository.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            m.marshal(repository, out);


            out.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (JAXBException e) {
            e.printStackTrace();
        }*/

    }
}