package Project3.entities;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class,
        property = "refId", scope = Client.class)
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer clientId;

    @Column
    private String clientNumber;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String companyName;

    @Column
    private String NIP;

    @Column
    private String locality;

    public Client () {

    }

    public Client (int clientId, String clientNumber, String firstName, String lastName, String companyName, String NIP, String locality) {

        this.clientId=clientId;
        this.clientNumber=clientNumber;
        this.firstName=firstName;
        this.lastName=lastName;
        this.companyName=companyName;
        this.NIP=NIP;
        this.locality=locality;

    }

    public int getClientId() { return clientId; }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientnumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }
}
