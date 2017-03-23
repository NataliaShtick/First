import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@XmlRootElement
public class Repository {

       private List<User> users = new ArrayList<>();

       private boolean isUserExist (User user){

           for (User val : users) {
               if (val.getTel().equals(user.getTel()) && val.getID() == user.getID())

                   return true;
           }

           return false;
       }


       public String toString(){
           String res = "";

           for (User user : users){
               res += " " + user;
           }

           return res;
       }

       public void setUsers(ArrayList<User> users){
           this.users = users;
       }

    @XmlElement(name = "users")
       public List<User> getUsers(){
           return  users;
       }

        public void add(User ... u) {
            if(this.users == null) {
                this.users = new ArrayList<>();
            }

            for (User user : u){
                System.out.println(user);
                if (!isUserExist(user)) {
                    users.add(user);
                }
            }


            }

            public List<User> getByName(String surName) {
            List<User> res = new ArrayList<>();
            Iterator<User> var = users.iterator();

                if (var.hasNext()) {
                    do {
                        User value = var.next();
                        if (value.getSurName().equalsIgnoreCase(surName)) {
                            res.add(value);
                        }
                    } while (var.hasNext());
                }

            return res;
        }
    }