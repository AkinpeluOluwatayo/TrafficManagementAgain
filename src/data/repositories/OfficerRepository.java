package data.repositories;
import data.models.Officer;
import data.models.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

public interface OfficerRepository extends MongoRepository<Officer, String> {
    Officer save(Officer officer);

    Officer findById(int id);

    ArrayList<Officer> findAll();

    void deleteById(int id);

    void deleteAll();

    void delete(Officer officer);

    long count();

}
