package mass3d.springframework.mass3dpetclinic.services.springdatajpa;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hamza on 30/04/2021.
 */
public class AbstractSDJpaService <T, ID extends Serializable, R extends CrudRepository<T, ID>> {

    protected R repository;

    public AbstractSDJpaService(R repository) {
        this.repository = repository;
    }

    public Set<T> findAll() {
        Set<T> objects = new HashSet<>();
        repository.findAll().forEach(object -> objects.add(object));
        return objects;
    }

    public T findById(ID id) {
        return repository.findById(id).orElse(null);
    }

    public T save(T object) {
        return repository.save(object);
    }

    public void delete(T object) {
        repository.delete(object);
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }
}
