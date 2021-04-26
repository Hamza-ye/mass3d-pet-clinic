package mass3d.springframework.mass3dpetclinic.services.map;

import mass3d.springframework.mass3dpetclinic.model.BaseEntity;

import java.util.*;

/**
 * Created by Hamza on 26/04/2021.
 */
public class AbstractMapService<T extends BaseEntity, ID extends Long> {

    Map<Long , T> map = new HashMap<>();

    public Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    public T findById(ID id){
        return map.get(id);
    }

    public T save(T object){
        if (object != null) {
            if (object.getId() == null) object.setId(getNextId());
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    public void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    public void deleteById(ID id){
        map.remove(id);
    }

    private Long getNextId(){
        return (map.isEmpty() ? 0L : Collections.max(map.keySet())) + 1;
    }
}
