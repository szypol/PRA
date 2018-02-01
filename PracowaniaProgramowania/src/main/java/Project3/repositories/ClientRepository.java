package Project3.repositories;

import Project3.entities.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClientRepository extends CrudRepository<Client, Integer>, PagingAndSortingRepository<Client, Integer> {

    Client findByClientId(Integer clientId);
    //Client getByNIP(int NIP);
    //Client getByFirstNameAndLastName(String firstName, String lastName);
    //Client getByCompanyNameAndLocality(String companyName, String locality);

    @Query("select count(*) from Client c where c.clientId = ?1")
    Integer checkIfExist(Integer clientId);

}
