package data.models;

import lombok.Data;
import data.models.Owner;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Year;




@Document
@Data
public class Vehicle {
    @Id
    private String id;
    private String name;
    private String model;
    private Year year;
    private String color;
    private String phoneNumber;
    private Owner owner;

}
