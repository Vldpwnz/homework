package com.vladyslav.webapp.service;

import java.util.List;

import com.vladyslav.webapp.model.Module;

public interface ModuleService {
	
	public List<Module> findAllModules();

	public void saveModule(Module module);

}
