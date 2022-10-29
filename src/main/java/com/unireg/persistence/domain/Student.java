package com.unireg.persistence.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Student {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
//	@Max(8)
    private long studentId;
	
//    @NotNull
//    @Size(min = 2, max = 50)
    private String studentName;
    
//    @NotNull
    private String dateOfBirth;
    
//    @NotNull
    private String address;
  
//    @NotNull
//    @Max(11)
    private long phoneNumber;
    
//    @NotNull
    private String emailAddress;
    
    
    @Size(min = 7, max = 20)
    @NotNull
    private String userName;
    
    @Size(min = 7, max = 20)
    @NotNull
    private String password;
    
    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private List<Course> Courses = new ArrayList<>();

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Course> getCourses() {
		return Courses;
	}

	public void setCourses(List<Course> courses) {
		Courses = courses;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", dateOfBirth=" + dateOfBirth
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress
				+ ", userName=" + userName + ", password=" + password + ", Courses=" + Courses + "]";
	}

	public Student() {
		super();
	}

	public Student(@NotNull long studentId, @NotNull String studentName, @NotNull String dateOfBirth,
			@NotNull String address, @NotNull long phoneNumber, @NotNull String emailAddress,
			@Min(7) @Max(20) @NotNull String userName, @Min(7) @Max(14) @NotNull String password,
			List<Course> courses) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.userName = userName;
		this.password = password;
		Courses = courses;
	}

	
	
    
    
    

    
    

}


