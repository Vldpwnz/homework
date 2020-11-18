package com.vladyslav.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.vladyslav.webapp.model.Module;

@NoRepositoryBean
public interface ModuleBaseRepository extends JpaRepository<Module, Long> {
}
