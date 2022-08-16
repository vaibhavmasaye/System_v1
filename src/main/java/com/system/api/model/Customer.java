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
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;
	
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
	
	@OneToMany(mappedBy = "customer")
	@Fetch(FetchMode.SUBSELECT)
	@JsonIgnore
	private Collection<BusinessContact> business_contact;

	@OneToMany(mappedBy = "customer")
	@Fetch(FetchMode.SUBSELECT)
	@JsonIgnore
	private Collection<CompanyDetails> company_details;
	
	@OneToMany(mappedBy = "customer")
	@Fetch(FetchMode.SUBSELECT)
	@JsonIgnore
	private Collection<Country> country;
	
	
	@OneToMany(mappedBy = "customer")
	@Fetch(FetchMode.SUBSELECT)
	@JsonIgnore
	private Collection<FinanceDetails> finance_details;

	
	@OneToMany(mappedBy = "customer")
	@Fetch(FetchMode.SUBSELECT)
	@JsonIgnore
	private Collection<SalesAccount> sales_account;
	

	@OneToMany(mappedBy = "customer")
	@Fetch(FetchMode.SUBSELECT)
	@JsonIgnore
	private Collection<YourDetails> your_details;

	




	public Customer() {
		super();
	}

	

	
	



	public Customer(Integer id, String first_name, String last_name, String company_email, String company_name,
			Collection<AccountManagers> account_managers, Collection<ProjectManagers> project_managers,
			Collection<SupplyManagers> supply_managers, Collection<BusinessContact> business_contact,
			Collection<CompanyDetails> company_details, Collection<Country> country,
			Collection<FinanceDetails> finance_details, Collection<SalesAccount> sales_account,
			Collection<YourDetails> your_details) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.company_email = company_email;
		this.company_name = company_name;
		this.account_managers = account_managers;
		this.project_managers = project_managers;
		this.supply_managers = supply_managers;
		this.business_contact = business_contact;
		this.company_details = company_details;
		this.country = country;
		this.finance_details = finance_details;
		this.sales_account = sales_account;
		this.your_details = your_details;
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

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Collection<BusinessContact> getBusiness_contact() {
		return business_contact;
	}

	public void setBusiness_contact(Collection<BusinessContact> business_contact) {
		this.business_contact = business_contact;
	}





	public Collection<CompanyDetails> getCompany_details() {
		return company_details;
	}





	public void setCompany_details(Collection<CompanyDetails> company_details) {
		this.company_details = company_details;
	}





	public Collection<Country> getCountry() {
		return country;
	}





	public void setCountry(Collection<Country> country) {
		this.country = country;
	}





	public Collection<FinanceDetails> getFinance_details() {
		return finance_details;
	}





	public void setFinance_details(Collection<FinanceDetails> finance_details) {
		this.finance_details = finance_details;
	}





	public Collection<SalesAccount> getSales_account() {
		return sales_account;
	}





	public void setSales_account(Collection<SalesAccount> sales_account) {
		this.sales_account = sales_account;
	}








	public Collection<YourDetails> getYour_details() {
		return your_details;
	}








	public void setYour_details(Collection<YourDetails> your_details) {
		this.your_details = your_details;
	}








	@Override
	public String toString() {
		return "Customer [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", company_email="
				+ company_email + ", company_name=" + company_name + ", account_managers=" + account_managers
				+ ", project_managers=" + project_managers + ", supply_managers=" + supply_managers
				+ ", business_contact=" + business_contact + ", company_details=" + company_details + ", country="
				+ country + ", finance_details=" + finance_details + ", sales_account=" + sales_account
				+ ", your_details=" + your_details + ", getId()=" + getId() + ", getCompany_email()="
				+ getCompany_email() + ", getCompany_name()=" + getCompany_name() + ", getAccount_managers()="
				+ getAccount_managers() + ", getProject_managers()=" + getProject_managers() + ", getSupply_managers()="
				+ getSupply_managers() + ", getFirst_name()=" + getFirst_name() + ", getLast_name()=" + getLast_name()
				+ ", getBusiness_contact()=" + getBusiness_contact() + ", getCompany_details()=" + getCompany_details()
				+ ", getCountry()=" + getCountry() + ", getFinance_details()=" + getFinance_details()
				+ ", getSales_account()=" + getSales_account() + ", getYour_details()=" + getYour_details()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	


}
