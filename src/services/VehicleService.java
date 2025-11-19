package services;
import dtos.requests.VehicleRequest;
import dtos.responses.VehicleResponse;
import data.models.Vehicle;
import data.repositories.VehiclesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static utils.VehicleServiceMapper.map;


@Service
public class VehicleService implements VehicleServicesInterface {

    private VehiclesRepository repository;

    @Autowired
    public VehicleService (VehiclesRepository repository) {
        this.repository = repository;
    }

    @Override
    public VehicleResponse registerVehicle(VehicleRequest vehicleRequest) {
        VehicleResponse vehicleResponse = new VehicleResponse();
        Vehicle vehicle = map(vehicleRequest);
        repository.save(vehicle);
        vehicleResponse.setMessage("Vehicle registered successfully");
        return vehicleResponse;
    }




}
