package controller;

import dtos.requests.OfficerRequest;
import dtos.responses.OfficerResponse;
import org.springframework.web.bind.annotation.RestController;
import services.OfficerServices;

@RestController
public class OfficerController {

    private OfficerServices officerServices;

    public OfficerController(OfficerServices officerServices) {
        this.officerServices = officerServices;
    }

    public OfficerResponse registerOfficer(OfficerRequest officerRequest) {
        return officerServices.registerOfficer(officerRequest);
    }
}
