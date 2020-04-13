package pro.learning.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping({"/pet"})
public class PetController {
	
	@RequestMapping({"","/","index","index.html"})
	public String getAllPets(Model medel) {
		return "pets/index";
	}
}
