package com.sample.Student.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.Student.Entity.Student;
import com.sample.Student.Service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

	private Map<Integer , Student> stdd = new HashMap<>();
	
	@Autowired
	private StudentService stdService;
	
	@GetMapping
	public List<Student> getStudent()
	{
		return null;
	}
	
	
	@PostMapping
	public Student createStudent(@RequestBody Student std)
	{
		return stdService.createStudent(std);
		
	}
	
	
	
}
