package org.ntvru.jsgp.controller;

import org.ntvru.jsgp.entity.Departamento;
import org.ntvru.jsgp.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/departamento")
public class DepartamentController {

	@Autowired
	private DepartamentoService departamentoService;
	
	@RequestMapping(method=RequestMethod.GET)
	 public String form() {	  	 
		  return "views/departamento/main";
	 }
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvarDepartamento(Departamento departamento){
		departamentoService.save(departamento);
		return "redirect:/departamento";
	}
	


}
