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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "supply_managers")
public class SupplyManagers {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "name")
	private String name;

	@Column(name = "phone")
	private String phone;

	public SupplyManagers(String email, String name, String phone) {
		super();
		this.email = email;
		this.name = name;
		this.phone = phone;
	}

	public SupplyManagers() {
		super();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "SupplyManagers [id=" + id + ", customer=" + customer + ", email=" + email + ", name=" + name
				+ ", phone=" + phone + ", getId()=" + getId() + ", getCustomer()=" + getCustomer() + ", getEmail()="
				+ getEmail() + ", getName()=" + getName() + ", getPhone()=" + getPhone() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	

}
