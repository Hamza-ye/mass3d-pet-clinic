package mass3d.springframework.mass3dpetclinic.services.map;

import mass3d.springframework.mass3dpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Hamza on 02/05/2021.
 */
class OwnerMapServiceTest {

    OwnerMapService ownerMapService;
    Long ownerId = 1L;
    String lastName = "LName";

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetMapService(), new PetTypeMapService());

        ownerMapService.save(Owner.builder().id(ownerId).lastName(lastName).build());
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();
        assertEquals(1, ownerSet.size());
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(ownerId);
        assertEquals(1L, owner.getId());
    }

    @Test
    void saveExistingId() {
        long id = 2L;
        Owner owner2 = Owner.builder().id(id).firstName("FName2").lastName("LName2").build();
        Owner savedOwner = ownerMapService.save(owner2);
        assertEquals(id, savedOwner.getId());
    }

    @Test
    void saveNoId() {
        Owner owner3 = Owner.builder().firstName("FName3").lastName("LName3").build();
        Owner savedOwner = ownerMapService.save(owner3);

        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(ownerId));
        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(ownerId);
        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void findByLastName() {
        Owner owner = ownerMapService.findByLastName(lastName);
        assertNotNull(owner);
        assertEquals(ownerId, owner.getId());
    }

    @Test
    void findByLastNameNotFound() {
        Owner owner = ownerMapService.findByLastName("foo");

        assertNull(owner);
    }
}