package data.repositories;

import data.models.Officer;
import data.models.Owner;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface OwnerRepository extends MongoRepository<Owner,String> {

    Officer save(Officer officer);

    Officer findById(String id);

    ArrayList<Officer> findAll();

    void deleteById(String id);

    void deleteAll();

    void delete(Officer officer);

    long count();

}
