package org.ntvru.jsgp.controller;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import org.ntvru.jsgp.entity.Material;
import org.ntvru.jsgp.service.EspecieMaterialService;
import org.ntvru.jsgp.service.MaterialService;
import org.ntvru.jsgp.utils.StringBigDecimalConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/material")
public class MaterialController {

	@Autowired
	private MaterialService materialService;
	
	@Autowired
	private EspecieMaterialService especieMaterialService;
	
	@RequestMapping(method=RequestMethod.GET)
	 public String main() {	  	 
		  return "views/material/main";
	 }
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvarMaterial( @Valid @RequestParam("nome") String nome,
			@RequestParam("unidade") String unidade,
			@RequestParam("precoMedio") String precoMedio,
			@RequestParam("especieMaterialId") int especieMaterialId,
			@RequestParam("descricao") String descricao,
			RedirectAttributes redirectAttributes) {

		
		Material material = new Material();
		material.setNome(nome);
		material.setUnidade(unidade);
		material.setEspecieMaterial(especieMaterialService.getById((long) especieMaterialId));
		try {
			material.setPrecoMedio(StringBigDecimalConverter.converteStringParaBigDecimal(precoMedio));
			System.out.println("PRECO MEDIO "+material.getPrecoMedio());

		} catch (ParseException e) {
			e.printStackTrace();
		}

		
			System.out.println("Preço Material "+material.getPrecoMedio());
		
		material.setDescricao(descricao);
		
        //redirectAttributes.addFlashAttribute("message", newFileMessage);
		
		
		
System.out.println("MATERIAL "+material);
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
