package utils;

import data.models.Ticket;
import dtos.requests.TicketRequest;
import dtos.responses.TicketResponse;

public class TicketServiceMapper {

    public static Ticket mapToTicket(TicketRequest request) {
        Ticket ticket = new Ticket();

        ticket.setVehicle(request.getVehicle());
        ticket.setOffense(request.getOffense());
        ticket.setDateOfBooking(request.getDateOfBooking());
        ticket.setIssuer(request.getIssuer());
        ticket.setHasPaid(request.isHasPaid());
        ticket.setDateOfPayment(request.getDateOfPayment());

        return ticket;
    }

}
