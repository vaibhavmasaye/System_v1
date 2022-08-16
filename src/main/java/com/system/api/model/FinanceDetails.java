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
@Table(name = "finance_details")
public class FinanceDetails {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@Column(name = "account_number")
	private String account_number;
;
	
	@Column(name = "bank_name")
	private String bank_name;
	
	@Column(name = "contact_person_name")
	private String contact_person_name;
	
	@Column(name = "ifsc")
	private String ifsc;

	public FinanceDetails(String account_number, String bank_name, String contact_person_name, String ifsc) {
		super();
		this.account_number = account_number;
		this.bank_name = bank_name;
		this.contact_person_name = contact_person_name;
		this.ifsc = ifsc;
	}

	public FinanceDetails(Integer id, Customer customer, String account_number, String bank_name,
			String contact_person_name, String ifsc) {
		super();
		this.id = id;
		this.customer = customer;
		this.account_number = account_number;
		this.bank_name = bank_name;
		this.contact_person_name = contact_person_name;
		this.ifsc = ifsc;
	}

	public FinanceDetails() {
		super();
	}

	@Override
	public String toString() {
		return "FinanceDetails [id=" + id + ", customer=" + customer + ", account_number=" + account_number
				+ ", bank_name=" + bank_name + ", contact_person_name=" + contact_person_name + ", ifsc=" + ifsc
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

	public String getaccount_number() {
		return account_number;
	}

	public void setaccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getContact_person_name() {
		return contact_person_name;
	}

	public void setContact_person_name(String contact_person_name) {
		this.contact_person_name = contact_person_name;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
	
	
	
}
