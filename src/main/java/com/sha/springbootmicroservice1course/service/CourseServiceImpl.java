package com.sha.springbootmicroservice1course.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sha.springbootmicroservice1course.model.Course;
import com.sha.springbootmicroservice1course.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService
{
	private final CourseRepository courseRepository;

	public CourseServiceImpl(CourseRepository courseRepository) 
	{
		super();
		this.courseRepository = courseRepository;
	}
	
	@Override
	public Course saveCourse(Course course) 
	{
		course.setCreateTime(LocalDateTime.now());
		return courseRepository.save(course);
	}
	
	@Override
	public void deleteCourse(Long courseId) 
	{
		courseRepository.deleteById(courseId);
	}
	
	@Override
	public List<Course> findAllCourses() 
	{
		return courseRepository.findAll();
	}
}
