package mass3d.springframework.mass3dpetclinic.model;

import java.util.Set;

/**
 * Created by Hamza on 25/04/2021.
 */
public class Owner extends Person {

    Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
