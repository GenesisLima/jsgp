package org.ntvru.jsgp.controller;

import org.ntvru.jsgp.entitty.Material;
import org.ntvru.jsgp.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/material")
public class MaterialController {

	@Autowired
	private MaterialService materialService;
	
	@RequestMapping("/salvar")
	public String salvarMaterial(Material material, RedirectAttributes redirectAttributes) {
       // redirectAttributes.addFlashAttribute("message", newFileMessage);
        materialService.save(material);        
		return "redirect:/";
	}
	
	@RequestMapping("/remover")
	public String removerMaterial(@RequestParam("id") Long id, RedirectAttributes redirectAttributes) {
       // redirectAttributes.addFlashAttribute("message", newFileMessage);
        materialService.delete(id);        
		return "redirect:/";
	}
}
