package mass3d.springframework.mass3dpetclinic.model;

import java.io.Serializable;

/**
 * Created by Hamza on 25/04/2021.
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
