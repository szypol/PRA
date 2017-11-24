package Project2.serialization;

import Project2.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;

//http://www.baeldung.com/jackson-xml-serialization-and-deserialization
public class XMLserialization {

    XmlMapper mapper = new XmlMapper();

    public void SerializeClient (Client cli) throws IOException
    {
        mapper.writeValue(new File("target/serialization.xml"), cli);
        File file = new File("target/serialization.xml");
        assertNotNull(file);
    }

    public void SerializeEmployee (Employee emp) throws IOException
    {
        mapper.writeValue(new File("target/serialization.xml"), emp);
        File file = new File("target/serialization.xml");
        assertNotNull(file);
    }

    public void SerializeJob (Job job) throws IOException
    {
        mapper.writeValue(new File("target/serialization.xml"), job);
        File file = new File("target/serialization.xml");
        assertNotNull(file);
    }

    public void SerializePosition (Position pos) throws IOException
    {
        mapper.writeValue(new File("target/serialization.xml"), pos);
        File file = new File("target/serialization.xml");
        assertNotNull(file);
    }

    public void SerializeVehicle (Vehicle veh) throws IOException
    {
        mapper.writeValue(new File("target/serialization.xml"), veh);
        File file = new File("target/serialization.xml");
        assertNotNull(file);
    }

}
