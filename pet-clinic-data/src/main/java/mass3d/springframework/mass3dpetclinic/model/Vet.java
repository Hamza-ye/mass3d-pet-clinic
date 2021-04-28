package mass3d.springframework.mass3dpetclinic.model;

import java.util.Set;

/**
 * Created by Hamza on 25/04/2021.
 */
public class Vet extends Person {

    Set<Specialty> specialties;

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
