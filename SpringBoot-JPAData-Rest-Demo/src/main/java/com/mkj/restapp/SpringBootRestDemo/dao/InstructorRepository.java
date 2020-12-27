package com.mkj.restapp.SpringBootRestDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkj.restapp.SpringBootRestDemo.bean.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Integer>, CustomInstructorRepository
{

	// no need of more code
	
}
