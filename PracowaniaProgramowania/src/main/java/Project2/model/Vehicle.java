package Project2.model;

import javax.persistence.*;

@Entity
@Table(name="Vehicle",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"vehicle_id"})})

public class Vehicle {

    @Id
    @GeneratedValue
    @Column(name = "vehicle_id")
    private int vid;

    @Column(name = "brand")
    private String brand;

    @Column(name = "type")
    private String type;

    @Column(name = "capacity")
    private double capacity;

    @Column(name = "registration_number")
    private String registrationnumber;

    @Column(name = "status")
    private String status;

    public Vehicle() {}

    public int getId(){return vid;}
    public void setBrand (String nbrand) {brand = nbrand;}
    public String getBrand() {return brand;}
    public void setType (String ntype) {type = ntype;}
    public String getType() {return type;}
    public void setCapacity (double ccity ) {capacity = ccity;}
    public double getCapacity() {return capacity;}
    public void setRegistrationnumber (String rnumber) {registrationnumber = rnumber;}
    public String getRegistrationnumber() {return registrationnumber;}
    public void setStatus (String nstatus) {status = nstatus;}
    public String getStatus() {return status;}

}
