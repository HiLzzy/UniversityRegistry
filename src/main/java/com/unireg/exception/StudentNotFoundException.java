package com.unireg.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

	@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Student does not exist with that ID")
	public class StudentNotFoundException extends EntityNotFoundException{
		public StudentNotFoundException() {}
		public StudentNotFoundException(String msg) {
			super(msg);
		}

}
	
