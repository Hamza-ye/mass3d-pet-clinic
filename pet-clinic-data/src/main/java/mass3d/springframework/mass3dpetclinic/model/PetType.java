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
@Builder
@Entity
public class PetType extends BaseEntity{

    private String name;
}
