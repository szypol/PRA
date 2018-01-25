package Project3.repositories;

import Project3.entities.Vehicle;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer>, PagingAndSortingRepository<Vehicle, Integer> {

    List<Vehicle> findByVehicleIdOrRegistrationNumber(int VehicleId, String RegistrationNumber);
    List<Vehicle> findByBrand(String Brand);
    List<Vehicle> findByType(String Type);

    @Query("select v.Capacity from Vehicle v where v.VehicleId = ?1")
    Integer vehiclecapacity(int VehicleId);

    @Query("select count(*) from Vehicle v where v.Brand = ?1")
    Integer numberofvehicleswithbrand(String Brand);

    @Query("select count(*) from Vehicle v where v.Type = ?1")
    Integer numberofvehiclesintype(String Type);
}
