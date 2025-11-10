package data.repositories;

import data.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepositoryClass implements VehiclesRepository{
    @Override
    public Vehicle save(Vehicle vehicle) {
        return null;
    }

    @Override
    public Vehicle findById(int id) {
        return null;
    }

    @Override
    public ArrayList<Vehicle> findAll() {
        return ArrayList.of();
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void delete(Vehicle vehicle) {

    }

    @Override
    public long count() {
        return 0;
    }
}
