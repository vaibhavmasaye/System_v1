package com.system.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "your_details")
public class YourDetails {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@Column(name = "job_function")
	private String job_function;
	
	@Column(name = "official_email_address")
	private String official_email_address;

	@Column(name = "your_job_title")
	private String your_job_title;

	public YourDetails(Integer id, Customer customer, String job_function, String official_email_address,
			String your_job_title) {
		super();
		this.id = id;
		this.customer = customer;
		this.job_function = job_function;
		this.official_email_address = official_email_address;
		this.your_job_title = your_job_title;
	}

	public YourDetails(String job_function, String official_email_address, String your_job_title) {
		super();
		this.job_function = job_function;
		this.official_email_address = official_email_address;
		this.your_job_title = your_job_title;
	}

	public YourDetails() {
		super();
	}

	@Override
	public String toString() {
		return "YourDetails [id=" + id + ", customer=" + customer + ", job_function=" + job_function
				+ ", official_email_address=" + official_email_address + ", your_job_title=" + your_job_title
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getJob_function() {
		return job_function;
	}

	public void setJob_function(String job_function) {
		this.job_function = job_function;
	}

	public String getOfficial_email_address() {
		return official_email_address;
	}

	public void setOfficial_email_address(String official_email_address) {
		this.official_email_address = official_email_address;
	}

	public String getYour_job_title() {
		return your_job_title;
	}

	public void setYour_job_title(String your_job_title) {
		this.your_job_title = your_job_title;
	}

	
	

	
	

}
