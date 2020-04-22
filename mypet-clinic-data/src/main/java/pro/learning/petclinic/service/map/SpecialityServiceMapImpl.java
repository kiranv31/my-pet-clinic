package pro.learning.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import pro.learning.petclinic.model.Speciality;
import pro.learning.petclinic.service.SpecialityService;

@Service
public class SpecialityServiceMapImpl extends AbstractMapService<Speciality, Long> implements SpecialityService {

	public Speciality findById(Long Id) {
		return super.findById(Id);
	}

	public Speciality save(Speciality object) {
		return super.save(object);
	}

	public Set<Speciality> findAll() {
		return super.findAll();
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}

	public void delete(Speciality object) {
		super.delete(object);
	}
}
