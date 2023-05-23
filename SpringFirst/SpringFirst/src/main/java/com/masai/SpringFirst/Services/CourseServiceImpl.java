package com.masai.SpringFirst.Services;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.masai.SpringFirst.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
List <Course> list;

public CourseServiceImpl() {
	list=new ArrayList<>();
	list.add(new Course(143,"Java"," this is full Time"));
	list.add(new Course(144,"Jdk"," this is part Time"));
}

	@Override
	public List<Course> getCourses() {
		
		return list;
	}

	@Override
	public Course getCourses(int courseId) {
		Course c=null;
		for(Course co:list) {
			if(co.getId()==courseId) {
				c=co;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course c) {
		list.forEach(a ->{
			if(a.getId()==c.getId()) {
				a.setTitle(c.getTitle());
				a.setDescription(c.getDescription());
			}
		});
		return c;
	}

	@Override
	public void deleteCourse(int parseInt) {
		list=this.list.stream().filter(a->a.getId()!=parseInt).collect(Collectors.toList());
		
	}

}
