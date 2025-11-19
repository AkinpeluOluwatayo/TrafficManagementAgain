package data.models;

import data.models.Gender;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Owner {
    @Id
    private String id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private Gender gender;



}
