package mass3d.springframework.mass3dpetclinic.model;

import lombok.*;

import javax.persistence.Entity;

/**
 * Created by Hamza on 25/04/2021.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PetType extends BaseEntity{

    private String name;

    @Builder
    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
