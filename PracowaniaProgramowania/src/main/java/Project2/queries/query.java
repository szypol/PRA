package Project2.queries;

import Project2.model.Client;
import Project2.model.Employee;
import Project2.model.Job;
import Project2.model.Vehicle;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class query {

    EntityManager Menager;

    public query(EntityManager Manager)
    {
        this.Menager = Manager;
    }

    public List<Employee> Getdrivers(String position)
    {
        Query query = Menager.createQuery("SELECT e FROM Employee e WHERE e.position=:name");
        return query.setParameter("name", position).getResultList();

    }

    public List<Vehicle> Getvehiclebrands ()
    {
        Query query = Menager.createQuery("SELECT v.brand FROM Vehicle v");
        return query.getResultList();
    }

    public List<Client> Getclientbylocality (String locality)
    {
        Query query = Menager.createQuery("SELECT c FROM Client c WHERE c.locality = :name");
        return query.setParameter("name", locality).getResultList();
    }

    public List<Job> GetJobbyload (String load)
    {
        Query query = Menager.createQuery("SELECT j FROM Job j WHERE j.load=:name");
        return query.setParameter("name", load).getResultList();
    }

    public List<Job> Getemployeebystatus (String status)
    {
        Query query = Menager.createQuery("SELECT e FROM Employee e WHERE e.status =:name");
        return query.setParameter("name", status).getResultList();
    }

    public List<Vehicle> Getvehiclebystatus (String status)
    {
        Query query = Menager.createQuery("SELECT v FROM Vehicle v WHERE v.status=:name");
        return query.setParameter("name", status).getResultList();
    }

}
