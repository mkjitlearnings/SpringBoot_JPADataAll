package com.mkj.restapp.SpringBootRestDemo.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.mkj.restapp.SpringBootRestDemo.bean.Instructor;

public interface InstructorService {

	public List<Instructor> getAllInstructors();
	
	@Query("FROM Instructor ORDER BY jobstartyear ASC")
	public List<Instructor> getAllInstructorsOrderByExp();
	
	public List<Instructor> getAllInstructorsOrderBySalary();
	
	public List<Instructor> getAllInstructorsByCity(String location);
	
	
	
}
