package services;
import data.repositories.VehicleRepository;
import dtos.requests.VehicleRequest;
import dtos.responses.VehicleResponse;
import data.models.Vehicle;
import data.repositories.VehiclesRepository;

import java.util.ArrayList;

import static utils.VehicleServiceMapper.map;
import static utils.VehicleServiceMapper.mapAllVehicle;

public class VehicleService implements VehicleServicesInterface {
    private VehiclesRepository vehiclesRepository = new VehicleRepository();

    @Override
    public VehicleResponse registerVehicle(VehicleRequest vehicleRequest) {
        VehicleResponse vehicleResponse = new VehicleResponse();
        Vehicle vehicle = map(vehicleRequest);
        vehiclesRepository.save(vehicle);
        vehicleResponse.setMessage("Vehicle registered successfully");
        return vehicleResponse;
    }




}
