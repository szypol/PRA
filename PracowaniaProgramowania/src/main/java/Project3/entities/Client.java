package Project3.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

import static org.hibernate.sql.InFragment.NULL;

@Entity
@Table(name="Client",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"ClientId"})})
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,
        property="refId", scope=Client.class)

public class Client {

    @Id
    @GeneratedValue
    private  int id;

    @Column
    private String ClientId;

    @Column
    private String FirstName;

    @Column
    private String LastName;

    @Column
    private String CompanyName;

    @Column
    private String NIP;

    @Column
    private String Locality;

    public Client() {}

    public Client(String FirstName, String LastName, String CompanyName, String NIP, String Locality)
    {
        if(CompanyName == "NULL")
        {
            this.FirstName=FirstName;
            this.LastName=LastName;
            this.Locality=Locality;
            this.CompanyName = NULL;
        }
        else
        {
            this.FirstName=FirstName;
            this.LastName=LastName;
            this.Locality=Locality;
            this.CompanyName=CompanyName;
            this.NIP=NIP;
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClientId(String clientId) {
        ClientId = clientId;
    }



    public String getClientId(){return ClientId;}
    public void setFirstname (String FirstName) {this.FirstName = FirstName;}
    public String getFirstname() {return FirstName;}
    public void setLastname (String LastName) {this.LastName = LastName;}
    public String getLastname() {return LastName;}
    public void setCompanyname (String CompanyName ) {this.CompanyName = CompanyName;}
    public String getCompanyname() {return CompanyName;}
    public void setNip (String NIP) {this.NIP = NIP;}
    public String getNip() {return NIP;}
    public void setLocality (String Locality ) {this.Locality = Locality;}
    public String getLocality() {return Locality;}
}
