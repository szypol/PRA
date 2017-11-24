package Project2.serialization;

import Project2.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;

//http://www.baeldung.com/jackson-xml-serialization-and-deserialization
public class XMLserialization {

    XmlMapper mapper = new XmlMapper();

    public void SerializeClient (List<Client> cli) throws IOException
    {
        System.out.println("Serializuje Klientow!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        mapper.writeValue(new File("Client.xml"), cli);
    }

    public void SerializeEmployee (List<Employee> emp) throws IOException
    {
        mapper.writeValue(new File("Employee.xml"), emp);
    }

    public void SerializeJob (List<Job> job) throws IOException
    {
        mapper.writeValue(new File("Job.xml"), job);
    }

    public void SerializePosition (List<Position> pos) throws IOException
    {
        mapper.writeValue(new File("Position.xml"), pos);
    }

    public void SerializeVehicle (List<Vehicle> veh) throws IOException
    {
        mapper.writeValue(new File("Vehicle.xml"), veh);
    }

}
