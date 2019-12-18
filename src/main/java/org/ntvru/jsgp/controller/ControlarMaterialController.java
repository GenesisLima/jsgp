package org.ntvru.jsgp.controller;

import java.text.ParseException;

import org.ntvru.jsgp.entity.ControleMaterial;
import org.ntvru.jsgp.service.ControleMaterialService;
import org.ntvru.jsgp.utils.StringBigDecimalConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("controlarMaterial")
public class ControlarMaterialController {

	
	@Autowired
	private ControleMaterialService service;
	

	
	@RequestMapping(method=RequestMethod.POST)
	public String salvarControleMaterial(@RequestParam("material_id") Long materialId,
			@RequestParam("quantidade") int quantidade,
			@RequestParam("precoTotal") String precoTotal,
			@RequestParam("observacao") String observacao) {
		
		ControleMaterial controleMaterial = new ControleMaterial();
		controleMaterial.setMaterial(service.getMaterialService().getById(materialId));
		controleMaterial.setQuantidade(quantidade);
		controleMaterial.setObservacao(observacao);
		try {
			controleMaterial.setPrecoTotal(StringBigDecimalConverter.converteStringParaBigDecimal(precoTotal));
		} catch (ParseException e) {			
			e.printStackTrace();
		}
		
	
		service.save(controleMaterial);
		
		return "redirect:/";
	}
	
	@RequestMapping(method=RequestMethod.GET)
	 public String main() {	  	 
		  return "views/controles/material/main";
	 }
}
