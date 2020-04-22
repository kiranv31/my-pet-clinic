package pro.learning.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping({"", "/","index","index.html"})
	public String index() {
		return "index";
	}
	
	@RequestMapping({"vets.html"})
	public String getAllPets(Model modal) {
		return "vets/index";
	}
	
	@RequestMapping({"/oups"})
	public String errorHandler(Model modal) {
		return "error";
	}
}
