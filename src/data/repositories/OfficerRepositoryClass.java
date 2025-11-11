package data.repositories;

import data.models.Officer;
import java.util.ArrayList;

public class OfficerRepositoryClass implements OfficerRepository {
    private final ArrayList<Officer> officers = new ArrayList<>();

    @Override
    public Officer save(Officer officer) {
        Officer existing = findById(officer.getUserId());
        if (existing != null) {
            officers.remove(existing);
        }
        officers.add(officer);
        return officer;
    }

    @Override
    public Officer findById(int id) {
        for (Officer o : officers) {
            if (o.getUserId() == id) {
                return o;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Officer> findAll() {
        return new ArrayList<>(officers);
    }

    @Override
    public void deleteById(int id) {
        officers.removeIf(o -> o.getUserId() == id);
    }

    @Override
    public void deleteAll() {
        officers.clear();
    }

    @Override
    public void delete(Officer officer) {
        officers.remove(officer);
    }

    @Override
    public long count() {
        return officers.size();
    }
}
