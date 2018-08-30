package com.crif.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.crif.demo.entity.Student;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Modifying
	@Query("delete from Student u where u.name =?1")
	void deleteUsersByFirstName(String name);


}