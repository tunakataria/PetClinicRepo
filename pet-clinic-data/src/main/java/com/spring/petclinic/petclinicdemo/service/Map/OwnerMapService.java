package com.spring.petclinic.petclinicdemo.service.Map;

import com.spring.petclinic.petclinicdemo.model.Owner;
import com.spring.petclinic.petclinicdemo.service.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapBasedService<Owner, Long> implements OwnerService {
    @Override
    public Owner findByLastName(String lastName) {
        return super.findAll().stream().filter(owner -> owner.getLastName().equals(lastName)).findFirst().get();
    }


    @Override
    public Long save(Owner object) {
        return super.save(object);
    }

    @Override
    public Set<Owner> findAll() {
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
    public Owner findById(Long id){
       return super.findById(id);
    }
}
