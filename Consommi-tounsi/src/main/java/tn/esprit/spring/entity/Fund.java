package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Fund implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_fund;
	private double amount;
	public int getId_fund() {
		return id_fund;
	}
	public void setId_fund(int id_fund) {
		this.id_fund = id_fund;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@ManyToOne
	private Client client;
	public Fund() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fund(int id_fund, float amount) {
		super();
		this.id_fund = id_fund;
		this.amount = amount;
	}
	
	
}
