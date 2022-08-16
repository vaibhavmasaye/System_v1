package com.system.api.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "company_details")
public class CompanyDetails {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@Column(name = "company_employee_size")
	private String company_employee_size;
	
	@Column(name = "company_name")
	private String company_name;

	@Column(name = "company_registred_number")
	private String company_registred_number;

	@CreationTimestamp
	@Basic(optional = false)
	@Column(name = "company_start_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime company_start_date;



	public CompanyDetails() {
		super();
	}



	public CompanyDetails(String company_employee_size, String company_name, String company_registred_number,
			LocalDateTime company_start_date) {
		super();
		this.company_employee_size = company_employee_size;
		this.company_name = company_name;
		this.company_registred_number = company_registred_number;
		this.company_start_date = company_start_date;
	}



	public CompanyDetails(Integer id, Customer customer, String company_employee_size, String company_name,
			String company_registred_number, LocalDateTime company_start_date) {
		super();
		this.id = id;
		this.customer = customer;
		this.company_employee_size = company_employee_size;
		this.company_name = company_name;
		this.company_registred_number = company_registred_number;
		this.company_start_date = company_start_date;
	}



	@Override
	public String toString() {
		return "CompanyDetails [id=" + id + ", customer=" + customer + ", company_employee_size="
				+ company_employee_size + ", company_name=" + company_name + ", company_registred_number="
				+ company_registred_number + ", company_start_date=" + company_start_date + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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



	public String getCompany_employee_size() {
		return company_employee_size;
	}



	public void setCompany_employee_size(String company_employee_size) {
		this.company_employee_size = company_employee_size;
	}



	public String getCompany_name() {
		return company_name;
	}



	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}



	public String getCompany_registred_number() {
		return company_registred_number;
	}



	public void setCompany_registred_number(String company_registred_number) {
		this.company_registred_number = company_registred_number;
	}



	public LocalDateTime getCompany_start_date() {
		return company_start_date;
	}



	public void setCompany_start_date(LocalDateTime company_start_date) {
		this.company_start_date = company_start_date;
	}

	





	
}
