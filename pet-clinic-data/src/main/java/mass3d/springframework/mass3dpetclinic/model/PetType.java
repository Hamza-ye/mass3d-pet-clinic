package mass3d.springframework.mass3dpetclinic.model;

import javax.persistence.Entity;

/**
 * Created by Hamza on 25/04/2021.
 */
@Entity
public class PetType extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
