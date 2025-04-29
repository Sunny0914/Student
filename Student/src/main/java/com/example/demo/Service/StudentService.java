package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Student;



public interface StudentService {

	public void add(Student student);

	public List<Student> display();

	public void delete(Integer id);

	public void update(Student Student, Integer id);
	
	public List<Student> searchbyname(String name, String grade , String division , String result);
	
	public List<Student> mazxMarksStudent();

	
}
