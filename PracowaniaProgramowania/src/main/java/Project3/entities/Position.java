package Project3.entities;

import javax.persistence.*;

@Entity
@Table(name="Position",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"Name"})})

public class Position {

    @Id
    @Column
    private String Name;

    @Column
    private double MinSalary;

    @Column
    private double MaxSalary;

    public Position() {}

    public Position(String Name, double MinSalary, double MaxSalary) {
        this.Name=Name;
        this.MinSalary=MinSalary;
        this.MaxSalary=MaxSalary;
    }

    public void setName (String Name) {this.Name = Name;}
    public String getName() {return Name;}
    public void setMinSalary (double MinSalary ) {this.MinSalary = MinSalary;}
    public double getMinSalary() {return MinSalary;}
    public void setMaxSalary (double MaxSalary) {this.MaxSalary = MaxSalary;}
    public double getMaxSalary() {return MaxSalary;}

}
