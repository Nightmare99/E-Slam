package com.maniaq.ESlam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

	@Autowired
	private SlamRepository repository;
	
	@GetMapping("/")
	public String greeting(Model model) {
		model.addAttribute("slam", new Slam());
		return "form";
	}

	@PostMapping("/")
	  public String greetingSubmit(@ModelAttribute Slam slam) {
		repository.save(slam);
	    return "result";
	 }
}
