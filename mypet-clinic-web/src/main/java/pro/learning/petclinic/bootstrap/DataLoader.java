package pro.learning.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import pro.learning.petclinic.model.Owner;
import pro.learning.petclinic.model.Vet;
import pro.learning.petclinic.service.OwnerService;
import pro.learning.petclinic.service.VetService;
import pro.learning.petclinic.service.map.OwnerServiceMapImple;
import pro.learning.petclinic.service.map.VetServiceMapImpl;

@Component
public class DataLoader implements CommandLineRunner {

	final private OwnerService ownerService;
	final private VetService vetService;
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Sherlock");
		owner1.setLastName("Homes");
		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("John");
		owner2.setLastName("Watson");
		ownerService.save(owner2);

		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Vivek");
		vet1.setLastName("Maurya");
		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("Vibha");
		vet2.setLastName("Verma");
		vetService.save(vet2);

		System.out.println("Loading data...");
		System.out.println("Data loaded....");

		ownerService.findAll()
				.stream()
				.forEach((owner) -> System.out.println(owner.getFirstName() + " " + owner.getLastName()));
		vetService.findAll()
				.stream()
				.forEach((vetObject) -> System.out.println(vetObject.getFirstName() + " " + vetObject.getLastName()));
	}

}
