package com.maven.maventest;

import com.insight.jpaapp.model.User;

/**
 * Hello world!
 *
 */


import jakarta.persistence.EntityManager;

public class App {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();

        // Create (Insert)
        User newUser = new User("John Doe");
        em.getTransaction().begin();
        em.persist(newUser);
        em.getTransaction().commit();
        System.out.println("User Saved: " + newUser);

        // Read (Find)
        User foundUser = em.find(User.class, newUser.getId());
        System.out.println("User Found: " + foundUser);

        // Update
        em.getTransaction().begin();
        foundUser.setName("John Updated");
        em.getTransaction().commit();
        System.out.println("User Updated: " + foundUser);

        // Delete
        em.getTransaction().begin();
        em.remove(foundUser);
        em.getTransaction().commit();
        System.out.println("User Deleted");

        // Close EntityManager
        em.close();
        JPAUtil.close();
    }
}

