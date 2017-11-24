package Project2.serialization;

import Project2.model.*;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import javafx.geometry.Pos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;

public class XMLdeserialization {

    File file = new File("target/serialization.xml");
    XmlMapper mapper = new XmlMapper();

    public Client SerializeClient () throws IOException
    {
        String xml = inputStreamToString(new FileInputStream(file));
        return (mapper.readValue(xml, Client.class));
    }

    public Employee SerializeEmployee () throws IOException
    {
        String xml = inputStreamToString(new FileInputStream(file));
        return (mapper.readValue(xml, Employee.class));
    }

    public Job SerializeJob () throws IOException
    {
        String xml = inputStreamToString(new FileInputStream(file));
        return (mapper.readValue(xml, Job.class));
    }

    public Position SerializePosition () throws IOException
    {
        String xml = inputStreamToString(new FileInputStream(file));
        return (mapper.readValue(xml, Position.class));
    }

    public Vehicle SerializeVehicle () throws IOException
    {
        String xml = inputStreamToString(new FileInputStream(file));
        return (mapper.readValue(xml, Vehicle.class));
    }



}
