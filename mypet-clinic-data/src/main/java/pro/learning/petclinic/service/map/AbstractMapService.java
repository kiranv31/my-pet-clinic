package pro.learning.petclinic.service.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import pro.learning.petclinic.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
	private Map<Long, T> map = new HashMap<>();

	public T findById(Long Id) {
		return map.get(Id);
	}

	public T save(T object) {
		if (object != null) {
			if (object.getId() != null) {
				object.setId(getNextId());
			}
			return map.put(object.getId(), object);
		} else {
			throw new RuntimeException("Object can not be null");
		}
	}

	public Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	public void deleteById(Long id) {
		map.remove(id);
	}

	public void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}

	private Long getNextId() {
		Long max = null;
		try {
			max = Collections.max(map.keySet()) + 1;
		} catch (NoSuchElementException e) {
			max = 1L;
		}
		return max;
	}

}
