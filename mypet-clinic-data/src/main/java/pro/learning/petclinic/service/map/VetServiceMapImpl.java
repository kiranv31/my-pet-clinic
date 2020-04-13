package pro.learning.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import pro.learning.petclinic.model.Vet;
import pro.learning.petclinic.service.CrudService;
import pro.learning.petclinic.service.VetService;


@Service
public class VetServiceMapImpl extends AbstractMapService<Vet, Long> implements VetService{
	public Vet findById(Long Id) {
		return super.findById(Id);
	}

	public Vet save(Vet object) {
		return super.save(object);
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
