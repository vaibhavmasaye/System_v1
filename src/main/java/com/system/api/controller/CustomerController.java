package com.system.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.system.api.model.AccountManagers;
import com.system.api.model.BusinessContact;
import com.system.api.model.ClientCode;
import com.system.api.model.CompanyDetails;
import com.system.api.model.Customer;
import com.system.api.model.FinanceDetails;
import com.system.api.model.ProjectManagers;
import com.system.api.model.SalesAccount;
import com.system.api.model.SupplyManagers;
import com.system.api.model.YourDetails;
import com.system.api.payload.ServerResponse;
import com.system.api.service.SystemServiceImpl;

@RestController
@RequestMapping(value = "/system")
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerController {
	
	@Autowired
	SystemServiceImpl systemservice;
	
//	Customer
	@PostMapping(value = "/AddCustomer")
	public ServerResponse AddCustomer(@RequestBody Customer customer) {

		Customer dbFile = systemservice.AddCustomer(customer);
		return new ServerResponse(dbFile.getId(), customer.getCompany_name());
	}

	@GetMapping(value = "/getCustomerbyUid/{id}") // pathvariable
	public List<Customer> getCustomerbyUid(@PathVariable("id") Integer id) {
		// System.out.println(prodName);
		return systemservice.getCustomerbyUid(id);
	}

	@PostMapping(value = "/UpdateCustomerbyUid")
	public void UpdateCustomerbyUid(@RequestParam("id") Integer id,
			@RequestParam("company_email")String company_email, 
			@RequestParam("company_name")String company_name) {
		systemservice.UpdateCustomerbyUid(id,company_email,company_name);
	}

	@DeleteMapping("/deleteCustomer/{id}")
	public void deleteCustomer(@PathVariable("id") int id) {
		systemservice.deleteCustomer(id);
	}
	
//	AccountManagers
	@PostMapping(value = "/AddAccountManagers/{customer_id}")
	public ServerResponse AddAccountManagers(@RequestBody AccountManagers account_managers,@PathVariable("customer_id") Integer customer_id) {

		AccountManagers dbFile = systemservice.AddAccountManagers(account_managers, customer_id);
		return new ServerResponse(dbFile.getId(), account_managers.getEmail());
	}

	@GetMapping(value = "/getAccountManagersbyid/{customer_id}") // pathvariable
	public List<AccountManagers> getAccountManagersbyid(@PathVariable("customer_id") Integer customer_id) {
		// System.out.println(prodName);
		return systemservice.getAccountManagersbyid(customer_id);
	}

	@PostMapping(value = "/UpdateAccountManagersbyUid")
	public void UpdateAccountManagersbyUid(@RequestParam("id") Integer id,
			@RequestParam("email")String email, 
			@RequestParam("name")String name, 
			@RequestParam("phone")String phone
			) {
		systemservice.UpdateAccountManagersbyUid(id,email,name,phone);
	}

	@DeleteMapping("/deleteAccountManagers/{id}")
	public void deleteAccountManagers(@PathVariable("id") int id) {
		systemservice.deleteAccountManagers(id);
	}
	
//	ProjectManagers
	@PostMapping(value = "/AddProjectManagers/{customer_id}")
	public ServerResponse AddProjectManagers(@RequestBody ProjectManagers project_managers,@PathVariable("customer_id") Integer customer_id) {

		ProjectManagers dbFile = systemservice.AddProjectManagers(project_managers, customer_id);
		return new ServerResponse(dbFile.getId(), project_managers.getEmail());
	}

	@GetMapping(value = "/getProjectManagersbyid/{customer_id}") // pathvariable
	public List<ProjectManagers> getProjectManagersbyid(@PathVariable("customer_id") Integer customer_id) {
		// System.out.println(prodName);
		return systemservice.getProjectManagersbyid(customer_id);
	}

	@PostMapping(value = "/UpdateProjectManagersbyUid")
	public void UpdateProjectManagersbyUid(@RequestParam("id") Integer id,
			@RequestParam("email")String email, 
			@RequestParam("name")String name, 
			@RequestParam("phone")String phone
			) {
		systemservice.UpdateProjectManagersbyUid(id,email,name,phone);
	}

	@DeleteMapping("/deleteProjectManagers/{id}")
	public void deleteProjectManagers(@PathVariable("id") int id) {
		systemservice.deleteProjectManagers(id);
	}
	
//	SupplyManagers
	@PostMapping(value = "/AddSupplyManagers/{customer_id}")
	public ServerResponse AddSupplyManagers(@RequestBody SupplyManagers supply_managers,@PathVariable("customer_id") Integer customer_id) {

		SupplyManagers dbFile = systemservice.AddSupplyManagers(supply_managers, customer_id);
		return new ServerResponse(dbFile.getId(), supply_managers.getEmail());
	}

	@GetMapping(value = "/getSupplyManagersbyid/{customer_id}") // pathvariable
	public List<SupplyManagers> getSupplyManagersbyid(@PathVariable("customer_id") Integer customer_id) {
		// System.out.println(prodName);
		return systemservice.getSupplyManagersbyid(customer_id);
	}

	@PostMapping(value = "/UpdateSupplyManagersbyUid")
	public void UpdateSupplyManagersbyUid(@RequestParam("id") Integer id,
			@RequestParam("email")String email, 
			@RequestParam("name")String name, 
			@RequestParam("phone")String phone
			) {
		systemservice.UpdateSupplyManagersbyUid(id,email,name,phone);
	}

	@DeleteMapping("/deleteSupplyManagers/{id}")
	public void deleteSupplyManagers(@PathVariable("id") int id) {
		systemservice.deleteSupplyManagers(id);
	}

	
//	BusinessContact
	@PostMapping(value = "/AddBusinessContact/{customer_id}")
	public ServerResponse AddBusinessContact(@RequestBody BusinessContact business_contact,@PathVariable("customer_id") Integer customer_id) {

		BusinessContact dbFile = systemservice.AddBusinessContact(business_contact, customer_id);
		return new ServerResponse(dbFile.getId(), business_contact.getEmail());
	}

	@GetMapping(value = "/getBusinessContactbyid/{customer_id}") // pathvariable
	public List<BusinessContact> getBusinessContactbyid(@PathVariable("customer_id") Integer customer_id) {
		// System.out.println(prodName);
		return systemservice.getBusinessContactbyid(customer_id);
	}

	@PostMapping(value = "/UpdateBusinessContactbyUid")
	public void UpdateBusinessContactbyUid(@RequestParam("id") Integer id,
			@RequestParam("email")String email, 
			@RequestParam("name")String name, 
			@RequestParam("phone")String phone
			) {
		systemservice.UpdateBusinessContactbyUid(id,email,name,phone);
	}

	@DeleteMapping("/deleteBusinessContact/{id}")
	public void deleteBusinessContact(@PathVariable("id") int id) {
		systemservice.deleteBusinessContact(id);
	}

//	CompanyDetails
	
	@PostMapping(value = "/AddCompanyDetails/{customer_id}")
	public ServerResponse AddCompanyDetails(@RequestBody CompanyDetails company_details,@PathVariable("customer_id") Integer customer_id) {

		CompanyDetails dbFile = systemservice.AddCompanyDetails(company_details, customer_id);
		return new ServerResponse(dbFile.getId(), company_details.getCompany_name());
	}

	@GetMapping(value = "/getCompanyDetailsbyid/{customer_id}") // pathvariable
	public List<CompanyDetails> getCompanyDetailsbyid(@PathVariable("customer_id") Integer customer_id) {
		// System.out.println(prodName);
		return systemservice.getCompanyDetailsbyid(customer_id);
	}

	@PostMapping(value = "/UpdateCompanyDetailsbyUid")
	public void UpdateCompanyDetailsbyUid(@RequestParam("id") Integer id,
			@RequestParam("company_employee_size")String company_employee_size, 
			@RequestParam("company_name")String company_name, 
			@RequestParam("company_registred_number")String company_registred_number
			) {
		systemservice.UpdateBusinessContactbyUid(id,company_employee_size,company_name,company_registred_number);
	}

	@DeleteMapping("/deleteCompanyDetails/{id}")
	public void deleteCompanyDetails(@PathVariable("id") int id) {
		systemservice.deleteCompanyDetails(id);
	}
	
//	FinanceDetails
	
	@PostMapping(value = "/AddFinanceDetails/{customer_id}")
	public ServerResponse AddFinanceDetails(@RequestBody FinanceDetails finance_details,@PathVariable("customer_id") Integer customer_id) {

		FinanceDetails dbFile = systemservice.AddFinanceDetails(finance_details, customer_id);
		return new ServerResponse(dbFile.getId(), finance_details.getBank_name());
	}

	@GetMapping(value = "/getFinanceDetailsbyid/{customer_id}") // pathvariable
	public List<FinanceDetails> getFinanceDetailsbyid(@PathVariable("customer_id") Integer customer_id) {
		// System.out.println(prodName);
		return systemservice.getFinanceDetailsbyid(customer_id);
	}

	@PostMapping(value = "/UpdateFinanceDetailsbyUid")
	public void UpdateFinanceDetailsbyUid(@RequestParam("id") Integer id,
			@RequestParam("account_number")String account_number, 
			@RequestParam("bank_name")String bank_name, 
			@RequestParam("contact_person_name")String contact_person_name,
			@RequestParam("ifsc")String ifsc
			) {
		systemservice.UpdateFinanceDetailsbyUid(id,account_number,bank_name,contact_person_name,ifsc);
	}

	@DeleteMapping("/deleteFinanceDetails/{id}")
	public void deleteFinanceDetails(@PathVariable("id") int id) {
		systemservice.deleteFinanceDetails(id);
	}
	
	
//	SalesAccount
	
	@PostMapping(value = "/AddSalesAccount/{customer_id}")
	public ServerResponse AddSalesAccount(@RequestBody SalesAccount sales_account,@PathVariable("customer_id") Integer customer_id) {

		SalesAccount dbFile = systemservice.AddSalesAccount(sales_account, customer_id);
		return new ServerResponse(dbFile.getId(), sales_account.getEmail());
	}

	@GetMapping(value = "/getSalesAccountbyid/{customer_id}") // pathvariable
	public List<SalesAccount> getSalesAccountbyid(@PathVariable("customer_id") Integer customer_id) {
		// System.out.println(prodName);
		return systemservice.getSalesAccountbyid(customer_id);
	}

	@PostMapping(value = "/UpdateSalesAccountbyUid")
	public void UpdateSalesAccountbyUid(@RequestParam("id") Integer id,
			@RequestParam("email")String email, 
			@RequestParam("name")String name, 
			@RequestParam("phone")String phone
			) {
		systemservice.UpdateSalesAccountbyUid(id,email,name,phone);
	}

	@DeleteMapping("/deleteSalesAccount/{id}")
	public void deleteSalesAccount(@PathVariable("id") int id) {
		systemservice.deleteSalesAccount(id);
	}
	
	
//	YourDetails
	
	@PostMapping(value = "/AddYourDetails/{customer_id}")
	public ServerResponse AddYourDetails(@RequestBody YourDetails your_details,@PathVariable("customer_id") Integer customer_id) {

		YourDetails dbFile = systemservice.AddYourDetails(your_details, customer_id);
		return new ServerResponse(dbFile.getId(), your_details.getOfficial_email_address());
	}

	@GetMapping(value = "/getYourDetailsbyid/{customer_id}") // pathvariable
	public List<YourDetails> getYourDetailsbyid(@PathVariable("customer_id") Integer customer_id) {
		// System.out.println(prodName);
		return systemservice.getYourDetailsbyid(customer_id);
	}

	@PostMapping(value = "/UpdateYourDetailsbyUid")
	public void UpdateYourDetailsbyUid(@RequestParam("id") Integer id,
			@RequestParam("job_function")String job_function, 
			@RequestParam("official_email_address")String official_email_address,
			@RequestParam("your_job_title")String your_job_title
			) {
		systemservice.UpdateYourDetailsbyUid(id,job_function,official_email_address,your_job_title);
	}

	@DeleteMapping("/deleteYourDetails/{id}")
	public void deleteYourDetails(@PathVariable("id") int id) {
		systemservice.deleteYourDetails(id);
	}



}
