package com.mkj.restapp.SpringBootRestDemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.mkj.restapp.SpringBootRestDemo.bean.Instructor;

public interface CustomInstructorRepository {
	
	public List<Instructor> getAllTrainersByLocation(String location);
}
