package pro.learning.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owner")
public class OwnerController {

	@RequestMapping({"","/","index","index.html"})
	public String getAllPets(Model medel) {
		return "owners/index";
	}
}