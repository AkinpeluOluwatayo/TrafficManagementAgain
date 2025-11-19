package data.repositories;

import data.models.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

public interface TicketRepository extends MongoRepository<Ticket,String> {
    Ticket save(Ticket ticket);

    Ticket findById(int id);

    ArrayList<Ticket> findAll();

    void deleteById(int id);

    void deleteAll();

    void delete(Ticket ticket);

    long count();
}
