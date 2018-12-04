package com.spring.petclinic.petclinicdemo.service;

import com.spring.petclinic.petclinicdemo.model.Pet;

import java.util.Set;

public interface PetService extends CrudService<Pet, Long> {

    Pet findByOwnerId(Long ID);
}
