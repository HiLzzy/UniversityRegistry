package com.unireg.rest.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.unireg.persistence.domain.Student;
import com.unireg.rest.dto.StudentDTO;
import com.unireg.service.StudentService;

import lombok.AllArgsConstructor;

	@RestController
	@AllArgsConstructor
	public class StudentController {
		@Autowired
		private StudentService service;
		
		@PostMapping("/addStudent")
		public StudentDTO addstudent(@RequestBody Student student) {
		return service.addStudent(student);
		}

		@GetMapping("/allStudents")
		public List<StudentDTO> getAllStudents(){
		return service.getAllStudents();
		}

		@PutMapping("/updateStudent/{id}")
		public StudentDTO updateStudent(@PathVariable Long id, @RequestBody Student student) {
		return service.updateStudent(id, student);
		}

		@DeleteMapping("/deleteStudent/{id}")
		public boolean deleteStudent(@PathVariable Long id) {
		return service.deleteStudent(id);
		}

		@GetMapping("/studentById")
		public StudentDTO readStudentById(@PathParam("id") Long id) {
		return service.readById(id);
		}

		@GetMapping("/StudentByName")
		public StudentDTO readByName(@PathParam("name") String studentName){
		return service.readByName(studentName);
		}
	}



