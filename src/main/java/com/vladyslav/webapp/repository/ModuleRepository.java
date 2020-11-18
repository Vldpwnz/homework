package com.vladyslav.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vladyslav.webapp.model.Module;

@Repository
public interface ModuleRepository extends ModuleBaseRepository {
	
	@Query("select m from Module m")
	List<Module> findAllModules();

}
