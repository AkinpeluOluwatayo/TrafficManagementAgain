package services;

import data.models.Officer;
import data.repositories.OfficerRepository;
import dtos.requests.OfficerRequest;
import dtos.responses.OfficerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static utils.OfficerServiceMapper.map;

@Service
public class OfficerServicesClass implements services.OfficerServices {

    private OfficerRepository repository;

    @Autowired
    public OfficerServicesClass(OfficerRepository repository) {
        this.repository = repository;
    }

        @Override
        public OfficerResponse registerOfficer (OfficerRequest officerRequest) {
            OfficerResponse officerResponse = new OfficerResponse();
           Officer officer = map (officerRequest);
            repository.save(officer);
            officerResponse.setMessage("Successfully Registered");
            return officerResponse;
        }


}
