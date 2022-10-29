package com.unireg.rest.dto;

import java.util.ArrayList;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.unireg.persistence.domain.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {

	private Long studentId;

	private String studentName;
	
	private String dateOfBirth;
    

  private String address;


  private long phoneNumber;
  

  private String emailAddress;
  
  private String userName;
  
  private String password;

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

@Override
public String toString() {
	return "StudentDTO [studentId=" + studentId + ", studentName=" + studentName + ", dateOfBirth=" + dateOfBirth
			+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + ", userName="
			+ userName + ", password=" + password + "]";
}
  

//	private List<Student> students = new ArrayList<>();

	}