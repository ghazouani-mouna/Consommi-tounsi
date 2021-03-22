package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class RatingSubject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_rating;
	
	@Enumerated(EnumType.STRING)
	private RatingValue rating_value;
	
	@Temporal(TemporalType.DATE)
	private Date date_value;
	
	public int getId_rating() {
		return id_rating;
	}

	public void setId_rating(int id_rating) {
		this.id_rating = id_rating;
	}

	public RatingValue getRating_value() {
		return rating_value;
	}

	public void setRating_value(RatingValue rating_value) {
		this.rating_value = rating_value;
	}

	public Date getDate_value() {
		return date_value;
	}

	public void setDate_value(Date date_value) {
		this.date_value = date_value;
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

	@ManyToOne
	private Client client;
	
	@ManyToOne
	private SubjectForum subjectforum;
	

}
