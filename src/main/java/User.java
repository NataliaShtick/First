import java.time.LocalDate;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


public class User implements Comparable<User> {
        private int id;
        private String name;
        private String surName;
        private String tel;
        private LocalDate birthday = LocalDate.now();

        public User(String name, String surName, String tel, LocalDate birthday) {
            this.name = name;
            this.surName = surName;
            this.tel = tel;
            this.birthday = birthday;
        }
        public User() {
            super();
        }

        @XmlElement(name = "id")
        public void setID(int ID) {
            this.id = ID;
        }

        public int getID() {
            return this.id;
        }

       @XmlElement(name = "name")
       public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

       @XmlElement(name = "sur")
       public void setSurName(String surName) {
            this.surName = surName;
        }

        public String getSurName() {
            return this.surName;
        }

       @XmlElement(name = "tel")
       public void setTel(String tel) {
            this.tel = tel;
        }

        public String getTel() {
            return this.tel;
        }

       @XmlElement(name = "birth")
       @XmlJavaTypeAdapter(value = DateAdapter.class)
       public void setBirthday(LocalDate birthday) {
            this.birthday = birthday;
        }

        public LocalDate getBirthday() {
            return this.birthday;
        }

        public String toString() {
            return "ID - " + this.id + " Name - " + this.name + " Surname - " + this.surName + " Tel - " + this.tel + " Birthday - " + this.birthday;
        }

        public int compareTo(User user) {
            return this.surName.compareTo(user.getSurName());
        }

       // public boolean check(User user) {
         //   return this.getTel().equalsIgnoreCase(user.getTel()) || this.getID() == user.getID();
        //}
    }