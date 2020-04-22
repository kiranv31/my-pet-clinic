package pro.learning.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import pro.learning.petclinic.model.Vet;
import pro.learning.petclinic.service.CrudService;
import pro.learning.petclinic.service.SpecialityService;
import pro.learning.petclinic.service.VetService;


@Service
public class VetServiceMapImpl extends AbstractMapService<Vet, Long> implements VetService{
	private SpecialityService service;
	
	public VetServiceMapImpl(final SpecialityService service) {
		this.service = service;
	}
	
	public Vet findById(Long Id) {
		return super.findById(Id);
	}

	public Vet save(Vet object) {
		if(object.getSpecialities().size() > 0) {
			object.getSpecialities().forEach(s ->{
				if(s.getId() == null) {
					s.setId(service.save(s).getId());
				}
			});
		}
			
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
