package pro.learning.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import pro.learning.petclinic.model.Owner;
import pro.learning.petclinic.service.OwnerService;

@Service
public class OwnerServiceMapImple extends AbstractMapService<Owner, Long> implements OwnerService{

	@Override
	public Owner findById(Long Id) {
		return super.findById(Id);
	}

	@Override
	public Owner save(Owner owner) {
		return super.save(owner);
	}

	@Override
	public void delete(Owner owner) {
		super.delete(owner);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}

	
	public Set<Owner> findAll() {
		return super.findAll();
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
