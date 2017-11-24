package Project2;

import Project2.model.Client;
import Project2.model.Employee;
import Project2.model.Job;
import Project2.model.Position;
import Project2.model.Vehicle;
import Project2.queries.query;
import Project2.serialization.XMLserialization;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Random;

public class Manager {
    public static void main(String [ ] args) {

        System.out.println("Start");
        EntityManager entity = null;
        EntityManagerFactory manager = null;

            try
            {
                manager = Persistence.createEntityManagerFactory("hibernate-dynamic");
                entity = manager.createEntityManager();
                entity.getTransaction().begin();

                //create elements

                Position p1 = new Position();
                p1.setName("kierowca");
                p1.setMinsalary(2000.00);
                p1.setMaxsalary(5000.00);

                Position p2 = new Position();
                p2.setName("kierownik");
                p2.setMinsalary(3000.00);
                p2.setMaxsalary(7000.00);

                Employee e1 = new Employee();
                e1.setFirstname("Pawel");
                e1.setLastname("Maka");
                e1.setPersonalid(new Random().nextInt());
                e1.setPosition(p1);
                e1.setSalary(2000.00);
                e1.setEmploymentdate(ZonedDateTime.of(2009,10,20,8,00,00,00,ZoneId.systemDefault()));
                e1.setStatus("Wolny");

                Employee e2 = new Employee();
                e2.setFirstname("Robert");
                e2.setLastname("Bok");
                e2.setPersonalid(new Random().nextInt());
                e2.setPosition(p1);
                e2.setSalary(3000.00);
                e2.setEmploymentdate(ZonedDateTime.of(2009,11,20,8,00,00,00,ZoneId.systemDefault()));
                e2.setStatus("Wolny");

                Employee e3= new Employee();
                e3.setFirstname("Sebastian");
                e3.setLastname("Barszcz");
                e3.setPersonalid(new Random().nextInt());
                e3.setPosition(p1);
                e3.setSalary(4000.00);
                e3.setEmploymentdate(ZonedDateTime.of(2009,9,20,8,00,00,00,ZoneId.systemDefault()));
                e3.setStatus("Wolny");

                Client c1 = new Client();
                c1.setFirstname("Wladyslaw");
                c1.setLastname("Jagiello");
                c1.setCompanyname("PiriPiri");
                c1.setNip(1211100908);
                c1.setLocality("Ciechocinek");

                Vehicle v1 = new Vehicle();
                v1.setBrand("Scania");
                v1.setType("Truck");
                v1.setCapacity(10000);
                v1.setRegistrationnumber("PO52500");
                v1.setStatus("Wolny");

                Vehicle v2 = new Vehicle();
                v2.setBrand("Volvo");
                v2.setType("Truck");
                v2.setCapacity(10000);
                v2.setRegistrationnumber("PO65400");
                v2.setStatus("Wolny");

                Job j1 = new Job();
                j1.setClient(c1);
                j1.getEmployee().add(e1);
                j1.getEmployee().add(e2);
                j1.getEmployee().add(e3);
                j1.getVehicle().add(v1);
                j1.getVehicle().add(v2);
                j1.setLoad("Tortilla");
                j1.setRoutelenght(178);
                j1.setDeadline(ZonedDateTime.of(2017,11,22,8,0,0,0,ZoneId.systemDefault()));
                j1.setPrice(500.00);
                j1.setStartdate(ZonedDateTime.of(2017,11,21,22,0,0,0,ZoneId.systemDefault()));
                j1.setEnddate(ZonedDateTime.of(2017,11,22,10,0,0,0,ZoneId.systemDefault()));
                j1.setStatus("Dostarczone - Spoznione");

                //table save

                entity.persist(p1);
                entity.persist(p2);
                entity.persist(v1);
                entity.persist(v2);
                entity.persist(e1);
                entity.persist(e2);
                entity.persist(e3);
                entity.persist(c1);
                entity.persist(j1);

                entity.getTransaction().commit();

                System.out.println("Done");

                querydziala(entity);

                entity.close();

        }
        catch (Throwable ex)
        {
            System.err.println("Initial SessionFactory creation failed." + ex);
        }
        finally
        {
            manager.close();
        }

    }

    static void querydziala(EntityManager entityManager) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Vehicle> employees = new query(entityManager).Getvehiclebrands();
        try{
            String cos = objectMapper.writeValueAsString(employees);
           System.out.println("DZIALALLALALALALALLA : " + cos);
        }
       catch(Exception e)
        {
            e.printStackTrace();
        }


    }


}
