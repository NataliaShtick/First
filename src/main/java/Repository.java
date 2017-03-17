import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Repository {

       private List<User> users = new LinkedList();

        public Repository() {
        }

        public void add(User... user) {
            if(this.users == null) {
                this.users = new LinkedList();
            }

            User[] var3 = user;
            int var4 = user.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                User userVal = var3[var5];
                boolean f = false;
                Iterator var7 = this.users.iterator();

                while(var7.hasNext()) {
                    User listVal = (User)var7.next();
                    if(userVal.check(listVal)) {
                        f = true;
                        break;
                    }
                }

                if(!f) {
                    this.users.add(userVal);
                }
            }

        }

        public List<User> getByName(String SurName) {
            LinkedList res = new LinkedList();
            Iterator var3 = this.users.iterator();

             while(var3.hasNext()) {
                User value = (User)var3.next();
                if(value.getSurName().equalsIgnoreCase(SurName)) {
                    res.add(value);
                }
            }

            return res;
        }
    }


