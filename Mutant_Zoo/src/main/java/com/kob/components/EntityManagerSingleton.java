package com.kob.components;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class EntityManagerSingleton {
private static EntityManager em;



public static synchronized EntityManager getEntityManager() {
if (em == null) {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("ZooJPA");
em = emf.createEntityManager();
}
return em;
}



private EntityManagerSingleton() {}



}