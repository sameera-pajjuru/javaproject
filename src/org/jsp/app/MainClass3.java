package org.jsp.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MainClass3
{
   public static void main(String[] args) {
	
	   EntityManagerFactory factory = Persistence.createEntityManagerFactory("NamedQueris");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Query query = manager.createNamedQuery("dl");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the car Name: ");
		String del = scanner.next();
		query.setParameter("xy", del);
		
		System.out.println("deleted");
		query.executeUpdate();
		
		manager.getTransaction().commit();
	}
}

