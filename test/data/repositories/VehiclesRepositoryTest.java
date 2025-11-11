package data.repositories;

import data.models.Vehicle;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehiclesRepositoryTest {
        private VehicleRepositoryClass repository;

        @BeforeEach
        void setUp() {
            repository = new VehicleRepositoryClass();
        }

        @Test
        void testSaveVehicleIncreasesByOne() {
            Vehicle vehicle = new Vehicle();
            repository.save(vehicle);
            assertEquals(1, repository.count());
        }

        @Test
        void testFindByIdReturnsTheRightVehicle() {
            Vehicle vehicle = new Vehicle();
            repository.save(vehicle);
            Vehicle found = repository.findById(2);
            assertNotNull(found);
            assertEquals("Civic", found.getName());
        }

        @Test
        void testFindAllReturnsAllVehicles() {
            repository.save(new Vehicle());
            repository.save(new Vehicle());
            ArrayList<Vehicle> all = repository.findAll();
            assertEquals(2, all.size());
        }

        @Test
        void testDeleteByIdRemovesVehicle() {
            repository.save(new Vehicle());
            repository.deleteById(1);
            assertEquals(0, repository.count());
        }

        @Test
        void testDeleteAllClearsRepository() {
            repository.save(new Vehicle());
            repository.save(new Vehicle());
            repository.deleteAll();
            assertEquals(0, repository.count());
        }

        @Test
        void testDeleteSpecificVehicleRemovesOnlyThatVehicle() {
            Vehicle v1 = new Vehicle();
            Vehicle v2 = new Vehicle();
            repository.save(v1);
            repository.save(v2);
            repository.delete(v1);
            assertEquals(1, repository.count());
            assertNull(repository.findById(1));
        }

        @Test
        void testSavingExistingVehicleUpdatesTheCountForIt() {
            Vehicle v = new Vehicle();
            repository.save(v);

            Vehicle updated = new Vehicle();
            repository.save(updated);

            Vehicle found = repository.findById(1);
            assertEquals("Camry Spider", found.getName());
            assertEquals(1, repository.count());
        }

}