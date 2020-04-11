package pro.learning.petclinic.service;

import java.util.Set;

import pro.learning.petclinic.model.Owner;
import pro.learning.petclinic.model.Vet;

public interface VetService {
	Vet findById(Long Id);

	Vet save(Owner owner);

	Set<Vet> findAll();
}
