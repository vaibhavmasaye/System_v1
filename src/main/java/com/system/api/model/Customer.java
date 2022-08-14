package com.system.api.model;

import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "customer")
public class Customer {
	
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id ;
	
	@Column(name = "company_email")
	private String company_email;
	
	
	@Column(name = "company_name")
	private String company_name;
	
	@OneToMany(mappedBy = "customer")
	@Fetch(FetchMode.SUBSELECT)
	@JsonIgnore
	private Collection<AccountManagers>  account_managers;  
	
	@OneToMany(mappedBy = "customer")
	@Fetch(FetchMode.SUBSELECT)
	@JsonIgnore
	private Collection<ProjectManagers> project_managers;
	
	@OneToMany(mappedBy = "customer")
	@Fetch(FetchMode.SUBSELECT)
	@JsonIgnore
	private Collection<SupplyManagers> supply_managers;

	public Customer(Integer id, String company_email, String company_name, Collection<AccountManagers> account_managers,
			Collection<ProjectManagers> project_managers, Collection<SupplyManagers> supply_managers) {
		super();
		this.id = id;
		this.company_email = company_email;
		this.company_name = company_name;
		this.account_managers = account_managers;
		this.project_managers = project_managers;
		this.supply_managers = supply_managers;
	}

	public Customer(String company_email, String company_name, Collection<AccountManagers> account_managers,
			Collection<ProjectManagers> project_managers, Collection<SupplyManagers> supply_managers) {
		super();
		this.company_email = company_email;
		this.company_name = company_name;
		this.account_managers = account_managers;
		this.project_managers = project_managers;
		this.supply_managers = supply_managers;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", company_email=" + company_email + ", company_name=" + company_name
				+ ", account_managers=" + account_managers + ", project_managers=" + project_managers
				+ ", supply_managers=" + supply_managers + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompany_email() {
		return company_email;
	}

	public void setCompany_email(String company_email) {
		this.company_email = company_email;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public Collection<AccountManagers> getAccount_managers() {
		return account_managers;
	}

	public void setAccount_managers(Collection<AccountManagers> account_managers) {
		this.account_managers = account_managers;
	}

	public Collection<ProjectManagers> getProject_managers() {
		return project_managers;
	}

	public void setProject_managers(Collection<ProjectManagers> project_managers) {
		this.project_managers = project_managers;
	}

	public Collection<SupplyManagers> getSupply_managers() {
		return supply_managers;
	}

	public void setSupply_managers(Collection<SupplyManagers> supply_managers) {
		this.supply_managers = supply_managers;
	}

	


}
