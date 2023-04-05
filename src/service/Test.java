package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import domaine.Employe;
import domaine.Etudiant;

public class Test {

	public static void main(String[] args) {

		SessionFactory sessionf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = sessionf.openSession();
		session.beginTransaction();

		System.out.println("Donnnnnne");

		// Create etudiant
		Etudiant e1 = new Etudiant();
		e1.setId(1);
		e1.setNom("et1");
		e1.setFiliere("GL1");

		session.save(e1);

		// Create employe
		Employe emp1 = new Employe();
		emp1.setId(1);
		emp1.setNom("et1");
		emp1.setSalaire(500);

		session.save(emp1);
		
		session.getTransaction().commit();


		// Read by id:
		Etudiant e0 = (Etudiant) session.get(Etudiant.class, 1);
		System.out.println("Etudiant 1: " + e0.getNom());

		session.getTransaction().commit();

	}
}
