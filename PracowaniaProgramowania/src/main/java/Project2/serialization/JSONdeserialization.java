package Project2.serialization;

import Project2.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JSONdeserialization {

    public void JSONdeserialization() {}

    ObjectMapper objectMapper = new ObjectMapper();

    public Client DeserializeClient () throws IOException
    {
        return (objectMapper.readValue(new File("Clientd.json"), Client.class));
    }

    public Employee DeserializeEmployee () throws IOException
    {
        return (objectMapper.readValue(new File("Employee.json"), Employee.class));
    }

    public Job DeserializeJob () throws IOException
    {
        return (objectMapper.readValue(new File("Job.json"), Job.class));
    }

    public Position DeserializePosition () throws IOException
    {
        return (objectMapper.readValue(new File("Position.json"), Position.class));
    }

    public Vehicle DeserializeVehicle () throws IOException
    {
        return (objectMapper.readValue(new File("Vehicle.json"), Vehicle.class));
    }
}
