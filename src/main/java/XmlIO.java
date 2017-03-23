import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class XmlIO implements IO {

    @Override
    public void write(User temp, String name) throws IOException, JAXBException {
        PrintWriter out = new PrintWriter(new File(name));
        JAXBContext context = JAXBContext.newInstance(User.class);
        Marshaller m = context.createMarshaller();

        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(temp, out);

        out.close();
    }

    @Override
    public User read(String name) throws IOException, JAXBException {
        JAXBContext jc = JAXBContext.newInstance(User.class);
        Unmarshaller u = jc.createUnmarshaller();

        return (User) u.unmarshal(new File(name));
    }
}
