package company.IO;

import company.User.User;

import javax.xml.bind.JAXBException;
import java.io.IOException;


public interface IO {
    public void write(User temp, String name) throws  IOException, JAXBException;

    public User read(String name) throws IOException, JAXBException;
}
