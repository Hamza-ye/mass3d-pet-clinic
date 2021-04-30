package mass3d.springframework.mass3dpetclinic.model;

import lombok.*;

import javax.persistence.Entity;

/**
 * Created by Hamza on 29/04/2021.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Specialty extends BaseEntity {

    private String description;
}
