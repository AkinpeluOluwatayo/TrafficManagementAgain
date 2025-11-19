package controller;

import dtos.requests.OfficerRequest;
import dtos.responses.OfficerResponse;
import services.OfficerServices;

public class OfficerController {

    private OfficerServices officerServices;

    public OfficerController(OfficerServices officerServices) {
        this.officerServices = officerServices;
    }

    public OfficerResponse registerOfficer(OfficerRequest officerRequest) {
        return officerServices.registerOfficer(officerRequest);
    }
}
