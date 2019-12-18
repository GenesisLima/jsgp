package org.ntvru.jsgp.api;

import java.util.List;

import javax.ws.rs.Produces;

import org.ntvru.jsgp.entity.Material;
import org.ntvru.jsgp.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/v1/material")
public class MaterialAPI {

	@Autowired
	private MaterialService materialService;

	
	@RequestMapping(method=RequestMethod.GET)
	@Produces("application/json")
	public @ResponseBody List<Material> listaEspecieMaterial(@RequestParam("type")String type){
		System.out.println("MATERIAL API CALLED!");
		if(type.trim().equalsIgnoreCase("json") || type.trim() =="");	
		return materialService.list();
}
	}
