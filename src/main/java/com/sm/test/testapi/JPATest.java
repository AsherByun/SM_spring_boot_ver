package com.sm.test.testapi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sm.test.vo.User;

public class JPATest {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SM_springboot");
		EntityManager em = emf.createEntityManager();
		try {
			User user = new User();
			user.setName("변성재");
			user.setAge(27);
			user.setId("dfdo333");
			
			em.persist(user);
		} catch (Exception e) {
	
		}finally {
			em.close();
			emf.close();
		}
		
	}

}
