package com.unireg.persistence.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unireg.persistence.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	@Query("select a from Student a where a.studentName=?1")
	Optional<Student> studentByName(String studentName);

}
