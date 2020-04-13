package pro.learning.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pro.learning.petclinic.service.PetService;


@Controller
@RequestMapping({"/pet"})
public class PetController {
	
	private final PetService petService;
	
	public PetController(PetService petService) {
		this.petService = petService;
	}

	@RequestMapping({"","/","index","index.html"})
	public String getAllPets(Model model) {
		return "pets/index";
	}
}
