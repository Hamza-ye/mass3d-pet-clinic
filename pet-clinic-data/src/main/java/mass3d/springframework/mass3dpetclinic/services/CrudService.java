package mass3d.springframework.mass3dpetclinic.services;

import java.util.Set;

/**
 * Created by Hamza on 26/04/2021.
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
