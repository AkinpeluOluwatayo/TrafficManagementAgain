package data.repositories;

import data.models.Officer;
import data.models.Rank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OfficerRepositoryClassTest {

    private OfficerRepositoryClass repository;

    @BeforeEach
    void setUp() {
        repository = new OfficerRepositoryClass();
    }

    @Test
    void testSaveOfficerIncreasesByOne() {
        Officer officer = new Officer(1, "Makaveli", Rank.CAPTAIN);
        repository.save(officer);
        assertEquals(1, repository.count());
    }

    @Test
    void testFindByIdReturnsTheRightOfficer() {
        Officer officer = new Officer(2, "Samuel", Rank.VICECAPTAIN);
        repository.save(officer);
        Officer found = repository.findById(2);
        assertNotNull(found);
        assertEquals("Samuel", found.getName());
    }

    @Test
    void testFindAllReturnsAllOfficers() {
        repository.save(new Officer(1, "Mike", Rank.SERGENT));
        repository.save(new Officer(2, "Ayomide", Rank.CAPTAIN));
        ArrayList<Officer> all = repository.findAll();
        assertEquals(2, all.size());
    }

    @Test
    void testDeleteByIdRemovesOfficer() {
        repository.save(new Officer(1, "Onoja", Rank.SERGENT));
        repository.deleteById(1);
        assertEquals(0, repository.count());
    }

    @Test
    void testDeleteAllClearsRepository() {
        repository.save(new Officer(1, "David", Rank.CAPTAIN));
        repository.save(new Officer(2, "Eluka", Rank.VICECAPTAIN));
        repository.deleteAll();
        assertEquals(0, repository.count());
    }

    @Test
    void testDeleteSpecificOfficerRemovesOnlyThatOfficer() {
        Officer officer = new Officer(1, "Emeka", Rank.SERGENT);
        Officer officer2 = new Officer(2, "Aisha", Rank.VICECAPTAIN);
        repository.save(officer);
        repository.save(officer2);
        repository.delete(officer);
        assertEquals(1, repository.count());
        assertNull(repository.findById(1));
    }

    @Test
    void testSavingExistingOfficerUpdatesItInsteadOfIncreasingCount() {
        Officer officer = new Officer(1, "Bayo", Rank.CAPTAIN);
        repository.save(officer);

        Officer updated = new Officer(1, "Bayo", Rank.SERGENT);
        repository.save(updated);

        Officer found = repository.findById(1);
        assertEquals(Rank.SERGENT, found.getRank());
        assertEquals(1, repository.count());
    }
}
