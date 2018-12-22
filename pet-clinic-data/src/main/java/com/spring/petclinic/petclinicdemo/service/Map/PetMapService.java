package com.spring.petclinic.petclinicdemo.service.Map;

import com.spring.petclinic.petclinicdemo.model.Pet;
import com.spring.petclinic.petclinicdemo.service.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapBasedService<Pet, Long> implements CrudService<Pet, Long>{
    @Override
    public Pet findById(Long aLong) {
        return null;
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Long object) {
        super.delete(object);
    }

    @Override
    public Long save(Pet object) {
        return super.save(object);
    }


}
