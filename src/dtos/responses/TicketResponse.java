package dtos.responses;

import data.models.Offense;
import data.models.Officer;
import data.models.Ticket;
import data.models.Vehicle;

import java.time.LocalDateTime;

public class TicketResponse {
    private Vehicle vehicle;
    private Offense offense;
    private boolean hasPaid;
    private Officer issuer;
    private LocalDateTime dateOfBooking =  LocalDateTime.now();
    private LocalDateTime dateOfPayment =  LocalDateTime.now();
    private String message;
    private Ticket ticket;

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

    public boolean isHasPaid() {
        return hasPaid;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

    public Officer getIssuer() {
        return issuer;
    }

    public void setIssuer(Officer issuer) {
        this.issuer = issuer;
    }

    public LocalDateTime getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(LocalDateTime dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public LocalDateTime getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(LocalDateTime dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
