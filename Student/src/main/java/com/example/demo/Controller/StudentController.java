package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudentService;
import com.example.demo.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService ss;
	
	@PostMapping("/add")
	public void add(@RequestBody Student student) {
		ss.add(student);
	}
	
	@GetMapping("/display")
	public List<Student> display(){
		return ss.display();
	}
	
	@DeleteMapping("/DeleteRecord/{id}")
	public void delete(@PathVariable Integer id) {
		ss.delete(id);
	}
	
	@PutMapping("/Update/{id}")
	public void updateCollage(@RequestBody Student collage, @PathVariable Integer id) {
		ss.update(collage, id);
	}

	@GetMapping("/search/{grade}/{division}/{result}")
	public List<Student> searchbyname(@RequestParam (required = false) String name,
									  @RequestParam (required = false) String grade,
									  @RequestParam (required = false) String division,
									  @RequestParam (required = false) String result){
		return ss.searchbyname(name, grade, division, result);
	
	}	
}
