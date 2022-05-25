package com.ty.many_to_one_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveHospitalAndBranch {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Hospital hospital = new Hospital();
		hospital.setName("Wellness HealthCare");
		hospital.setWebsite("www.WellnessHealthCare.org");
		
		Branch branch1 = new Branch();
		branch1.setName("Gangtok Branch");
		branch1.setState("Sikkim");
		branch1.setCountry("India");
		branch1.setPhone(32145665);
		branch1.setHospital(hospital);
		
		Branch branch2 = new Branch();
		branch2.setName("Indra Nagar");
		branch2.setState("New Delhi");
		branch2.setCountry("India");
		branch2.setPhone(32145665);
		branch2.setHospital(hospital);
		
		Branch branch3 = new Branch();
		branch3.setName("6th Avenue");
		branch3.setState("New York");
		branch3.setCountry("USA");
		branch3.setPhone(32145665);
		branch3.setHospital(hospital);
		
		entityTransaction.begin();
		
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		
		entityTransaction.commit();
		
		System.out.println("Regestration Sucessfull");
		
	}

}
