package org.ntvru.jsgp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("material")
	public String novoMaterial() {
		return "views/material/form";
	}
	
//	@RequestMapping("tipomaterial")
//	public String novoTipoMaterial() {
//		return "views/tipomaterial/form";
//	}
}