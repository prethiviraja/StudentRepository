package com.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Student.entity.Student;
import com.Student.exception.AgeException;
import com.Student.service.Studentservice;

	

@RestController
@RequestMapping(value="/Student")
public class StudentController {
	
	@Autowired
	Studentservice vs;
	

	@PostMapping(value="/postDetails")
	public String poststudent(@RequestBody Student s) throws AgeException {
		return vs.poststudent(s);
	}
	@GetMapping(value="/getDetails")
	public List<Student> getstudent(){
		return vs.getstudent();
	}
	@PutMapping(value="/putDetails")
	public String  putstudent(@RequestBody Student s) {
		return vs.putstudent(s);
	}
	@DeleteMapping(value="/deleteDetails/{a}")
	public String deletestudent(@PathVariable int a) {
		return vs.deletestudent(a);
	}
	@GetMapping(value="/getAtten/{b}")
	public int getAtten(@PathVariable int b) {
		return vs.getAtten(b);
	}
}


