package Project3.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name="Vehicle",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"VehicleId"})})
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,
        property="refId", scope=Vehicle.class)
public class Vehicle {

    @Id
    @GeneratedValue
    @Column
    private int VehicleId;

    @Column
    private String Brand;

    @Column
    private String Type;

    @Column
    private double Capacity;

    @Column
    private String RegistrationNumber;

    @Column
    private String Status;

    public Vehicle() {}

    public Vehicle(String Brand, String Type, double Capacity, String RegistrationNumber, String Status) {
        this.Brand=Brand;
        this.Type=Type;
        this.Capacity=Capacity;
        this.RegistrationNumber=RegistrationNumber;
        this.Status=Status;
    }

    public int getId(){return VehicleId;}
    public void setBrand (String Brand) {this.Brand = Brand;}
    public String getBrand() {return Brand;}
    public void setType (String Type) {this.Type = Type;}
    public String getType() {return Type;}
    public void setCapacity (double Capacity ) {this.Capacity = Capacity;}
    public double getCapacity() {return Capacity;}
    public void setRegistratioNumber (String RegistrationNumber) {this.RegistrationNumber = RegistrationNumber;}
    public String getRegistratioNumber() {return RegistrationNumber;}
    public void setStatus (String Status) {this.Status = Status;}
    public String getStatus() {return Status;}

}
