package com.maven.maventest;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;

public class PersistenceManager {  // file is to create entityManagerFactory and EntityManager using @PersistenceContext

    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = 
        Persistence.createEntityManagerFactory("EM");

    @PersistenceContext
    private static EntityManager entityManager;

    public static EntityManager getEntityManager() {
        if (entityManager == null || !entityManager.isOpen()) {
            entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        }
        return entityManager;
    }

    public static void close() {
        if (entityManager != null) {
            entityManager.close();
        }
        ENTITY_MANAGER_FACTORY.close();
    }
}