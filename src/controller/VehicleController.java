package controller;

import dtos.requests.VehicleRequest;
import dtos.responses.VehicleResponse;
import services.VehicleServicesInterface;

public class VehicleController {

    private VehicleServicesInterface vehicleServices;

    public VehicleController(VehicleServicesInterface vehicleServices) {
        this.vehicleServices = vehicleServices;
    }

    public VehicleResponse registerVehicle(VehicleRequest vehicleRequest) {
        return vehicleServices.registerVehicle(vehicleRequest);
    }
}
