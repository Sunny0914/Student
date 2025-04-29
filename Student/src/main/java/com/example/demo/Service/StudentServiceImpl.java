package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository sr;

	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		sr.save(student);
	}

	@Override
	public List<Student> display() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
	}

	@Override
	public void update(Student Student, Integer id) {
		// TODO Auto-generated method stub
		Student.setRollno(id);
		sr.save(Student);
	}

	@Override
	public List<Student> searchbyname(String name, String grade, String division, String result) {
		// TODO Auto-generated method stub
		var StudentArray = new ArrayList<Student>();

		for (Student student : sr.findAll()) {
			if (name != null && student.getName().equalsIgnoreCase(name)
					|| grade != null && student.getGrade().equalsIgnoreCase(grade)
					|| division != null && student.getDivision().equalsIgnoreCase(division)
					|| result != null && student.getResult().equalsIgnoreCase(result)) {
				StudentArray.add(student);
				return StudentArray;
			}
		}

		return null;
	}

	@Override
	public List<Student> mazxMarksStudent() {
		List<Student> maxarray = sr.findAll();

		List<Student> maxMarksStudents = new ArrayList<Student>();

		float max = Integer.MAX_VALUE;

		for (Student student : maxMarksStudents) {
			if (student.getMarks() > max) {
				max = student.getMarks();
			}
		}
		for (Student student : maxMarksStudents) {
			if (student.getMarks() == max) {
				maxMarksStudents.add(student);
			}
		}

		return maxMarksStudents;

	}
}
