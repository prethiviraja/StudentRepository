package com.Student.DAO;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import com.Student.Repoitory.StudentRepository;
import com.Student.entity.Student;




@Repository
public class  StudentDAO{
	
	@Autowired
	StudentRepository vr;
	

	public String poststudent(Student s) {
		vr.save(s);
		return "Successfull";
	}
	public List<Student> getstudent(){
		return vr.findAll();
	}
	public String putstudent(Student s) {
		vr.save(s);
		return "Done";
	}
	public String deletestudent(int a) {
		vr.deleteById(a);
		return "Deleted";
	}
	public int getAtten(int b) {
		return vr.getAtten(b);
	}
}
	





