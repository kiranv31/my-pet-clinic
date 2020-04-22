package pro.learning.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import pro.learning.petclinic.model.Owner;
import pro.learning.petclinic.model.PetType;
import pro.learning.petclinic.service.OwnerService;
import pro.learning.petclinic.service.PetService;
import pro.learning.petclinic.service.PetTypeService;

@Service
public class OwnerServiceMapImple extends AbstractMapService<Owner, Long> implements OwnerService {
	private PetService petService;
	private PetTypeService petTypeService;

	public OwnerServiceMapImple(PetService petService, PetTypeService petTypeService) {
		this.petService = petService;
		this.petTypeService = petTypeService;
	}

	@Override
	public Owner findById(Long Id) {
		return super.findById(Id);
	}

	@Override
	public Owner save(Owner owner) {
		if (owner != null) {
			owner.getPets().forEach( pet -> {
			if(pet.getId() != null) {
				if(pet.getPetType() != null) {
					if(pet.getId() == null)
						pet.setPetType(petTypeService.save(pet.getPetType()));
				}else 
					throw new RuntimeException("Pet Type Is Required.");
			}else {
				pet.setId(petService.save(pet).getId());
			}
		});
		}
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
