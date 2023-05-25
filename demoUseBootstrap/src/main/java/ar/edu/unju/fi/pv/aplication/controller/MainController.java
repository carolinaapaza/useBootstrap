package ar.edu.unju.fi.pv.aplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	
	@GetMapping("/inicio")
	public String getIndexPage(Model model) {
		model.addAttribute("titulo", "Bienvenidos a Programación Visual");
		model.addAttribute("pie", "Desarrollado por Programación Visual año 2023 - Jujuy - Argentina");
		return "index";
	}
	
	@GetMapping("/contacto")
	public String getContactoPage() {
		return "contacto";
	}
}
