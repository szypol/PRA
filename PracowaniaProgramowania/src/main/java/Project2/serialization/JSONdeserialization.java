package Project2.serialization;

import Project2.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JSONdeserialization {

    public void JSONdeserialization() {}

    public Client DeserializeClient () throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        return (objectMapper.readValue(new File("target/serialization.json"), Client.class));
    }

    public Employee DeserializeEmployee () throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        return (objectMapper.readValue(new File("target/serialization.json"), Employee.class));
    }

    public Job DeserializeJob () throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        return (objectMapper.readValue(new File("target/serialization.json"), Job.class));
    }

    public Position DeserializePosition () throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        return (objectMapper.readValue(new File("target/serialization.json"), Position.class));
    }

    public Vehicle DeserializeVehicle () throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        return (objectMapper.readValue(new File("target/serialization.json"), Vehicle.class));
    }
}
