package com.spring.petclinic.petclinicdemo.service.Map;

import com.spring.petclinic.petclinicdemo.model.PetType;
import com.spring.petclinic.petclinicdemo.service.PetTypeService;

import java.util.Set;

public class PetTypeMapService extends AbstractMapBasedService<PetType,Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public PetType findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Long save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(Long object) {
        super.delete(object);
    }
}
