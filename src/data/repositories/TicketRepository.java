package data.repositories;

import data.models.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TicketRepository extends MongoRepository<Ticket,String> {
    Ticket save(Ticket ticket);

    Ticket findById(String id);

    ArrayList<Ticket> findAll();

    void deleteById(String id);

    void deleteAll();

    void delete(Ticket ticket);

    long count();
}
