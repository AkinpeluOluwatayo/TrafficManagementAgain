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

    public boolean isHasPaid() {
        return hasPaid;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

    public LocalDateTime getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(LocalDateTime dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public LocalDateTime getDateOfBooking () {
        return dateOfBooking ;
    }

    public void setDateOfBooking (LocalDateTime dateOfBooking ) {
        this.dateOfBooking  = dateOfBooking ;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Offense getOffense() {
        return offense;
    }

    public void setOffense(Offense offense) {
        this.offense = offense;
    }

    public Officer getIssuer() {
        return issuer;
    }

    public void setIssuer(Officer issuer) {
        this.issuer = issuer;
    }
}
