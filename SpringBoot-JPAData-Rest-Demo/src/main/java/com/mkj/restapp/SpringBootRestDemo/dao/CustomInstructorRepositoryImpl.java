package com.mkj.restapp.SpringBootRestDemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mkj.restapp.SpringBootRestDemo.bean.Instructor;

@Repository
public class CustomInstructorRepositoryImpl implements CustomInstructorRepository {

	@Autowired
	EntityManager entityManager;
	
	@Override
	@Transactional
	public List<Instructor> getAllTrainersByLocation(String location) {
		Session session = entityManager.unwrap(Session.class);
		Query<Instructor> query = session.createQuery("from Instructor where trainerlocation='"+location+"'");
		
		System.out.println(" Query executed "+query);
		return query.getResultList();
		
	}

}
