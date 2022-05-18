package com.example.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int rollNo;
	private String name;
	private String email;
	private String feedback;
	
	public Feedback(int id, int rollNo, String name, String email, String feedback) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
		this.feedback = feedback;
	}
	
	
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", rollNo=" + rollNo + ", name=" + name + ", email=" + email + ", feedback="
				+ feedback + "]";
	}
	
	
	
}
