package Project3.repositories;

import Project3.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import Project3.services.ClientService;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClientRepository extends CrudRepository<Client, Integer>, PagingAndSortingRepository<Client, Integer> {

    List<Client> findByClientId(int ClientId);
    List<Client> findByNIP(int NIP);
    List<Client> findByFirstNameAndLastName(String FirstName, String LastName);
    List<Client> findByCompanyNameAndLocality(String companyname, String Locality);

    @Query("select count(*) from Client c where c.Locality = ?1")
    Integer numberofclientsfrom(String Locality);

    int checkIfExist(Integer id);


}
