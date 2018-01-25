package Project3.repositories;

import Project3.entities.Position;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PositionRepository extends CrudRepository<Position, String>, PagingAndSortingRepository<Position, String> {

    List<Position> findByName(String Name);

    @Query("select p.MinSalary From Position p where p.Name = ?1")
    Integer minsalaryonposition(String Name);

    @Query("select p.MaxSalary From Position p where p.Name = ?1")
    Integer maxsalaryonposition(String Name);
}
