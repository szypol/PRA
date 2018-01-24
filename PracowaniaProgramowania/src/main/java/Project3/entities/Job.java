package Project3.entities;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Job",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"job_id"})})

public class Job {

    @Id
    @GeneratedValue
    @Column(name = "job_id")
    private int jid;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "client",referencedColumnName = "client_id")
    Client client;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Vehicle> vehicle = new ArrayList<>();

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Employee> employee = new ArrayList<>();

    @Column(name = "load")
    private String load;

    @Column(name = "route_lenght")
    private int routelenght;

    @Column(name = "deadline")
    private ZonedDateTime deadline;

    @Column(name = "price")
    private double price;

    @Column(name = "start_date")
    private ZonedDateTime startdate;

    @Column(name = "end_date")
    private ZonedDateTime enddate;

    @Column(name = "status")
    private String status;

    public Job() {}

    public int getJid(){return jid;}
    public void setClient (Client nclient) {client = nclient;}
    public Client getClient() {return client;}

    public void setJid(int jid) {
        this.jid = jid;
    }

    public List<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(List<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public void setLoad (String nload) {load = nload;}
    public String getLoad() {return load;}
    public void setRoutelenght (int rlenght) {routelenght = rlenght;}
    public int getRoutelenght() {return routelenght;}
    public void setDeadline (ZonedDateTime dline) {deadline = dline;}
    public ZonedDateTime getDeadline() {return deadline;}
    public void setPrice (double nprice ) {price = nprice;}
    public double getPrice() {return price;}
    public void setStartdate (ZonedDateTime sdate) {startdate = sdate;}
    public ZonedDateTime getStartdate() {return startdate;}
    public void setEnddate (ZonedDateTime edate) {enddate = edate;}
    public ZonedDateTime getEnddate() {return enddate;}
    public void setStatus (String nstatus) {status = nstatus;}
    public String getStatus() {return status;}

}
