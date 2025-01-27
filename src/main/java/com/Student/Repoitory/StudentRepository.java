package com.Student.Repoitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Student.entity.Student;


	public interface StudentRepository extends JpaRepository<Student, Integer> {
		
		@Query(value="select attendance from student.student where rollnum =?",nativeQuery=true)
		public int getAtten(int b);


}
	