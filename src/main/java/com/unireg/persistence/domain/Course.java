package com.unireg.persistence.domain;

import java.util.List;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private long courseId;
	
	@NotNull
	@Size(min = 6, max = 50)
	private String courseName;

	@NotNull
	@Size(min = 6, max = 50)
	private String courseType;

	@NotNull
	private String courseDescription;

	@ManyToOne
	private Student student;

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course() {
		super();
	}

	public Course(@NotNull @Min(10) @Max(10) long courseId, @NotNull @Size(min = 6, max = 50) String courseName,
			@NotNull @Size(min = 6, max = 50) String courseType, @NotNull String courseDescription, Student student) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseType = courseType;
		this.courseDescription = courseDescription;
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseType=" + courseType + ", courseDescription="
				+ courseDescription + ", student=" + student + "]";
	}

}
