package com.crif.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crif.demo.dto.StudentDto;
import com.crif.demo.entity.Student;
import com.crif.demo.repository.DepartmentRepository;
import com.crif.demo.repository.ProfessorRepository;
import com.crif.demo.repository.StudentRepository;

@Service
public class ServiceClass implements ServiceInterface {

	/*@Autowired
	private UniversityRepository userRepo;

	@Autowired
	private CollegeRepository collegeRepo;

	@Autowired
	private CourseRepository courseRepo;*/

	@Autowired
	private DepartmentRepository deptartmentRepo;

	@Autowired
	private ProfessorRepository professorRepo;

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public boolean createStudent(StudentDto studentDto) {

		Student student = new Student();
		student.setDepartment(deptartmentRepo.findById(studentDto.getDepartmentId()).get());
		student.setName(studentDto.getName());
		student.setProfessor(professorRepo.findById(studentDto.getProfessorId()).get());
		studentRepo.save(student);

		return true;
	}

	@Override
	public void updateUser(String name, int id) {
		Student student = new Student();
		student.setsId(id);
		student.setName(name);
		studentRepo.save(student);

	}

	@Override
	public void deleteData(int id) {
		this.studentRepo.deleteById(id);

	}

	@Override
	public List<Student> getAllUser() {

		return this.studentRepo.findAll();
	}

	@Override
	public void deleteDataByName(String name) {
		this.studentRepo.deleteUsersByFirstName(name);

	}

}
/*
 * University university = new University(); university.setuName("xyz");
 * userRepo.save(university);
 * 
 * College college = new College(); college.setCollegeName("AKG");
 * college.setUniversity(university); collegeRepo.save(college);
 * 
 * Department department = new Department(); department.setCollege(college);
 * department.setDeptName("CSE"); deptartmentRepo.save(department);
 * 
 * Course course = new Course(); course.setCourseName("Java");
 * course.setDepartment(department); courseRepo.save(course);
 * 
 * Professor professor = new Professor(); professor.setDepartment(department);
 * professor.setName("Ravi"); professorRepo.save(professor);
 */
