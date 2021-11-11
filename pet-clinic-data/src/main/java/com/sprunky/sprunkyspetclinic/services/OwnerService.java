package com.sprunky.sprunkyspetclinic.services;

import com.sprunky.sprunkyspetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastAName(String lastName);

}
