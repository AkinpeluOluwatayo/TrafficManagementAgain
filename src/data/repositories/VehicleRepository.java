package data.repositories;

import data.models.Vehicle;
import java.util.ArrayList;

public class VehicleRepository implements VehiclesRepository {
    private final ArrayList<Vehicle> vehicles = new ArrayList<>();

    @Override
    public Vehicle save(Vehicle vehicle) {
        Vehicle existing = findById(vehicle.getId());
        if (existing != null) {
            vehicles.remove(existing);
        }
        vehicles.add(vehicle);
        return vehicle;
    }

    @Override
    public Vehicle findById(int id) {
        for (Vehicle v : vehicles) {
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Vehicle> findAll() {
        return new ArrayList<>(vehicles);
    }

    @Override
    public void deleteById(int id) {
        vehicles.removeIf(v -> v.getId() == id);
    }

    @Override
    public void deleteAll() {
        vehicles.clear();
    }

    @Override
    public void delete(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    @Override
    public long count() {
        return vehicles.size();
    }
}
