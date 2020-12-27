package com.mkj.restapp.SpringBootRestDemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mkj.restapp.SpringBootRestDemo.bean.Instructor;
import com.mkj.restapp.SpringBootRestDemo.dao.InstructorRepository;

@Service
public class InstructorServiceImpl implements InstructorService{

	@Autowired
	private InstructorRepository repository; 
	
	@Override
	@Transactional
	public List<Instructor> getAllInstructors() {
		return repository.findAll();
	}

	@Override
	public List<Instructor> getAllInstructorsOrderByExp() {
		return repository.findAll();
	}

	@Override
	public List<Instructor> getAllInstructorsOrderBySalary() {
		// TODO Auto-generated method stub
		return repository.findAll(Sort.by("Salary").descending());
	}

	@Override
	public List<Instructor> getAllInstructorsByCity(String location) {
		return repository.getAllTrainersByLocation(location);
	}
	
	/*
	 * https://dzone.com/articles/pagination-and-sorting-with-spring-data-jpa
	 * */
	
	
	
	
	

	
}
