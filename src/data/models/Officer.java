package models;

import data.models.Rank;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("officers")
@Data
public class Officer {
    @Id
    private String userId;
    private String name;
    private Rank rank;





}
