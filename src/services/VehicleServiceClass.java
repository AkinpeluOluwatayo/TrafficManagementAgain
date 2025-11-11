package services;
import data.repositories.VehicleRepositoryClass;
import dtos.requests.VehicleRequest;
import dtos.responses.VehicleResponse;
import data.models.Vehicle;
import data.repositories.VehiclesRepository;

import static utils.VehicleServiceMapper.map;

public class VehicleServiceClass implements VehicleServices{
    private VehiclesRepository vehiclesRepository = new VehicleRepositoryClass();
    @Override
    public VehicleResponse registerVehicle(VehicleRequest vehicleRequest) {
//        VehicleResponse vehicleResponse = new VehicleResponse();
        Vehicle vehicle = map(vehicleRequest);
        vehiclesRepository.save(vehicle);
        return new VehicleResponse();
    }

}
