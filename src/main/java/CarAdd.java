import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CarAdd {

    private List<Car> cars = new ArrayList<>();

    private boolean isCarExist (Car car){

        for (Car val : cars) {
            if (val.getNumber().equals(car.getNumber()))

                return true;
        }


        return false;
    }


    public String toString(){
        String res = "";

        for (Car car : cars){
            res += " " + car;
        }

        return res;
    }

    public void setCars(ArrayList<Car> cars){
        this.cars = cars;
    }

    @XmlElement(name = "cars")
    public List<Car> getCars(){
        return  cars;
    }

    public void add(Car ... c) {
        if(this.cars == null) {
            this.cars = new ArrayList<>();
        }

        for (Car car : c){
            System.out.println(car);
            if (!isCarExist(car)) {
                cars.add(car);
            }
        }


    }

    public List<Car> getByNumber(String number) {
        List<Car> res = new ArrayList<>();
        Iterator<Car> var = cars.iterator();

        if (var.hasNext()) {
            do {
                Car value = var.next();
                if (value.getNumber().equalsIgnoreCase(number)) {
                    res.add(value);
                }
            } while (var.hasNext());
        }

        return res;
    }
}