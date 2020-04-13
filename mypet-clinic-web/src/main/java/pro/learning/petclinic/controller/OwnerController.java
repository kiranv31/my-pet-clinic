package pro.learning.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pro.learning.petclinic.service.OwnerService;

@Controller
@RequestMapping("/owner")
public class OwnerController {

	private final OwnerService ownerService;
	
	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}


	@RequestMapping({"","/","index","index.html"})
	public String getAllPets(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}
}
