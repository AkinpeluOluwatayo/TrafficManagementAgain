package services;

import data.models.Officer;
import data.repositories.OfficerRepository;
import data.repositories.OfficerRepositoryClass;
import dtos.requests.OfficerRequest;
import dtos.responses.OfficerResponse;

import java.util.ArrayList;

import static utils.OfficerServiceMapper.map;

public class OfficerServicesClass implements OfficerServices {
    private OfficerRepository officerRepository = new OfficerRepositoryClass();

        @Override
        public OfficerResponse registerOfficer (OfficerRequest officerRequest) {
           Officer officer = map (officerRequest);
            officerRepository.save(officer);
            return new OfficerResponse();
        }

}
