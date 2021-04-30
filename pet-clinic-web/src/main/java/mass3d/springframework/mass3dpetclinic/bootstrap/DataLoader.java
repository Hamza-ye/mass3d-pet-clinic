package mass3d.springframework.mass3dpetclinic.bootstrap;

import mass3d.springframework.mass3dpetclinic.model.*;
import mass3d.springframework.mass3dpetclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by Hamza on 27/04/2021.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
                      SpecialityService specialityService, VisitService visitService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if (count == 0) loadData();
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");

        Specialty surgery = new Specialty();
        surgery.setDescription("Surgery");

        Specialty dentistry = new Specialty();
        dentistry.setDescription("Dentistry");

        Specialty savedRadiologySpecialty = specialityService.save(radiology);
        Specialty savedSurgerySpecialty = specialityService.save(surgery);
        Specialty savedDentistrySpecialty = specialityService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Owner1");
        owner1.setLastName("1LastName");
        owner1.setAddress("Address1");
        owner1.setCity("City1");
        owner1.setTelephone("11111111");

        Pet pet1 = new Pet();
        pet1.setPetType(savedDogPetType);
        pet1.setOwner(owner1);
        pet1.setBirthDate(LocalDate.now());
        pet1.setName("dogPet1Name");

        owner1.getPets().add(pet1);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Owner2");
        owner2.setLastName("2LastName");
        owner2.setAddress("Address2");
        owner2.setCity("City2");
        owner2.setTelephone("22222222");

        Pet pet2 = new Pet();
        pet2.setPetType(savedCatPetType);
        pet2.setOwner(owner2);
        pet2.setBirthDate(LocalDate.now());
        pet2.setName("catPet2Name");

        owner2.getPets().add(pet2);

        ownerService.save(owner2);

        Visit catVisit = new Visit();
        catVisit.setPet(pet2);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Sneezy Kitty");

        visitService.save(catVisit);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("vet1");
        vet1.setLastName("1LastName");
        vet1.getSpecialties().add(savedRadiologySpecialty);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("vet2");
        vet2.setLastName("2LastName");
        vet2.getSpecialties().add(savedSurgerySpecialty);

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
