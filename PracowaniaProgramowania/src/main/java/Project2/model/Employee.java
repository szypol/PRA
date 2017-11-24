package Project2.model;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Table(name="Employee",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"employee_id"})})

public class Employee {

    @Id @GeneratedValue
    @Column(name = "employee_id")
    private int eid;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "personal_id", nullable = false, unique = true)
    private int personalid;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "position",referencedColumnName = "name")
    Position position;

    @Column(name = "salary")
    private double salary;

    @Column(name = "employment_date")
    private ZonedDateTime employmentdate;

    @Column(name = "status")
    private String status;

    public Employee() {}

    public int getId(){return eid;}
    public void setFirstname (String fname) {firstname = fname;}
    public String getFirstname() {return firstname;}
    public void setLastname (String lname) {lastname = lname;}
    public String getLastname() {return lastname;}
    public void setPersonalid (int pid ) {personalid = pid;}
    public int getPersonalid() {return personalid;}
    public void setPosition (Position nposition) {position = nposition;}
    public Position getPosition() {return position;}
    public void setSalary (double nsalary ) {salary = nsalary;}
    public double getSalary() {return salary;}
    public void setEmploymentdate (ZonedDateTime emdate) {employmentdate = emdate;}
    public ZonedDateTime getEmploymentdate() {return employmentdate;}
    public void setStatus (String nstatus) {status = nstatus;}
    public String getStatus() {return status;}
}
