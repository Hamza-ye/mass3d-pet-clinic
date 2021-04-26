package mass3d.springframework.mass3dpetclinic.bootstrap;

import mass3d.springframework.mass3dpetclinic.model.Owner;
import mass3d.springframework.mass3dpetclinic.model.Vet;
import mass3d.springframework.mass3dpetclinic.services.OwnerService;
import mass3d.springframework.mass3dpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Hamza on 27/04/2021.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Owner1");
        owner1.setLastName("1LastName");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Owner2");
        owner2.setLastName("2LastName");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("vet1");
        vet1.setLastName("1LastName");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("vet2");
        vet2.setLastName("2LastName");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
