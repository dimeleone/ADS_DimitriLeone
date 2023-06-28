package br.inatel.labs.labads.padraomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

/*
 * @autor dimitri.leone
 * @since 19.06.2023
 */

@Controller
public class OlaMundoController {

	@GetMapping("/ola")
	public String getOla(Model model) {
		
		model.addAttribute("usuario", "Dimitri Leone");
		
		return "ola-mundo"; //não precisa colocar '.html'
	}
}
