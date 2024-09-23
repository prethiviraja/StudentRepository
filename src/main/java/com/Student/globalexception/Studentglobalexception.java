package com.Student.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Student.exception.AgeException;



@RestControllerAdvice
public class Studentglobalexception {
	
	@ExceptionHandler(AgeException.class)
	public ResponseEntity<Object> notFound(AgeException ae){
		return new ResponseEntity<>(ae.getMessage(),HttpStatus.NOT_FOUND);
	}
}


