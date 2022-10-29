package com.unireg.service;

import java.util.List;

import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unireg.exception.CourseNotFoundException;
import com.unireg.persistence.domain.Course;
import com.unireg.persistence.domain.Student;
import com.unireg.persistence.repository.CourseRepository;
import com.unireg.rest.dto.CourseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@AllArgsConstructor
@Data
public class CourseService {

	@Autowired
	private CourseRepository repo;
	@Autowired
	private ModelMapper mapper;

	private CourseDTO mapToDTO(Course course) {
		return this.mapper.map(course, CourseDTO.class);
	}

	public CourseDTO addCourse(Course course) {
		Course saved = this.repo.save(course);
		return this.mapToDTO(saved);
	}

	public List<CourseDTO> getAllCourses() {
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}

	public CourseDTO updateCourse(Long id, Course course) {
		Optional<Course> tempCourse = Optional.of(this.repo.findById(id).orElseThrow(CourseNotFoundException::new));
		Course existing = tempCourse.get();
        Student x = new Student();
		existing.setCourseName("Psychology");
		existing.setCourseType("Undergraduate");
		existing.setCourseDescription("3 year degree");
		existing.setStudent(x);

		Course updated = this.repo.save(existing);
		return this.mapToDTO(updated);
	}

	public boolean deleteCourse(Long id) {
		this.repo.findById(id).orElseThrow(CourseNotFoundException::new);
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}

	public CourseDTO readById(Long id) {
		Course found = this.repo.findById(id).orElseThrow(CourseNotFoundException::new);
		return this.mapToDTO(found);
	}

	public List<CourseDTO> readByName(String name) {
		List<Course> found = this.repo.courseByName(name).orElseThrow(CourseNotFoundException::new);
		return found.stream().map(this::mapToDTO).collect(Collectors.toList());
	}

}