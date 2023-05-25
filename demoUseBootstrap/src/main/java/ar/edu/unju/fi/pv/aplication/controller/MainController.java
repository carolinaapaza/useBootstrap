package ar.edu.unju.fi.pv.aplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	
	@GetMapping("/inicio")
	public String getIndexPage(Model model) {
		model.addAttribute("titulo", "Bienvenidos a Programación Visual");
		model.addAttribute("pie", "Desarrollado por Programación Visual año 2023 - Jujuy - Argentina");
		return "index";
	}
	

	@GetMapping("/formulario-contacto")
	public ModelAndView getContactoPage() {
		ModelAndView mv = new ModelAndView("contacto");
		mv.addObject("titulo", "Formulario de contacto");
		return mv;
	}
	
	@GetMapping("/lista-productos")
	public String getProductosPage() {
		return "productos";
	}
}
