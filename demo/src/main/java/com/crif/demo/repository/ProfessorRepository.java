package com.crif.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crif.demo.entity.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

	
}