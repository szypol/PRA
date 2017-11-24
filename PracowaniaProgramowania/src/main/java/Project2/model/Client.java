package Project2.model;

import javax.persistence.*;

@Entity
@Table(name="Client",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"client_id"})})

public class Client {

    @Id
    @GeneratedValue
    @Column(name = "client_id")
    private int cid;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "company_name")
    private String companyname;

    @Column(name = "NIP")
    private int nip;

    @Column(name = "locality")
    private String locality;

    public Client() {}

    public int getId(){return cid;}
    public void setFirstname (String fname) {firstname = fname;}
    public String getFirstname() {return firstname;}
    public void setLastname (String lname) {lastname = lname;}
    public String getLastname() {return lastname;}
    public void setCompanyname (String cname ) {companyname = cname;}
    public String getCompanyname() {return companyname;}
    public void setNip (int nnip) {nip = nnip;}
    public int getNip() {return nip;}
    public void setLocality (String nlocality ) {locality = nlocality;}
    public String getLocality() {return locality;}
}
