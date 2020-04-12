package pro.learning.petclinic.service.map;

import java.security.acl.Owner;
import java.util.Set;

import pro.learning.petclinic.service.CrudService;

public class OwnerServiceMapImple extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	public Owner findById(Long Id) {
		return super.findById(Id);
	}

	public Owner save(Long id, Owner object) {
		return super.save(id, object);
	}

	public Set<Owner> findAll() {
		return super.findAll();
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}

	public void delete(Owner object) {
		super.delete(object);
	}
}
