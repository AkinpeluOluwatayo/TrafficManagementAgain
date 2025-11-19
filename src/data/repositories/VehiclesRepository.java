package data.repositories;

import data.models.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

public interface VehiclesRepository extends MongoRepository<Vehicle, String> {
    Vehicle save(Vehicle vehicle);

    Vehicle findById(int id);

    ArrayList<Vehicle> findAll();

    void deleteById(int id);

    void deleteAll();

    void delete(Vehicle vehicle);

    long count();
}