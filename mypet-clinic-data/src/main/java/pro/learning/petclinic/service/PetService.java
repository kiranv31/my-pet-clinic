package pro.learning.petclinic.service;

import java.util.Set;

import pro.learning.petclinic.model.Owner;
import pro.learning.petclinic.model.Pet;

public interface PetService {
	Pet findById(Long Id);

	Pet save(Owner owner);

	Set<Pet> findAll();
}
