package com.maven.maventest;

import com.insight.jpaapp.model.User;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
public class ContainerManagedApp {
	 static EntityManager em = PersistenceManager.getEntityManager();
	 public static  void main(String[] args) {
	    
	        User newUser = new User("SaiKumar");
	        em.getTransaction().begin();
	        em.persist(newUser);
	        em.getTransaction().commit();
	        System.out.println("User Saved: " + newUser );
	        User foundUser1 = em.find(User.class, newUser.getId()); //2 managd state
	        System.out.println("User Found: " + foundUser1);
	       
	    }

}
