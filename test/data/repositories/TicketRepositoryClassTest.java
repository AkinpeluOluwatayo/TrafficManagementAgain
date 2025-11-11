package data.repositories;

import data.models.Ticket;
import data.models.Offense;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketRepositoryClassTest {

    private TicketRepositoryClass repository;

    @BeforeEach
    void setUp() {
        repository = new TicketRepositoryClass();
    }

    @Test
    void testSaveTicketIncreasesByOne() {
        Ticket ticket = new Ticket(1, Offense.ONE_WAY);
        repository.save(ticket);
        assertEquals(1, repository.count());
    }

    @Test
    void testFindByIdReturnsTheRightTicket() {
        Ticket ticket = new Ticket(2, Offense.DRUNK_DRIVING);
        repository.save(ticket);
        Ticket found = repository.findById(2);
        assertNotNull(found);
        assertEquals(Offense.DRUNK_DRIVING, found.getOffense());
    }

    @Test
    void testFindAllReturnsAllTickets() {
        repository.save(new Ticket(1, Offense.OVER_SPEEDING));
        repository.save(new Ticket(2, Offense.ONE_WAY));
        ArrayList<Ticket> findAllOfThem = repository.findAll();
        assertEquals(2, findAllOfThem.size());
    }

    @Test
    void testDeleteByIdRemovesTicket() {
        repository.save(new Ticket(1, Offense.DRUNK_DRIVING));
        repository.deleteById(1);
        assertEquals(0, repository.count());
    }

    @Test
    void testDeleteAllClearsRepository() {
        repository.save(new Ticket(1, Offense.OVER_SPEEDING));
        repository.save(new Ticket(2, Offense.ONE_WAY));
        repository.deleteAll();
        assertEquals(0, repository.count());
    }

    @Test
    void testDeleteSpecificTicketRemovesOnlyThatTicket() {
        Ticket t1 = new Ticket(1, Offense.ONE_WAY);
        Ticket t2 = new Ticket(2, Offense.DRUNK_DRIVING);
        repository.save(t1);
        repository.save(t2);
        repository.delete(t1);
        assertEquals(1, repository.count());
        assertNull(repository.findById(1));
    }

    @Test
    void testSavingExistingTicketUpdatesItInsteadOfIncreasingCount() {
        Ticket ticket = new Ticket(1, Offense.ONE_WAY);
        repository.save(ticket);

        Ticket updated = new Ticket(1, Offense.ONE_WAY);
        repository.save(updated);

        Ticket found = repository.findById(1);
        assertEquals(Offense.ONE_WAY, found.getOffense());
        assertEquals(1, repository.count());
    }
}
