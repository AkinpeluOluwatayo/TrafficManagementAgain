package data.models;

import lombok.Data;
import data.models.Vehicle;
import data.models.Offense;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data
public class Ticket {
    @Id
    private String userId;

    @DBRef
    private Vehicle vehicle;
    private Offense offense;
    private boolean hasPaid;

    @DBRef
    private Officer issuer;
    private LocalDateTime dateOfBooking =  LocalDateTime.now();
    private LocalDateTime dateOfPayment =  LocalDateTime.now();


}
