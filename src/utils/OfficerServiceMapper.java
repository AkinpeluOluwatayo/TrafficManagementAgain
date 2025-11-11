package utils;

import data.models.Officer;
import dtos.requests.OfficerRequest;
import dtos.responses.OfficerResponse;

public class OfficerServiceMapper {
    public static Officer map (OfficerRequest officerRequest) {
        Officer officer = new Officer();
        officer.setName(officerRequest.getName());
        officer.setRank(officerRequest.getRank());


        return new Officer();
    }
}
