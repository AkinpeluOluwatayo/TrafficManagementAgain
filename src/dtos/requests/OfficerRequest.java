package dtos.requests;

import data.models.Rank;
import lombok.Data;

@Data
public class OfficerRequest {
    private int userId;
    private String name;
    private Rank rank;

}
