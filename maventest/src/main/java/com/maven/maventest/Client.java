package com.maven.maventest;

import java.util.List;

import com.insight.jpaapp.model.Books;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;



public class Client { //Criteria Example
	public static void main(String[] args) {

	Books book= new Books();
	 EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();

	CriteriaBuilder cb= em.getCriteriaBuilder();
	CriteriaQuery<Books> cq=cb.createQuery(Books.class);  
	Root<Books> stud=cq.from(Books.class);
	// for displaying list of books in ascending order 
	 cq.orderBy(cb.asc(stud.get("title")));  
	
	//for sorting records in descending order of price
  //  cq.orderBy(cb.desc(stud.get("price")));
    
	//book list where price is greater than 500
	//cq.where(cb.greaterThan(stud.get("price"),500));
	
	CriteriaQuery<Books> select = cq.select(stud);  
     TypedQuery<Books> q = em.createQuery(select);  
     List<Books> list = q.getResultList();
     for(Books b: list) {
     System.out.println(b.getTitle()+" "+b.getId()+" "+b.getPrice());
     }
     em.close();
	
		}
	
}

