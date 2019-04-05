package com.spring.petclinic.petclinicdemo.service.Map;

import com.spring.petclinic.petclinicdemo.model.Owner;
import com.spring.petclinic.petclinicdemo.model.Pet;
import com.spring.petclinic.petclinicdemo.model.PetType;
import com.spring.petclinic.petclinicdemo.service.OwnerService;
import com.spring.petclinic.petclinicdemo.service.PetService;
import com.spring.petclinic.petclinicdemo.service.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapBasedService<Owner, Long> implements OwnerService {

    PetTypeService petTypeService ;

    PetService petService;

    @Autowired
    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return super.findAll().stream().filter(owner -> owner.getLastName().equals(lastName)).findFirst().get();
    }


    @Override
    public Owner save(Owner owner) {

        if (owner.getPets() != null) {
            owner.getPets().forEach(pet -> {
                if (pet.getPetType() != null) {
                    if (pet.getPetType().getId() == null) {
                        PetType savedPetType = petTypeService.save(pet.getPetType());
                        pet.setPetType(savedPetType);

                    }

                    if(pet.getId()==null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }

                } else {
                    throw new RuntimeException("Pet type is required");
                }
            });
            return super.save(owner);
        } else {
            return null;
        }
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
