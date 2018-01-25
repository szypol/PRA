package Project3.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Job",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"JobId"})})
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,
        property="refId", scope=Job.class)

public class Job {

    @Id
    @GeneratedValue
    @Column
    private int JobId;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(referencedColumnName = "ClientId")
    Client Client;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Vehicle> Vehicle = new ArrayList<>();

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Employee> Employee = new ArrayList<>();

    @Column
    private String Load;

    @Column
    private int RouteLenght;

    @Column
    private ZonedDateTime Deadline;

    @Column
    private double Price;

    @Column
    private ZonedDateTime StartDate;

    @Column
    private ZonedDateTime EndDate;

    @Column
    private String Status;

    public Job() {}

    public Job(Client Client,List<Vehicle> Vehicle, List<Employee> Employee, String Load, int RouteLenght,ZonedDateTime Deadline, double Price,ZonedDateTime StartDate, ZonedDateTime EndDate, String Status) {
        this.Client=Client;
        this.Vehicle=Vehicle;
        this.Employee=Employee;
        this.Load=Load;
        this.RouteLenght=RouteLenght;
        this.Deadline=Deadline;
        this.Price=Price;
        this.StartDate=StartDate;
        this.EndDate=EndDate;
        this.Status=Status;
    }

    public int getJobId(){return JobId;}
    public void setClient (Client Client) {this.Client = Client;}
    public Client getClient() {return Client;}

    public void setJobId(int JobId) {
        this.JobId = JobId;
    }

    public List<Vehicle> getVehicle() {
        return Vehicle;
    }

    public void setVehicle(List<Vehicle> Vehicle) {
        this.Vehicle = Vehicle;
    }

    public List<Employee> getEmployee() {
        return Employee;
    }

    public void setEmployee(List<Employee> Employee) {
        this.Employee = Employee;
    }

    public void setLoad (String Load) {this.Load = Load;}
    public String getLoad() {return Load;}
    public void setRouteLenght (int RouteLenght) {this.RouteLenght = RouteLenght;}
    public int getRouteLenght() {return RouteLenght;}
    public void setDeadline (ZonedDateTime Deadline) {this.Deadline = Deadline;}
    public ZonedDateTime getDeadline() {return Deadline;}
    public void setPrice (double Price ) {this.Price = Price;}
    public double getPrice() {return Price;}
    public void setStartDate (ZonedDateTime StartDate) {this.StartDate = StartDate;}
    public ZonedDateTime getStartDate() {return StartDate;}
    public void setEndDate (ZonedDateTime EndDate) {this.EndDate = EndDate;}
    public ZonedDateTime getEndDate() {return EndDate;}
    public void setStatus (String Status) {this.Status = Status;}
    public String getStatus() {return Status;}

}
