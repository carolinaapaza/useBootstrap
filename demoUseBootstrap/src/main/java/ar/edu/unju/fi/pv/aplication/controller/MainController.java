package ar.edu.unju.fi.pv.aplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	
	@GetMapping("/inicio")
	public String getIndexPage() {
		return "index";
	}
}
