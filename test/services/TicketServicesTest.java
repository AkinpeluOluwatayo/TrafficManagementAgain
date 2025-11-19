package services;

import data.models.*;
import dtos.requests.TicketRequest;
import dtos.responses.TicketResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.*;

class TicketServicesTest {
    private TicketServices ticketServices;
    private TicketRepositoryClass ticketRepository;

    @BeforeEach
    void setUp() {
        ticketRepository = new TicketRepositoryClass();
        ticketServices = new TicketServices(ticketRepository);
    }

    @Test
    void testIssueOneTicket() {

        Owner owner = new Owner();
        owner.setName("Joy");
        owner.setEmail("Joy@gmail.com");
        owner.setAddress("Mowe Ogun state");
        owner.setGender(Gender.Female);
        owner.setPhoneNumber("08051170959");

        Vehicle vehicle = new Vehicle();
        vehicle.setColor("Gold");
        vehicle.setPhoneNumber("08104883602");
        vehicle.setModel("Toyota Camry");
        vehicle.setYear(Year.now());
        vehicle.setOwner(owner);


        TicketRequest ticketRequest = new TicketRequest();
        ticketRequest.setOffense(Offense.DRUNK_DRIVING);
        ticketRequest.setVehicle(vehicle);


        TicketResponse ticketResponse = ticketServices.issueTicket(ticketRequest);

        assertNotNull(ticketResponse);
        assertEquals("Ticket issued successfully", ticketResponse.getMessage());
    }
}
