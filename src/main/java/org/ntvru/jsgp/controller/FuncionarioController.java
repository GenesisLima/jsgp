package org.ntvru.jsgp.controller;

import org.ntvru.jsgp.entity.Funcionario;
import org.ntvru.jsgp.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioController {

	@Autowired
	private FuncionarioService funcionarioService;
	
	@RequestMapping(method=RequestMethod.GET)
	 public String form() {	  	 
		  return "views/funcionario/main";
	 }
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvarFuncioario(Funcionario funcionario, @RequestParam("departamento_id") long departamentoId){
		funcionario.setDepartamento(funcionarioService.getDepartamentoService().getById(departamentoId));
		funcionarioService.save(funcionario);
		return "redirect:/funcionario";
	}
	
}
