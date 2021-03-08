package tn.esprit.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubjectForum implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_subject;
	private String subject;
	private String title;
	private int number_LikesSubject;
	public int getId_subject() {
		return id_subject;
	}
	public void setId_subject(int id_subject) {
		this.id_subject = id_subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumber_LikesSubject() {
		return number_LikesSubject;
	}
	public void setNumber_LikesSubject(int number_LikesSubject) {
		this.number_LikesSubject = number_LikesSubject;
	}
	public SubjectForum(int id_subject, String subject, String title, int number_LikesSubject) {
		super();
		this.id_subject = id_subject;
		this.subject = subject;
		this.title = title;
		this.number_LikesSubject = number_LikesSubject;
	}
	public SubjectForum() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}