package Project3.repositories;

import Project3.entities.Job;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface JobRepository extends CrudRepository<Job, Integer>, PagingAndSortingRepository<Job, Integer> {

    List<Job> findByJobId(int JobId);
    List<Job> findByLoadAndClient(String Load, int ClientId);

    @Query("select j.Status from Job j where j.JobId = ?1")
    String jobstatus(int JobId);
}
