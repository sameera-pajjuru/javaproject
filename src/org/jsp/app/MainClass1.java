package org.jsp.app;



import java.util.List;
import java.util.Scanner;

import javax.persistence.Cache;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class MainClass1
{

	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("NamedQueris");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Query query = manager.createNamedQuery("rt");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the element id: ");
		int sc = scanner.nextInt();
		
		query.setParameter("xy", sc);
		List<Object[]> list=query.getResultList();
		for(Object[] OBJ:list)
		{
			for(Object o1:OBJ)
		{
			System.out.println(o1);
		}
		
		}
		
		manager.getTransaction().commit();
}
}