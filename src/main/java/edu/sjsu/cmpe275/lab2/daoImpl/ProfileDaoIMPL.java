package edu.sjsu.cmpe275.lab2.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.TransactionManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import edu.sjsu.cmpe275.lab2.dao.ProfileDao;
import edu.sjsu.cmpe275.lab2.model.Profile;

@Repository
public class ProfileDaoIMPL implements ProfileDao
{
	@Autowired
	public EntityManagerFactory entityManagerFactory;
	
	@Autowired
	public JpaTransactionManager txm;
	
	@Override
	public void add(Profile prof)
	{
		System.out.println(entityManagerFactory);
		System.out.println(prof);
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println(prof);
		entityManager.joinTransaction();
		entityManager.persist(prof);
		//entityManager.flush();
		//entityManager.close();
	}
}
