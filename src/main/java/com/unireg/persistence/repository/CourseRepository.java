package com.unireg.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unireg.persistence.domain.Course;
//import com.unireg.persistence.domain.Student;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
	
	@Query("select c from Course c where c.courseName=?1")
//    Optional<Course> courseByName(String courseName);

	Optional<List<Course>> courseByName(String courseName);



}
