package Project2.serialization;

import Project2.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.geometry.Pos;

import javax.management.Query;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONserialization {

    ObjectMapper objectMapper = new ObjectMapper();

    public void JSONserialization() {}

    public void SerializeClient (List<Client> cli) throws IOException
    {
        System.out.println("Serializuje Klientow!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        String x = objectMapper.writeValueAsString(cli);
        objectMapper.writeValue(new File("Client.json"), x);
    }

    public void SerializeEmployee (List <Employee> emp) throws IOException
    {
        System.out.println("Serializuje Pracownikow!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        String x = objectMapper.writeValueAsString(emp);
        objectMapper.writeValue(new File("Employee.json"), x);
    }

    public void SerializeJob (List <Job> job) throws IOException
    {
        System.out.println("Serializuje Zlecenia!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        String x = objectMapper.writeValueAsString(job);
        objectMapper.writeValue(new File("Job.json"), x);
    }

    public void SerializePosition (List<Position> pos) throws IOException
    {
        System.out.println("Serializuje Klienta!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        String x = objectMapper.writeValueAsString(pos);
        objectMapper.writeValue(new File("Position.json"), x);
    }

    public void SerializeVehicle (List <Vehicle> veh) throws IOException
    {
        System.out.println("Serializuje Auto!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        String x = objectMapper.writeValueAsString(veh);
        objectMapper.writeValue(new File("Vehicle.json"), x);
    }
}
