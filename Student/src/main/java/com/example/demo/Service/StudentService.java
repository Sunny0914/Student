package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Student;



public interface StudentService {

	public void add(Student student);

	public List<Student> display();

	public void delete(Integer rollno);

	public void update(Student Student, Integer rollno);
	
	public List<Student> searchbyname(String name, String grade , String division , String result);
	
	public List<Student> mazxMarksStudent();

	
}
