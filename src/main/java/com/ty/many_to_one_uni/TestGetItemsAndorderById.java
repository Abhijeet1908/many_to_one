package com.ty.many_to_one_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetItemsAndorderById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Item item = entityManager.find(Item.class, 6);
		
		if(item !=null) {
		System.out.println("Item name is "+item.getName());
		System.out.println("Item id is "+item.getId());
		System.out.println("Item price is "+item.getPrice());
		System.out.println("Item quantity is "+item.getQuantity());
		System.out.println("Item Amazon Oreder is "+item.getAmazonOrder());
		
		}
		else 
		{
			System.out.println("No item found");
		}
		
	}

}
