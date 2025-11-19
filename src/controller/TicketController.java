package controllers;

import dtos.requests.TicketRequest;
import dtos.responses.TicketResponse;
import org.springframework.web.bind.annotation.RestController;
import services.TicketServicesInterface;

@RestController
public class TicketController {

    private TicketServicesInterface ticketServices;

    public TicketController(TicketServicesInterface ticketServices) {
        this.ticketServices = ticketServices;
    }

    public TicketResponse issueTicket(TicketRequest ticketRequest) {
        return ticketServices.issueTicket(ticketRequest);
    }

    public TicketResponse viewTicket(TicketRequest ticketRequest) {
        return ticketServices.viewTicket(ticketRequest);
    }

    public TicketResponse settleTicket(TicketRequest ticketRequest) {
        return ticketServices.settleTicket(ticketRequest);
    }
}
