package utils;

import data.models.Owner;
import data.models.Vehicle;
import dtos.requests.VehicleRequest;

public class VehicleServiceMapper {
    public static Vehicle map(VehicleRequest vehicleRequest) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName(vehicleRequest.getVehicleName());
        vehicle.setColor(vehicleRequest.getVehicleColor());
        vehicle.setModel(vehicleRequest.getVehicleModel());
        vehicle.setYear(vehicleRequest.getProductionYear());

        Owner owner = new Owner();
        owner.setName(vehicleRequest.getOwnerName());
        owner.setPhoneNumber(vehicleRequest.getOwnerPhoneNumber());
        owner.setEmail(vehicleRequest.getOwnerEmail());
        owner.setAddress(vehicleRequest.getOwnerAddress());

        vehicle.setOwner(owner);
        return vehicle;
    }
}
