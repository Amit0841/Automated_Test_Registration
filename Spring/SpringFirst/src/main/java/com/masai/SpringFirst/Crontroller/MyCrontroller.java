package com.masai.SpringFirst.Crontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.SpringFirst.Services.CourseService;
import com.masai.SpringFirst.entities.Course;

@RestController
public class MyCrontroller {
	
@GetMapping("/Home")
	public String home() {
		return "Welcome";
		
	}
@Autowired
private CourseService cs;

	@GetMapping("/course")
public List<Course>  getCourses(){
	
	return this.cs.getCourses();
  }
	
}
