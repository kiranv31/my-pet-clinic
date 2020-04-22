package pro.learning.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import pro.learning.petclinic.model.Owner;
import pro.learning.petclinic.model.Pet;
import pro.learning.petclinic.model.PetType;
import pro.learning.petclinic.model.Speciality;
import pro.learning.petclinic.model.Vet;
import pro.learning.petclinic.service.OwnerService;
import pro.learning.petclinic.service.PetService;
import pro.learning.petclinic.service.PetTypeService;
import pro.learning.petclinic.service.SpecialityService;
import pro.learning.petclinic.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	final private OwnerService ownerService;
	final private VetService vetService;
	final private PetTypeService petTypeService;
	final private PetService petService;
	final private SpecialityService specialityService;

	public DataLoader(PetService petService, OwnerService ownerService, VetService vetService,
			PetTypeService petTypeService, SpecialityService specialityService) {
		this.petTypeService = petTypeService;
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petService = petService;
		this.specialityService = specialityService;
	}

	@Override
	public void run(String... args) throws Exception {
		if (petService.findAll().size() == 0)
			petClinicData();
	}

	private void petClinicData() {
		// pet types
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPet = petTypeService.save(dog);

		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatPet = petTypeService.save(cat);

		// cat pet
		Pet myCat1 = new Pet();
		myCat1.setName("Catie");
		myCat1.setPetType(savedCatPet);
		Pet mySavedCat1 = petService.save(myCat1);

		Pet myCat2 = new Pet();
		myCat2.setName("Catie");
		myCat2.setPetType(savedCatPet);
		Pet mySavedCat2 = petService.save(myCat2);

		// dog pet
		Pet myDog1 = new Pet();
		myDog1.setName("Dogie");
		myDog1.setPetType(savedDogPet);
		Pet mySavedDog1 = petService.save(myDog1);

		Pet myDog2 = new Pet();
		myDog2.setName("Dogie");
		myDog2.setPetType(savedDogPet);
		Pet mySavedDog2 = petService.save(myDog2);

		// owner1
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Sherlock");
		owner1.setLastName("Homes");
		owner1.setAddress("Privet Drive");
		owner1.setCity("London");
		owner1.setTelephone("9561095926");
		owner1.getPets().add(mySavedDog1);
		owner1.getPets().add(mySavedCat1);
		mySavedDog1.setOwner(owner1);
		mySavedCat1.setOwner(owner1);
		ownerService.save(owner1);

		// owner2
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("John");
		owner2.setLastName("Watson");
		owner2.setAddress("Marriane Drive");
		owner2.setCity("Mumbai");
		owner2.setTelephone("9019922045");
		owner2.getPets().add(mySavedCat2);
		mySavedCat2.setOwner(owner2);
		mySavedDog2.setOwner(owner2);
		owner2.getPets().add(mySavedDog2);
		ownerService.save(owner2);

		Speciality surgery = new Speciality();
		surgery.setDescription("Surgery");
		Speciality savedSurgery = specialityService.save(surgery);

		Speciality radiology = new Speciality();
		radiology.setDescription("radiology");
		Speciality savedRadiology = specialityService.save(radiology);

		Speciality dentistry = new Speciality();
		dentistry.setDescription("Surgery");
		Speciality savedDentistry = specialityService.save(dentistry);

		// vet1
		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Vivek");
		vet1.setLastName("Maurya");
		vet1.getSpecialities().add(savedRadiology);
		vet1.getSpecialities().add(savedDentistry);
		vetService.save(vet1);

		// vet2
		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("Vibha");
		vet2.setLastName("Verma");
		vet2.getSpecialities().add(savedRadiology);
		vet2.getSpecialities().add(savedDentistry);
		vet2.getSpecialities().add(savedSurgery);
		vetService.save(vet2);

		ownerService.findAll().stream().forEach((owner) -> System.out
				.println(owner.getFirstName() + " " + owner.getLastName() + " " + owner.getPets().size()));
		vetService.findAll().stream().forEach((vetObject) -> System.out.println(
				vetObject.getFirstName() + " " + vetObject.getLastName() + " " + vetObject.getSpecialities().size()));

	}

}
