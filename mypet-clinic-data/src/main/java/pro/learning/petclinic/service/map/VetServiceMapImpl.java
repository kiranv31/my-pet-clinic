package pro.learning.petclinic.service.map;

import java.util.Set;

import pro.learning.petclinic.model.Vet;
import pro.learning.petclinic.service.CrudService;

public class VetServiceMapImpl extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>{
	public Vet findById(Long Id) {
		return super.findById(Id);
	}

	public Vet save(Long id, Vet object) {
		return super.save(id, object);
	}

	public Set<Vet> findAll() {
		return super.findAll();
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}

	public void delete(Vet object) {
		super.delete(object);
	}
}
