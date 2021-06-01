package org.jsp.app;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MainClass2 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("NamedQueris");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Query query = manager.createNamedQuery("st");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the student id: ");
		int sc = scanner.nextInt();
		
		query.setParameter("xy", sc);
	   System.out.println("enter the stream: ");
	   String stream = scanner.next();
	   query.setParameter("ss", stream);
	   
			 query.executeUpdate();
		 System.out.println("updated");
		
		manager.getTransaction().commit();
	}
}
