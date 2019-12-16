package org.ntvru.jsgp.controller;

import org.ntvru.jsgp.entitty.EspecieMaterial;
import org.ntvru.jsgp.service.EspecieMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/especiematerial")
public class EspecieMaterialController {
	
	@Autowired
	private EspecieMaterialService especieMaterialService;

	@RequestMapping(method=RequestMethod.GET)
	 public String form() {	  	 
		  return "views/especiematerial/form";
	 }
	 
	@RequestMapping(method=RequestMethod.POST)
	 public String salvar(EspecieMaterial especieMaterial) {
		 especieMaterialService.save(especieMaterial);
		return "redirect:/especiematerial/list";
	 }
}
