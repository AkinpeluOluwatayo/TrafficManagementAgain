package services;

import data.models.Ticket;
import data.repositories.TicketRepository;
import dtos.requests.TicketRequest;
import dtos.responses.TicketResponse;
import utils.TicketServiceMapper;

public class TicketServices implements TicketServicesInterface {

    private TicketRepository ticketRepository;

    public TicketServices(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public TicketResponse issueTicket(TicketRequest ticketRequest) {

        Ticket ticket = TicketServiceMapper.mapToTicket(ticketRequest);


        ticketRepository.save(ticket);


        TicketResponse ticketResponse = new TicketResponse();
        ticketResponse.setMessage("Ticket issued successfully");

        return ticketResponse;
    }

    @Override
    public TicketResponse viewTicket(TicketRequest ticketRequest) {
        return null;
    }

    @Override
    public TicketResponse settleTicket(TicketRequest ticketRequest) {
        return null;
    }
}
