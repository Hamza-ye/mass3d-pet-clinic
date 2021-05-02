package mass3d.springframework.mass3dpetclinic.services.springdatajpa;

import mass3d.springframework.mass3dpetclinic.model.Owner;
import mass3d.springframework.mass3dpetclinic.repositories.OwnerRepository;
import mass3d.springframework.mass3dpetclinic.repositories.PetRepository;
import mass3d.springframework.mass3dpetclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

/**
 * Created by Hamza on 02/05/2021.
 */
@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerSDJpaService service;

    Long ownerId = 1L;

    String lastName = "LName";

    Owner returnedOwner;

    @BeforeEach
    void setUp() {
        returnedOwner = Owner.builder().id(ownerId).firstName("FName").lastName(lastName).build();
    }

    @Test
    void findAll() {
        Set<Owner> owners = new HashSet<>();
        owners.add(Owner.builder().id(1L).firstName("FName").lastName(lastName).build());
        owners.add(Owner.builder().id(2L).firstName("FName").lastName(lastName).build());

        when(ownerRepository.findAll()).thenReturn(owners);

        assertEquals(2, service.findAll().size());
    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnedOwner));

        Owner owner = service.findById(ownerId);

        assertNotNull(owner);
    }

    @Test
    void findByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());

        Owner owner = service.findById(1L);

        assertNull(owner);
    }

    @Test
    void save() {
        Owner ownerToSave = Owner.builder().id(1L).build();

        when(ownerRepository.save(any())).thenReturn(returnedOwner);

        Owner owner = service.save(ownerToSave);

        assertNotNull(owner);

        verify(ownerRepository).save(any());
    }

    @Test
    void delete() {
        service.delete(returnedOwner);

        //default is 1 times
        verify(ownerRepository, times(1)).delete(any());
    }

    @Test
    void deleteById() {
        service.deleteById(1L);

        verify(ownerRepository).deleteById(anyLong());
    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastName(any())).thenReturn(returnedOwner);
        Owner owner = service.findByLastName(lastName);
        assertEquals(lastName, owner.getLastName());
        verify(ownerRepository).findByLastName(any());
    }
}