package org.ntvru.jsgp.api;

import java.util.List;

import javax.ws.rs.Produces;

import org.ntvru.jsgp.entitty.EspecieMaterial;
import org.ntvru.jsgp.repository.EspecieMaterialDAO;
import org.ntvru.jsgp.service.EspecieMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/v1/especiematerial")
public class EspecieMaterialAPI {

	@Autowired
	private EspecieMaterialService especieMaterialService;

	
	@RequestMapping(method=RequestMethod.GET)
	@Produces("application/json")
	public @ResponseBody List<EspecieMaterial> listaEspecieMaterial(@RequestParam("type")String type){
		System.out.println("ESPECIE MATERIAL API CALLED!");
		if(type.trim().equalsIgnoreCase("json") || type.trim() =="");	
		return especieMaterialService.list();
}
	}
