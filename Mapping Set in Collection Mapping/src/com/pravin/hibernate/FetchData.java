package com.pravin.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchData {
    public static void main(String[] args) {
	Session session = new Configuration().configure()
		.buildSessionFactory()
		.openSession();
	Query query = session.createQuery("from Question");
	@SuppressWarnings("unchecked")
	List<Question> questions = query.list();
	questions.forEach(s -> {
	    System.out.println(s.getQuestion());
	    s.getAnswers()
		    .forEach(System.out::println);
	});
	session.close();
    }
}
