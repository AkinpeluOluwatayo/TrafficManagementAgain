package services;

import data.models.Rank;
import dtos.requests.OfficerRequest;
import dtos.responses.OfficerResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficerServicesClassTest {
    private OfficerServicesClass officerServicesClass;
    private OfficerRepositoryClass officerRepositoryClass;

    @BeforeEach
    void setUp() {
        officerServicesClass = new OfficerServicesClass();
    }

    @Test
    void registerOfficers() {
        OfficerRequest officerRequest = new OfficerRequest();
        officerRequest.setName("Fareed");
        officerRequest.setRank(Rank.CAPTAIN);

        OfficerResponse  officerResponse = officerServicesClass.registerOfficer(officerRequest);

        assertNotNull(officerResponse);
        assertEquals("Successfully Registered", officerResponse.getMessage());


    }

}