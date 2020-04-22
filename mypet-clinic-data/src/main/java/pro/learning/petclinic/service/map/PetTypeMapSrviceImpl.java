package pro.learning.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import pro.learning.petclinic.model.PetType;
import pro.learning.petclinic.service.PetTypeService;

@Service
public class PetTypeMapSrviceImpl extends AbstractMapService<PetType, Long> implements PetTypeService {

	public PetType findById(Long Id) {
		return super.findById(Id);
	}

	public PetType save(PetType object) {
		return super.save(object);
	}

	public Set<PetType> findAll() {
		return super.findAll();
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}

	public void delete(PetType object) {
		super.delete(object);
	}
}
