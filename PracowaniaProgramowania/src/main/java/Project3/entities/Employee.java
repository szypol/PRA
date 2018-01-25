package Project3.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name="Employee",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"EmployeeId"})})
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,
        property="refId", scope=Employee.class)

public class Employee {

    @Id @GeneratedValue
    @Column
    private int EmployeeId;

    @Column
    private String FirstName;

    @Column
    private String LastName;

    @Column(nullable = false, unique = true)
    private int PersonalId;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(referencedColumnName = "Name")
    Position Position;

    @Column
    private double Salary;

    @Column
    private ZonedDateTime EmploymentDate;

    @Column
    private String Status;

    public Employee() {}

    public Employee(String FirstName, String LastName, int PersonalId, Position Position, double Salary, ZonedDateTime EmploymentDate, String Status) {
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.PersonalId=PersonalId;
        this.Position=Position;
        this.Salary=Salary;
        this.EmploymentDate=EmploymentDate;
        this.Status=Status;
    }

    public int getEmployeeId(){return EmployeeId;}
    public void setFirstName (String FirstName) {this.FirstName = FirstName;}
    public String getFirstName() {return FirstName;}
    public void setLastMame (String LastName) {this.LastName = LastName;}
    public String getLastName() {return LastName;}
    public void setPersonalId (int PersonalId ) {this.PersonalId = PersonalId;}
    public int getPersonalId() {return PersonalId;}
    public void setPosition (Position Position) {this.Position = Position;}
    public Position getPosition() {return Position;}
    public void setSalary (double Salary ) {this.Salary = Salary;}
    public double getSalary() {return Salary;}
    public void setEmploymentDate (ZonedDateTime EmploymentDate) {this.EmploymentDate = EmploymentDate;}
    public ZonedDateTime getEmploymentDate() {return EmploymentDate;}
    public void setStatus (String Status) {this.Status = Status;}
    public String getStatus() {return Status;}
}
