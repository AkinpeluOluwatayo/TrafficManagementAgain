package services;

import dtos.requests.VehicleRequest;
import dtos.responses.VehicleResponse;

import java.util.ArrayList;

public interface VehicleServicesInterface {
    VehicleResponse registerVehicle(VehicleRequest vehicleRequest);



}
