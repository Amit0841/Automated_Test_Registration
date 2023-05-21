package com.masai.SpringFirst.Services;

import java.util.*;

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

}
