package com.unireg.service;

import java.util.List;

import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unireg.exception.StudentNotFoundException;
import com.unireg.persistence.domain.Student;
import com.unireg.persistence.repository.StudentRepository;
import com.unireg.rest.dto.StudentDTO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService {

	@Autowired
	private StudentRepository repo;
	@Autowired
	private ModelMapper mapper;

	private StudentDTO mapToDTO(Student student) {
		return this.mapper.map(student, StudentDTO.class);
	}

	public StudentDTO addStudent(Student student) {
		Student saved = this.repo.save(student);
		return this.mapToDTO(saved);
	}

	public List<StudentDTO> getAllStudents() {
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}

	public StudentDTO updateStudent(Long id, Student student) {
		Optional<Student> tempStudent = Optional.of(this.repo.findById(id).orElseThrow(StudentNotFoundException::new));

		Student existing = tempStudent.get();
//		existing.setName(student.getName());
//		existing.setCourse(student.getCourse());

		Student updated = this.repo.save(existing);
		return this.mapToDTO(updated);
	}

	public boolean deleteStudent(Long id) {
		this.repo.findById(id).orElseThrow(StudentNotFoundException::new);
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}

	public StudentDTO readById(Long id) {
		Student found = this.repo.findById(id).orElseThrow(StudentNotFoundException::new);
		return this.mapToDTO(found);
	}

	public StudentDTO readByName(String studentName) {
		Student found = this.repo.studentByName(studentName).orElseThrow(StudentNotFoundException::new);
		return this.mapToDTO(found);
	}

}