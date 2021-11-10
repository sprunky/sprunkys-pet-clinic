package com.sprunky.sprunkyspetclinic.services;

import com.sprunky.sprunkyspetclinic.model.Owner;
import com.sprunky.sprunkyspetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
