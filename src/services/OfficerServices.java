package services;

import dtos.requests.OfficerRequest;
import dtos.responses.OfficerResponse;
import dtos.responses.VehicleResponse;

public interface OfficerServices {
    OfficerResponse registerOfficer (OfficerRequest officerRequest);
}
