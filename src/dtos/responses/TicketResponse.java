package dtos.responses;

import data.models.Offense;
import data.models.Officer;
import data.models.Ticket;
import data.models.Vehicle;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TicketResponse {
    private Vehicle vehicle;
    private Offense offense;
    private boolean hasPaid;
    private Officer issuer;
    private LocalDateTime dateOfBooking =  LocalDateTime.now();
    private LocalDateTime dateOfPayment =  LocalDateTime.now();
    private String message;
    private Ticket ticket;


}
