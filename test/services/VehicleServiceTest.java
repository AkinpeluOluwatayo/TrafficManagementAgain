package services;

import data.repositories.VehiclesRepository;
import dtos.requests.VehicleRequest;
import dtos.responses.VehicleResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.*;

class VehicleServiceTest {
    private VehicleService vehicleService;
    private VehiclesRepository vehiclesRepository;

    @BeforeEach
    void setUp() {
        vehiclesRepository = new VehicleRepository();
        vehicleService = new VehicleService();
    }

    @Test
    void testRegisterVehicle() {
        VehicleRequest request = new VehicleRequest();
        request.setVehicleName("Toyota");
        request.setVehicleModel("Corolla");
        request.setProductionYear(Year.now());
        request.setVehicleColor("Blue");
        request.setOwnerPhoneNumber("08104883602");
        request.setOwnerName("Akinpelu Tayo");

        VehicleResponse response = vehicleService.registerVehicle(request);

        assertNotNull(response);
        assertEquals("Vehicle registered successfully", response.getMessage());

    }

}
