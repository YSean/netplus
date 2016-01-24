package com.net.plus.console.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fodder")
public class FodderController {

	@RequestMapping(value="init.do")
	public String init(){
		return "fodder/init";
	}
	@RequestMapping(value="upload")
	public String uploadMateria(){
		return "";
	}
}
