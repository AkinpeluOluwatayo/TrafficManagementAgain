package dtos.responses;

import lombok.Data;

import java.time.Year;

@Data
public class VehicleResponse {
    private int id;
    private String name;
    private String make;
    private String model;
    private Year year;
    private String color;
    private String registrationNumber;
    private String message;

}
