package pro.learning.petclinic.service.map;

import java.util.HashSet;
import java.util.Set;

import pro.learning.petclinic.model.Pet;
import pro.learning.petclinic.service.CrudService;

public class PetServiceMapImpl extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

	public Pet findById(Long Id) {
		return super.findById(Id);
	}

	public Pet save(Long id, Pet object) {
		return super.save(id, object);
	}

	public Set<Pet> findAll() {
		return super.findAll();
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}

	public void delete(Pet object) {
		super.delete(object);
	}
}
