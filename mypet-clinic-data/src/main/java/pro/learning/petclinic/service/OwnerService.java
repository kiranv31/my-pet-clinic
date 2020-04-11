package pro.learning.petclinic.service;

import java.util.Set;

import pro.learning.petclinic.model.Owner;

public interface OwnerService {
	Owner findByLastName(String lastName);

	Owner findById(Long Id);

	Owner save(Owner owner);

	Set<Owner> findAll();
}
