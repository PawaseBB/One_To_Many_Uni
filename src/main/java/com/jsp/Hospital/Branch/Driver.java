package com.jsp.Hospital.Branch;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("bhushan");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Hospital hospital= new Hospital();
		hospital.setName("Emergency");
		hospital.setGst_no("HSFDYH65276");
		
		Branch branch1= new Branch();
		branch1.setLocation("Vashi");
		branch1.setName("Emergency-1");
		
		Branch branch2= new Branch();
		branch2.setLocation("Thane");
		branch2.setName("Emergency-2");
		
		Branch branch3= new Branch();
		branch3.setLocation("Panvel");
		branch3.setName("Emergency-3");
		
		List<Branch> branch=new ArrayList<Branch>();
		branch.add(branch1);
		branch.add(branch2);
		branch.add(branch3);
		
		hospital.setBranch(branch);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityTransaction.commit();
		
	}

}
