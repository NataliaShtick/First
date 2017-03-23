import java.time.LocalDate;
import java.lang.String;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
    public class Car implements Comparable<Car> {
        private String model;
        private Colors color;
        private String number;
        private LocalDate dateOfIssue;
    public Car() {
        super();
        }
        public Car (String model, Colors color, String number, LocalDate DateOfIssue){
            this.model = model;
            this.color = color;
            this.number = number;
            this.dateOfIssue = dateOfIssue;

        }
        @XmlElement(name = "model")
        public void setModel(String model) {
            this.model = model;
        }

        public String getModel() {
            return this.model;
        }
         @XmlElement(name = "color")
        public void setColor(String color) {
            this.color = Colors.valueOf(color);
        }

        public Colors getColor() {
            return this.color;
        }
         @XmlElement(name = "number")
        public void setNumber(String number) {
            this.number = number;
        }

        public String getNumber() {
            return this.number;
        }
    @XmlElement(name = "date")
    @XmlJavaTypeAdapter(value = DateAdapter.class)
        public void setDateOfIssue(LocalDate dateOfIssue) {
            this.dateOfIssue = dateOfIssue;
        }

        public LocalDate getDateOfIssue() {
            return this.dateOfIssue;
        }

        public String toString() {
            return "Model" + this.model + " Color " + this.color + " Number " + this.number + " Date of issue " + this.dateOfIssue;
        }

        public int compareTo(Car ob) {
            return this.dateOfIssue.compareTo(ob.getDateOfIssue());
        }



    //public boolean check1(Car car) {
        //return this.getNumber().equalsIgnoreCase(car.getNumber());
    //}


}


