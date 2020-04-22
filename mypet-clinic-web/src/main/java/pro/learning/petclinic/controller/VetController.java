package pro.learning.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pro.learning.petclinic.service.VetService;

@Controller
@RequestMapping("/vets")
public class VetController {
	
	private final VetService vetService;
	
	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}

	@RequestMapping({"","/","index","index.html","vets.html"})
	public String getAllPets(Model modal) {
		modal.addAttribute("vets",vetService.findAll());
		return "vets/index";
	}
}
