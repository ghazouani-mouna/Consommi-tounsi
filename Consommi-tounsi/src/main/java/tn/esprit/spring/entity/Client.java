package tn.esprit.spring.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Client extends User  {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_user;
	
	
	
	@ManyToMany(mappedBy="listclient")
	private List<Event> listevent;
	
	@OneToMany(mappedBy="client")
	private List<Comment> comment;

	//@OneToMany(mappedBy="client")
	//List<Order> order;
    
	@ManyToMany(mappedBy="listclient")
	private List<SubjectForum> listsubjectforum;
	private String address;
	private String city;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

}
