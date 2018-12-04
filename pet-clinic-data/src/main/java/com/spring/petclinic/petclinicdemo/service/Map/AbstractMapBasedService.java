package com.spring.petclinic.petclinicdemo.service.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapBasedService<T, ID> {

    public Map<ID, T> map = new HashMap();


    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    public T findById(ID id) {
        return map.get(id);
    }

    public T save(ID id,T object) {
        map.put(id, object);
        return object;
    }

    public  void delete(ID object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
