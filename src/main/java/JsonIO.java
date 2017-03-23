import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonIO implements IO {
    Gson gson = new Gson();

    @Override
    public void write(User user, String name) throws IOException {
        FileWriter file = new FileWriter(name);
        gson.toJson(user,file);
        file.close();
    }

    @Override
    public User read(String name) throws IOException{
        FileReader file = new FileReader(name);
        return gson.fromJson(file,User.class);
    }
}
