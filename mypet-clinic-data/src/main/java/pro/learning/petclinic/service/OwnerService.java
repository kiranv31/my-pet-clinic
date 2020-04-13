package pro.learning.petclinic.service;

import java.util.Set;

import pro.learning.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);
}
