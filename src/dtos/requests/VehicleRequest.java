package dtos.requests;

import lombok.Data;

import java.time.Year;
@Data
public class VehicleRequest {
    private String vehicleName;
    private String vehicleModel;
    private Year productionYear;
    private String VehicleColor;
    private String ownerName;
    private String ownerEmail;
    private String ownerAddress;
    private String ownerPhoneNumber;

}
