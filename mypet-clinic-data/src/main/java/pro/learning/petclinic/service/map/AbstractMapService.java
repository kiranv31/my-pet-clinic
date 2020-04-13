package pro.learning.petclinic.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID>{
	Map<ID, T> map = new HashMap<>();

	public T findById(ID Id) {
		return map.get(Id);
	}

	public T save(ID id, T object) {
		return map.put(id, object);
	}

	public Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	public void deleteById(ID id) {
		map.remove(id);
	}

	public void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}

}
