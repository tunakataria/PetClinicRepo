package com.spring.petclinic.petclinicdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name="specialities")
public class Speciality extends  BaseEntity {

    @Column(name="speciality")
    private String speciality;

    @ManyToMany
    private Set<Vet> vets;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Set<Vet> getVets() {
        return vets;
    }

    public void setVets(Set<Vet> vets) {
        this.vets = vets;
    }
}

