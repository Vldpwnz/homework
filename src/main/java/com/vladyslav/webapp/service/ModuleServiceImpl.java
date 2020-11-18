package com.vladyslav.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vladyslav.webapp.model.Module;
import com.vladyslav.webapp.repository.ModuleRepository;

@Service
public class ModuleServiceImpl implements ModuleService {
	
	
	private final ModuleRepository moduleRepository;
	
	@Autowired
	public ModuleServiceImpl(ModuleRepository moduleRepository) {
		this.moduleRepository = moduleRepository;
	}

	@Override
	public List<Module> findAllModules() {
		return moduleRepository.findAll();
	}

	@Override
	public void saveModule(Module module) {
		
		moduleRepository.save(module);
		
	}

	

}
