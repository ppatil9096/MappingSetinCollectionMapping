package com.pravin.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

    public static void main(String[] args) {
	Session session = new Configuration().configure()
		.buildSessionFactory()
		.openSession();
	Transaction transaction = session.beginTransaction();
	Set<String> set = new HashSet<>();
	set.add("Ajay");
	set.add("Sagar");
	Set<String> set2 = new HashSet<>();
	set2.add("Sunil");
	set2.add("Baban");

	Question question = new Question();
	question.setQuestion("Who is your friend?");
	question.setAnswers(set);

	Question question2 = new Question();
	question2.setQuestion("Who is your best friend?");
	question2.setAnswers(set2);

	session.persist(question);
	session.persist(question2);
	transaction.commit();
	session.close();
	System.out.println("Success!");

    }

}
