package Project2.serialization;

import Project2.model.*;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XMLdeserialization {

    File file = new File("target/serialization.xml");
    XmlMapper mapper = new XmlMapper();

    public Client SerializeClient () throws IOException
    {
        return (mapper.readValue(file, Client.class));
    }

    public Employee SerializeEmployee () throws IOException
    {
        return (mapper.readValue(file, Employee.class));
    }

    public Job SerializeJob () throws IOException
    {
        return (mapper.readValue(file, Job.class));
    }

    public Position SerializePosition () throws IOException
    {
        return (mapper.readValue(file, Position.class));
    }

    public Vehicle SerializeVehicle () throws IOException
    {
        return (mapper.readValue(file, Vehicle.class));
    }



}
