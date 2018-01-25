package Project3.repositories;

import Project3.entities.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>, PagingAndSortingRepository<Employee, Integer> {

    List<Employee> fingByPersonalId(int personalid);
    List<Employee> findByFirtNameAndLastName(String firstname, String lastname);
    List<Employee> findByEmployeeId(int eid);

    @Query("select count(*) from Employee e where e.Position= ?1")
    Integer numbeerofemployeesonposition(String position);
}
