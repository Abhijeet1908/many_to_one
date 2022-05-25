package com.ty.many_to_one_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveProduct {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Product product = new Product();
		product.setName("SuperStar");
		product.setPrice(11000);
		product.setDescription("Timeless Classic Leather trainers");

		Reviews reviews = new Reviews();
		reviews.setUserName("Prescilla");
		reviews.setReview(
				"Some of the greatest shoes ever which looks really fresh even though its more than 30 year old design");
		reviews.setProduct(product);

		Reviews reviews1 = new Reviews();
		reviews1.setUserName("Legain");
		reviews1.setReview("Most durable and stylish trainers ever");
		reviews1.setProduct(product);
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityManager.persist(reviews);
		entityManager.persist(reviews1);
		entityTransaction.commit();

	}

}
