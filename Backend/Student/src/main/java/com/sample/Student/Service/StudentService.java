package com.sample.Student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.Student.Entity.Student;
import com.sample.Student.Repository.StudentRepo;

@Component
public class StudentService {

	@Autowired
	private StudentRepo stdrepo; 
	
	
	public Student createStudent(Student std)
	{
		stdrepo.save(std);
		return std;
		
		
		
	}
}
