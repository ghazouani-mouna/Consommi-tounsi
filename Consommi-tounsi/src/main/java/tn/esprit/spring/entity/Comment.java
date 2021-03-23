package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_comment;
	private String text_comment;
	@ManyToOne
	private Client client;
	
	@ManyToOne
	private SubjectForum subjectforum;
	
	public Comment(int id_comment, String text_comment) {
		super();
		this.id_comment = id_comment;
		this.text_comment = text_comment;
		
	}
	
	public Comment(int id_comment, String text_comment,SubjectForum subjectforum) {
		super();
		this.id_comment = id_comment;
		this.text_comment = text_comment;
		this.subjectforum = subjectforum;
	}
	
	public Comment(int id_comment, String text_comment, Client client) {
		super();
		this.id_comment = id_comment;
		this.text_comment = text_comment;
		this.client = client;
		
	}

	
	
	public Comment(int id_comment, String text_comment, Client client, SubjectForum subjectforum) {
		super();
		this.id_comment = id_comment;
		this.text_comment = text_comment;
		this.client = client;
		this.subjectforum = subjectforum;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_comment() {
		return id_comment;
	}
	public void setId_comment(int id_comment) {
		this.id_comment = id_comment;
	}
	public String getText_comment() {
		return text_comment;
	}
	public void setText_comment(String text_comment) {
		this.text_comment = text_comment;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public SubjectForum getSubjectforum() {
		return subjectforum;
	}
	public void setSubjectforum(SubjectForum subjectforum) {
		this.subjectforum = subjectforum;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
