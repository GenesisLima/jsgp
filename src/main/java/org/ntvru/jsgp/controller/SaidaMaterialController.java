package org.ntvru.jsgp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/saidaMaterial")
public class SaidaMaterialController {

	@RequestMapping(method=RequestMethod.GET)
	public String main() {
		return "views/processos/saidamaterial/main";
	}
}
