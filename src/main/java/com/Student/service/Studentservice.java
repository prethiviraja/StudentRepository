package com.Student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Student.DAO.StudentDAO;
import com.Student.entity.Student;
import com.Student.exception.AgeException;



@Service
public class  Studentservice{
		
		@Autowired
		StudentDAO vd;
		

		public String poststudent(Student s) throws AgeException {
				if(s.getAge()<18) {
					throw new AgeException("Not Eligible");
				}
			return vd.poststudent(s);
		}

		public List<Student> getstudent(){
			return vd.getstudent();
		}
		public String putstudent(Student s) {
			return vd.putstudent(s);
		}
		public String deletestudent(int a) {
			return vd.deletestudent(a);
		}
		public int getAtten(int a) {
			return vd.getAtten(a);
		}
}
		


		






