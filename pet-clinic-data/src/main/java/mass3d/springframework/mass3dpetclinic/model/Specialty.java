package mass3d.springframework.mass3dpetclinic.model;

/**
 * Created by Hamza on 29/04/2021.
 */
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
