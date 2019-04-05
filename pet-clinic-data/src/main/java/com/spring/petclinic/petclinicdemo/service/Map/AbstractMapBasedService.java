package com.spring.petclinic.petclinicdemo.service.Map;

import com.spring.petclinic.petclinicdemo.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapBasedService<T extends BaseEntity, ID extends  Long> {

    public Map<Long, T> map = new HashMap();


    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    public T findById(ID id) {
        return map.get(id);
    }

    public Long save(T object) {
        Long id = getNextID();
        object.setId(id);
        map.put(id, object);
        return id;
    }

    private Long getNextID(){
        if (map.keySet().size()!=0) {
            return Collections.max(map.keySet())+1;
        }else {
            return 1L;
        }

    }

    public  void delete(ID object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

}
