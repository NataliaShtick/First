import java.time.LocalDate;

public class User implements Comparable<User> {
    //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)


        private int ID;
        private String Name;
        private String SurName;
        private String Tel;
        private LocalDate Birthday;

        public User(String Name, String SurName, String Tel, LocalDate Birthday) {
            this.Name = Name;
            this.SurName = SurName;
            this.Tel = Tel;
            this.Birthday = Birthday;
        }
        public User() {

        }
        public void setID(int ID) {
            this.ID = ID;
        }

        public int getID() {
            return this.ID;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getName() {
            return this.Name;
        }

        public void setSurName(String SurName) {
            this.SurName = SurName;
        }

        public String getSurName() {
            return this.SurName;
        }

        public void setTel(String Tel) {
            this.Tel = Tel;
        }

        public String getTel() {
            return this.Tel;
        }

        public void setBirthday(LocalDate Birthday) {
            this.Birthday = Birthday;
        }

        public LocalDate getBirthday() {
            return this.Birthday;
        }

        public String toString() {
            return "ID - " + this.ID + " Name - " + this.Name + " Surname - " + this.SurName + " Tel - " + this.Tel + " Birthday - " + this.Birthday;
        }

        public int compareTo(User SurName) {
            return this.SurName.compareTo(SurName.getSurName());
        }

        public boolean check(User user) {
            return this.getTel().equalsIgnoreCase(user.getTel()) || this.getID() == user.getID();
        }
    }


