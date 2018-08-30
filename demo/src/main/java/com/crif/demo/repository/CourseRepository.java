package com.crif.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crif.demo.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}