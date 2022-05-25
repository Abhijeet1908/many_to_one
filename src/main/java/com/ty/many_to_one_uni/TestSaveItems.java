package com.ty.many_to_one_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveItems {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		AmazonOrder amazonOrder = new AmazonOrder();
		amazonOrder.setName("Gaming set");
		amazonOrder.setAddress("Entel Motors");
		amazonOrder.setStatus("Dispached");
		
		
		Item item1 = new Item();
		item1.setName("44 inch Amoled display");
		item1.setPrice(45000);
		item1.setQuantity(3);
		item1.setAmazonOrder(amazonOrder);
		
		Item item2 = new Item();
		item2.setName("Nvidia RTX 3090");
		item2.setPrice(50000);
		item2.setQuantity(4);
		item2.setAmazonOrder(amazonOrder);
		
		Item item3 = new Item();
		item3.setName("32 GB ram stick");
		item3.setPrice(20000);
		item3.setQuantity(4);
		item3.setAmazonOrder(amazonOrder);
		
		entityTransaction.begin();
		
		entityManager.persist(amazonOrder);
		entityManager.persist(item1);
		entityManager.persist(item2);
		entityManager.persist(item3);
		
		entityTransaction.commit();
		
		System.out.println("Order placed sucessfully");
	}

}
