package data.repositories;

import data.models.Officer;
import data.models.Owner;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

public interface OwnerRepository extends MongoRepository<Owner,String> {

    Officer save(Officer officer);

    Officer findById(int id);

    ArrayList<Officer> findAll();

    void deleteById(int id);

    void deleteAll();

    void delete(Officer officer);

    long count();

}
