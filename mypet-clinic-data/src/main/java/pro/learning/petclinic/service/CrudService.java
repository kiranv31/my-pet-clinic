package pro.learning.petclinic.service;

import java.util.Set;

public interface CrudService<T, ID> {

	T findById(ID Id);

	T save(ID id, T owner);

	Set<T> findAll();
	
	void deleteById(ID id);
	
	void delete(T object);
}
