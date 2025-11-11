package data.repositories;

import data.models.Ticket;
import java.util.ArrayList;

public class TicketRepositoryClass implements TicketRepository {
    private final ArrayList<Ticket> tickets = new ArrayList<>();

    @Override
    public Ticket save(Ticket ticket) {
        Ticket existing = findById(ticket.getUserId());
        if (existing != null) {
            tickets.remove(existing);
        }
        tickets.add(ticket);
        return ticket;
    }

    @Override
    public Ticket findById(int id) {
        for (Ticket t : tickets) {
            if (t.getUserId() == id) {
                return t;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Ticket> findAll() {
        return new ArrayList<>(tickets);
    }

    @Override
    public void deleteById(int id) {
        tickets.removeIf(t -> t.getUserId() == id);
    }

    @Override
    public void deleteAll() {
        tickets.clear();
    }

    @Override
    public void delete(Ticket ticket) {
        tickets.remove(ticket);
    }

    @Override
    public long count() {
        return tickets.size();
    }
}
