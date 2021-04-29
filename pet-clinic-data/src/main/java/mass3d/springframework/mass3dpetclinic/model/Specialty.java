package mass3d.springframework.mass3dpetclinic.model;

import javax.persistence.Entity;

/**
 * Created by Hamza on 29/04/2021.
 */
@Entity
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
