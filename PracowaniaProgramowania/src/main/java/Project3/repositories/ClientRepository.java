package Project3.repositories;

import Project3.entities.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Integer>, PagingAndSortingRepository<Client, Integer> {

    List<Client> findByClientId(int cid);
    List<Client> findByNIP(int nip);
    List<Client> findByFirstNameAndLastName(String firstname, String lastname);
    List<Client> findByCompanyNameAndLocality(String companyname, String locality);

    @Query("select count(*) from Client c where c.Locality = ?1")
    Integer numberofclientsfrom(String locality);

}
