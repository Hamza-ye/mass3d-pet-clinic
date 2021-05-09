package mass3d.springframework.mass3dpetclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.*;

/**
 * Created by Hamza on 25/04/2021.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    Set<Pet> pets = new HashSet<>();

    @Builder
    public Owner(Long id, String firstName, String lastName, String address, String city, String telephone, Set<Pet> pets) {
        super(id, firstName, lastName);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
       if (pets != null) this.pets = pets;
    }

    public Pet getPet(String name) {
        return getPet(name, false);
    }

    /**
     * Return the Pet with the given name, or null if none found for this Owner.
     *
     * @param name to test
     * @return true if pet name is already in use
     */
    public Pet getPet(String name, boolean ignoreNew) {
        name = name.toLowerCase();
        for (Pet pet : getPetsInternal()) {
            if (!ignoreNew || !pet.isNew()) {
                String compName = pet.getName();
                compName = compName.toLowerCase();
                if (compName.equals(name)) {
                    return pet;
                }
            }
        }
        return null;
    }

    protected Set<Pet> getPetsInternal() {
        if (this.pets == null) {
            this.pets = new HashSet<>();
        }
        return this.pets;
    }

    public List<Pet> getPets() {
        List<Pet> sortedPets = new ArrayList<>(getPetsInternal());
        PropertyComparator.sort(sortedPets, new MutableSortDefinition("name", true, true));
        return Collections.unmodifiableList(sortedPets);
    }

    public void addPet(Pet pet) {
        if (pet.isNew()) {
            getPetsInternal().add(pet);
        }
        pet.setOwner(this);
    }
}
