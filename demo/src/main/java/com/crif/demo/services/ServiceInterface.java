package com.crif.demo.services;

import java.util.List;

import com.crif.demo.dto.StudentDto;
import com.crif.demo.entity.Student;

public interface ServiceInterface {
	 boolean createStudent(StudentDto universityDto);
     void updateUser(String name,int id);
     List<Student> getAllUser();
     void deleteData(int id);
	void deleteDataByName(String name);
}
