package com.spring.petclinic.petclinicdemo.service;

import org.springframework.stereotype.Service;

import java.util.Set;

public interface CrudService<T, ID> {


    T findById(ID id);

    ID save(T object);

    void delete(ID id);

    Set<T> findAll();
}
