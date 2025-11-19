package dtos.responses;

import data.models.Rank;
import lombok.Data;

@Data
public class OfficerResponse {
    private String name;
    private Rank rank;
    private String message;

   
}
