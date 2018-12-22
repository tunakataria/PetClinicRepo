package com.spring.petclinic.petclinicdemo.service.Map;

import com.spring.petclinic.petclinicdemo.model.Vet;
import com.spring.petclinic.petclinicdemo.service.CrudService;
import com.spring.petclinic.petclinicdemo.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapBasedService<Vet, Long> implements VetService {
    @Override
    public Long save(Vet object) {
        return super.save(object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public Vet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Vet findByLastName(String lastName) {
        return super.findAll().stream().filter(vet -> vet.getLastName().equals(lastName)).findFirst().get();
    }

    @Override
    public void delete(Long object) {
        super.delete(object);
    }
}
