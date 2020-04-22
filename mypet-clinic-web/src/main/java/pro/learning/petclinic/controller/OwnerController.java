package pro.learning.petclinic.controller;

import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pro.learning.petclinic.model.Owner;
import pro.learning.petclinic.service.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {

	private final OwnerService ownerService;
	
	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}


	@RequestMapping({"","/","index","index.html"})
	public String getAllPets(Model model) {
		Set<Owner> data = ownerService.findAll();
		model.addAttribute("owners", data);
		return "owners/index";
	}
	
	@RequestMapping({"/find"})
	public String findOwners(Model model) {
		return "inprogress";
	}
}
