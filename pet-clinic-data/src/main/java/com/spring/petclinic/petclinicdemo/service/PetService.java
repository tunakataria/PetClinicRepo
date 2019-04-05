package com.spring.petclinic.petclinicdemo.service;

import com.spring.petclinic.petclinicdemo.model.Pet;
import org.springframework.stereotype.Service;


@Service
public interface PetService extends CrudService<Pet, Long> {

    Pet findByOwnerId(Long ID);
}
