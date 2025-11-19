package dtos.requests;

import data.models.Rank;
import lombok.Data;

@Data
public class OfficerRequest {
    private int userId;
    private String name;
    private Rank rank;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
