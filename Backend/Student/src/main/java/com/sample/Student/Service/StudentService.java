package com.sample.Student.Service;

import java.util.List;
import java.util.Optional;

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
	
	@SuppressWarnings("deprecation")
	public Optional<Student> getStudentById(int id)
	{
		return stdrepo.findById(id);
	}
	public List<Student> getStudent()
	{
		return stdrepo.findAll();
	}
	
	public void deleteStudent(int id)
	{
		stdrepo.deleteById(id);
		
	}
	
	public Student updateStudent(int id, Student std)
	{
		//return stdrepo.save(std);
		
		Student old = this.getStudentById(id).orElse(null);
		if(old!=null)
		{
			old.setName(std.getName()!= null && !std.getName().equals(" ") ? std.getName():old.getName());
			old.setAddress(std.getAddress()!=null && !std.getAddress().equals(" ")?std.getAddress() :old.getAddress());
			old.setContactno(std.getContactno());
			old.setAge(std.getAge());
			old.setBdate(std.getBdate());
			old.setSubject(std.getSubject());
		}
		stdrepo.save(old);
		return old;
	}
}
