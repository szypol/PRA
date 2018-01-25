package Project3.entities;

import javax.persistence.*;

@Entity
@Table(name="Position",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"name"})})

public class Position {

    @Id
    @Column(name = "Name")
    private String name;

    @Column(name = "MinSalary")
    private double minsalary;

    @Column(name = "MaxSalary")
    private double maxsalary;

    public Position() {}

    public void setName (String nname) {name = nname;}
    public String getName() {return name;}
    public void setMinsalary (double mnsalary ) {minsalary = mnsalary;}
    public double getMinsalary() {return minsalary;}
    public void setMaxsalary (double mxsalary) {maxsalary = mxsalary;}
    public double getMaxsalary() {return maxsalary;}

}
