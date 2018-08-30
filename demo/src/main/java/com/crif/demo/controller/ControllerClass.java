package com.crif.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crif.demo.dto.StudentDto;
import com.crif.demo.entity.Student;
import com.crif.demo.services.ServiceInterface;

@Controller
@RequestMapping("/api/")
public class ControllerClass {

	@Autowired
	private ServiceInterface serviceInterface;

	@PostMapping("/insertData")
	public void insertData(@RequestBody StudentDto studentDto) {
		serviceInterface.createStudent(studentDto);
	}

	
	@PutMapping("/userPut")
	public void updateUser(@RequestParam("name") String name,@RequestParam("id") String id) {
		
		this.serviceInterface.updateUser(name,Integer.parseInt(id));
	}

	@DeleteMapping("/deleteUser")
	public void deleteUser(@RequestParam("id") String id) {
		this.serviceInterface.deleteData(Integer.parseInt(id));
		
		
	}
	@DeleteMapping("/deleteUserBy")
	public void deleteUserByName(@RequestParam("name") String name) {
		this.serviceInterface.deleteDataByName(name);
		
		
	}
}
