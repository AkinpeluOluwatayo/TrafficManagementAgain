package services;

import dtos.requests.TicketRequest;
import dtos.responses.TicketResponse;

public interface TicketServicesInterface {
    TicketResponse issueTicket(TicketRequest ticketRequest);
    TicketResponse viewTicket(TicketRequest ticketRequest);
    TicketResponse settleTicket(TicketRequest ticketRequest);

}
