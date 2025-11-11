package services;

import data.repositories.VehicleRepositoryClass;
import data.repositories.VehiclesRepository;
import dtos.requests.VehicleRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleServiceClassTest {
    private VehicleServices vehicleServices;
    private VehiclesRepository vehiclesRepository;
    @BeforeEach
    void setUp() {
        vehicleServices = new VehicleServiceClass();
        vehiclesRepository = new VehicleRepositoryClass();
    }

    @Test
    void registerVehicleCountIsOne() {
        VehicleRequest  vehicleRequest = new VehicleRequest();
        vehicleServices.registerVehicle(vehicleRequest);
        assertEquals(1, vehiclesRepository.count());
    }



}