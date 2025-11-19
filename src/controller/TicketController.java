package controllers;

import dtos.requests.TicketRequest;
import dtos.responses.TicketResponse;
import services.TicketServicesInterface;

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
