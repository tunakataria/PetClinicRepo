package com.spring.petclinic.petclinicdemo.service;

import java.util.Set;

public interface CrudService<T, ID> {


    T findById(ID id);

    T save(T object);

    void delete(ID id);

    Set<T> findAll();
}
