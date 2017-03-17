import java.time.LocalDate;
import java.lang.String;

public class Car implements Comparable<Car> {
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
        private String model;
        private Colors color;
        private String number;
        private LocalDate DateOfIssue;

        public Car() {
        }
        public Car (String model, Colors color, String number, LocalDate DateOfIssue){
            this.model = model;
            this.color = color;
            this.number = number;
            this.DateOfIssue = DateOfIssue;

        }
        public void setModel(String model) {
            this.model = model;
        }

        public String getModel() {
            return this.model;
        }

        public void setColor(String color) {
            this.color = Colors.valueOf(color);
        }

        public Colors getColor() {
            return this.color;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getNumber() {
            return this.number;
        }

        public void setDateOfIssue(LocalDate DateOfIssue) {
            this.DateOfIssue = DateOfIssue;
        }

        public LocalDate getDateOfIssue() {
            return this.DateOfIssue;
        }

        public String toString() {
            return "Model" + this.model + " Color " + this.color + " Number " + this.number + " Date of issue " + this.DateOfIssue;
        }

        public int compareTo(Car ob) {
            return this.getDateOfIssue().compareTo(ob.getDateOfIssue());
        }
    }


