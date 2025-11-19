package services;

import data.models.Ticket;
import data.repositories.TicketRepository;
import dtos.requests.TicketRequest;
import dtos.responses.TicketResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.TicketServiceMapper;

@Service
public class TicketServices implements TicketServicesInterface {

    private TicketRepository ticketRepository;

    @Autowired
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

        Ticket ticket = ticketRepository.findById(ticketRequest.getIssuer().getUserId());

        TicketResponse response = new TicketResponse();

        if (ticket == null) {
            response.setMessage("Ticket not found");
            return response;
        }

        response.setMessage("Ticket found successfully");

        return response;
    }

    @Override
    public TicketResponse settleTicket(TicketRequest ticketRequest) {

        Ticket ticket = ticketRepository.findById(Integer.parseInt(ticketRequest.getIssuer().getUserId()));

        TicketResponse response = new TicketResponse();

        if (ticket == null) {
            response.setMessage("Ticket not found");
            return response;
        }

        if (ticket.isHasPaid()) {
            response.setMessage("Ticket already settled");
            response.setTicket(ticket);
            return response;
        }


        ticket.setHasPaid(true);

        ticketRepository.save(ticket);

        response.setMessage("Ticket settled successfully");
        response.setTicket(ticket);

        return response;
    }
}
