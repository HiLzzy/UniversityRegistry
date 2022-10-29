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

import com.unireg.persistence.domain.Course;
import com.unireg.rest.dto.CourseDTO;
import com.unireg.service.CourseService;

//import lombok.AllArgsConstructor;

@RestController
//@AllArgsConstructor
public class CourseController {
	@Autowired
	private CourseService service;
	
	@PostMapping("addCourse")
	public CourseDTO addCourse(@RequestBody Course course) {
	return service.addCourse(course);
	}

	@GetMapping("/allCourses")
	public List<CourseDTO> getAllCourses(){
	return service.getAllCourses();
	}

	@PutMapping("/updateCourse/{id}")
	public CourseDTO updateCourse(@PathVariable Long id, @RequestBody Course course) {
	return service.updateCourse(id, course);
	}

	@DeleteMapping("/deleteCourse/{id}")
	public boolean deleteCourse(@PathVariable Long id) {
	return service.deleteCourse(id);
	}

	@GetMapping("/courseById")
	public CourseDTO readCourseById(@PathParam("id") Long id) {
	return service.readById(id);
	}

	@GetMapping("/courseByName")
	public List<CourseDTO> readCourseByName(@PathParam("courseName") String courseName){
	return service.readByName(courseName);
	}
}



