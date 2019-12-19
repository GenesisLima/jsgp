package org.ntvru.jsgp.api;

import java.util.List;

import javax.ws.rs.Produces;

import org.ntvru.jsgp.entity.Departamento;
import org.ntvru.jsgp.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/v1/departamento")
public class DepartamentoAPI {

	
	@Autowired
	private DepartamentoService departamentoService;
	

	@RequestMapping(method=RequestMethod.GET)
	@Produces("application/json")
	public @ResponseBody List<Departamento> listaDepartamento(@RequestParam("type") String type){
		if(type.trim().equalsIgnoreCase("json") || type.trim() == "");
		return departamentoService.list();
	}
	
	
}
