package com.ty.many_to_one_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetProduct {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Reviews reviews = entityManager.find(Reviews.class, 1);
		if (reviews != null) {
			System.out.println("User name is "+reviews.getUserName());
			System.out.println("Reviews given "+reviews.getReview());
			Product product = reviews.getProduct();
			System.out.println("Product id is "+product.getId());
			System.out.println("product name "+product.getName());
			System.out.println("Product price "+product.getPrice());
		}
		else {
			System.out.println("No product reviews found");
		}
		
	
		
	}

}
