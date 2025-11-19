package data.repositories;

import data.models.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface VehiclesRepository extends MongoRepository<Vehicle, String> {
    Vehicle save(Vehicle vehicle);

    Vehicle findById(int id);

    ArrayList<Vehicle> findAll();

    void deleteById(int id);

    void deleteAll();

    void delete(Vehicle vehicle);

    long count();
}