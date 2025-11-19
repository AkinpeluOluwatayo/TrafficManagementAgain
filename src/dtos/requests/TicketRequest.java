package dtos.requests;

import data.models.Offense;
import data.models.Officer;
import data.models.Vehicle;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class TicketRequest {
    private Vehicle vehicle;
    private Offense offense;
    private Officer issuer;
    private boolean hasPaid;
    private LocalDateTime dateOfBooking =  LocalDateTime.now();
    private LocalDateTime dateOfPayment =   LocalDateTime.now();


}
