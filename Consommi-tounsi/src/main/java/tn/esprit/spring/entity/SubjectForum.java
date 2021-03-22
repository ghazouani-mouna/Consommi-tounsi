package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class SubjectForum implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_subject;
	private String subject;
	private String title;
	@Temporal(TemporalType.DATE)
	private Date date_subject;
	private int number_LikesSubject;
	
	@OneToMany(mappedBy="subjectforum",cascade=CascadeType.REMOVE)
	private List<Comment> comment;
	
	@OneToMany(mappedBy="subjectforum",cascade=CascadeType.REMOVE)
	private List<RatingSubject> ratingsubject;
	
	@ManyToMany
	private List<Client> listclient;

	public Date getDate_subject() {
		return date_subject;
	}
	public void setDate_subject(Date date_subject) {
		this.date_subject = date_subject;
	}
	public List<Comment> getComment() {
		return comment;
	}
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
	public List<RatingSubject> getRatingsubject() {
		return ratingsubject;
	}
	public void setRatingsubject(List<RatingSubject> ratingsubject) {
		this.ratingsubject = ratingsubject;
	}
	public List<Client> getListclient() {
		return listclient;
	}
	public void setListclient(List<Client> listclient) {
		this.listclient = listclient;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
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
