package ricoom.transport.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ricoom.transport.dao.Stage;
import ricoom.transport.service.MyService;

@Controller
public class FirstController {
	@Autowired
    private MyService myservice;
    
	
	@GetMapping("/")
	public String IndexPage(Model model) {
		model.addAttribute("stage",new Stage());
		return "Index";
	}
	@PostMapping("/")
	public String AddNew( @Valid Stage stage, BindingResult results,RedirectAttributes att) {
		if(results.hasErrors()){
			return "index";
		}
		att.addAttribute("name",stage.getName());
		att.addAttribute("cost",stage.getCost());
		
		
		myservice.AddPlaces(stage);
		return "index";
	}
}
