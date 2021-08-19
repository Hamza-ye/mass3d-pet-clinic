package mass3d.springframework.mass3dpetclinic.services.map;

import mass3d.springframework.mass3dpetclinic.model.BaseEntity;
import mass3d.springframework.mass3dpetclinic.services.CrudService;

import java.util.*;

/**
 * Created by Hamza on 26/04/2021.
 */
public class AbstractMapService<T extends BaseEntity, ID extends Long> implements CrudService<T, ID> {

    Map<Long , T> map = new HashMap<>();

    @Override
    public Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    @Override
    public T findById(ID id){
        return map.get(id);
    }

    @Override
    public T save(T object){
        if (object != null) {
            if (object.getId() == null) object.setId(getNextId());
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    @Override
    public void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    @Override
    public void deleteById(ID id){
        map.remove(id);
    }

    private Long getNextId(){
        return (map.isEmpty() ? 0L : Collections.max(map.keySet())) + 1;
    }
}
