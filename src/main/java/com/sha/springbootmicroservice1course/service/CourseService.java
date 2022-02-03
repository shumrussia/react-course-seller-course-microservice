package com.sha.springbootmicroservice1course.service;

import java.util.List;

import com.sha.springbootmicroservice1course.model.Course;

public interface CourseService 
{

	Course saveCourse(Course course);

	void deleteCourse(Long courseId);

	List<Course> findAllCourses();

}
