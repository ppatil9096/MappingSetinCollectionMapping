package com.pravin.hibernate;

import java.util.Set;

public class Question {
    private int qid;
    private String question;
    private Set<String> answers;

    public int getQid() {
	return qid;
    }

    public void setQid(int qid) {
	this.qid = qid;
    }

    public String getQuestion() {
	return question;
    }

    public void setQuestion(String question) {
	this.question = question;
    }

    public Set<String> getAnswers() {
	return answers;
    }

    public void setAnswers(Set<String> answers) {
	this.answers = answers;
    }

}
