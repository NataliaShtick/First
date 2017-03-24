package company.IO;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import company.Repository;
import company.User.User;

import java.io.FileNotFoundException;
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
    public void writeUsers(Repository repository, String name) throws IOException {
        FileWriter file = new FileWriter(name);
        gson.toJson(repository.getUsers(), file);
        file.close();

    }

    @Override
    public User read(String name) throws IOException{
        FileReader file = new FileReader(name);
        return gson.fromJson(file,User.class);
    }
    public Repository readUsers(String name) throws FileNotFoundException {
        FileReader file = new FileReader(name);
        return gson.fromJson(file,new TypeToken<Repository>(){}.getType());
    }
}
