package data.repositories;

import data.models.Vehicle;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehiclesTest {
        private VehicleRepositoryClass repository;

        @BeforeEach
        void setUp() {
            repository = new VehicleRepositoryClass();
        }

        @Test
        void testSaveVehicleIncreasesCount() {
            Vehicle vehicle = new Vehicle(1, "Corolla", "Toyota");
            repository.save(vehicle);
            assertEquals(1, repository.count());
        }

        @Test
        void testFindByIdReturnsCorrectVehicle() {
            Vehicle vehicle = new Vehicle(2, "Civic", "Honda");
            repository.save(vehicle);
            Vehicle found = repository.findById(2);
            assertNotNull(found);
            assertEquals("Civic", found.getName());
        }

        @Test
        void testFindAllReturnsAllVehicles() {
            repository.save(new Vehicle(1, "Camry", "Toyota"));
            repository.save(new Vehicle(2, "Accord", "Honda"));
            ArrayList<Vehicle> all = repository.findAll();
            assertEquals(2, all.size());
        }

        @Test
        void testDeleteByIdRemovesVehicle() {
            repository.save(new Vehicle(1, "Rav4", "Toyota"));
            repository.deleteById(1);
            assertEquals(0, repository.count());
        }

        @Test
        void testDeleteAllClearsRepository() {
            repository.save(new Vehicle(1, "BMW", "X3"));
            repository.save(new Vehicle(2, "Audi", "Q5"));
            repository.deleteAll();
            assertEquals(0, repository.count());
        }

        @Test
        void testDeleteSpecificVehicleRemovesOnlyThatVehicle() {
            Vehicle v1 = new Vehicle(1, "Mazda3", "Mazda");
            Vehicle v2 = new Vehicle(2, "Focus", "Ford");
            repository.save(v1);
            repository.save(v2);
            repository.delete(v1);
            assertEquals(1, repository.count());
            assertNull(repository.findById(1));
        }

        @Test
        void testSavingExistingVehicleUpdatesIt() {
            Vehicle v = new Vehicle(1, "Camry", "Toyota");
            repository.save(v);

            Vehicle updated = new Vehicle(1, "Camry Hybrid", "Toyota");
            repository.save(updated);

            Vehicle found = repository.findById(1);
            assertEquals("Camry Hybrid", found.getName());
            assertEquals(1, repository.count());
        }

}