package com.sprunky.sprunkyspetclinic.services;

import com.sprunky.sprunkyspetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastAName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
