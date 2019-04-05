package com.spring.petclinic.petclinicdemo.service.Map;

import com.spring.petclinic.petclinicdemo.model.Pet;
import com.spring.petclinic.petclinicdemo.service.CrudService;
import com.spring.petclinic.petclinicdemo.service.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapBasedService<Pet, Long> implements PetService {
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
    public Pet save(Pet object) {
        return super.save(object);
    }


    @Override
    public Pet findByOwnerId(Long ID) {
        return null;
    }
}
