package com.vladyslav.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.vladyslav.webapp.model.Module;
import com.vladyslav.webapp.model.PickUpModule;
import com.vladyslav.webapp.model.ScreenModule;
import com.vladyslav.webapp.service.ModuleServiceImpl;


@Controller
public class ModuleController {
	
	@Autowired
	private ModuleServiceImpl service;
	
	
	@GetMapping("/")
	public String findAllModules(Model model) {
		model.addAttribute("modules", service.findAllModules());
		return "modules";
	}
	
	@GetMapping("/add-module")
	public String addModule(Model model) {
		Module screenModule = new ScreenModule();
		Module pickUpModule = new PickUpModule();
		
		model.addAttribute("screen", screenModule);
		model.addAttribute("pickUp", pickUpModule);
		return "add-module";
	}
	
	@PostMapping("/save-pickUp")
	public String savePickUpModule(PickUpModule module) {
		service.saveModule(module);
		return "redirect:/";
	}
	
	@PostMapping("/save-screen")
	public String saveScreenModule(ScreenModule module) {
		service.saveModule(module);
		return "redirect:/";
	}
	

}
