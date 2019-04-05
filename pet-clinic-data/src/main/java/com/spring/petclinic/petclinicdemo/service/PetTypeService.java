package com.spring.petclinic.petclinicdemo.service;

import com.spring.petclinic.petclinicdemo.model.PetType;
import org.springframework.stereotype.Service;

@Service
public interface PetTypeService extends CrudService<PetType, Long> {
}
