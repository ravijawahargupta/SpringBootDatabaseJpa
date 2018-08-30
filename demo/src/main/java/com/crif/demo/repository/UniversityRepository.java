package com.crif.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crif.demo.entity.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Integer> {

}
