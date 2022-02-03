package com.sha.springbootmicroservice1course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sha.springbootmicroservice1course.model.Course;
import com.sha.springbootmicroservice1course.service.CourseService;

@RestController
@RequestMapping("api/course")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@PostMapping
	public ResponseEntity<?> saveCourse(@RequestBody Course course)
	{
		return new ResponseEntity<>(courseService.saveCourse(course), HttpStatus.CREATED);
	}
	
	@DeleteMapping("{courseId}")
	public ResponseEntity<?> deleteCourse(@PathVariable Long courseId)
	{
		courseService.deleteCourse(courseId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<?> getAllCourses()
	{
		return ResponseEntity.ok(courseService.findAllCourses());
	}
		
}
