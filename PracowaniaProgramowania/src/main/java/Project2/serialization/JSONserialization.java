package Project2.serialization;

import Project2.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JSONserialization {

    public void JSONserialization() {}

    public void SerializeClient (Client cli) throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("target/serialization.json"), cli);
    }

    public void SerializeEmployee (Employee emp) throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("target/serialization.json"), emp);
    }

    public void SerializeJob (Job job) throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("target/serialization.json"), job);
    }

    public void SerializePosition (Position pos) throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("target/serialization.json"), pos);
    }

    public void SerializeVehicle (Vehicle veh) throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("target/serialization.json"), veh);
    }
}
