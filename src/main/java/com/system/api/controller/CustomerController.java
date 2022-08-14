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
import com.system.api.model.ClientCode;
import com.system.api.model.Customer;
import com.system.api.model.ProjectManagers;
import com.system.api.model.SupplyManagers;
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

	
	


}
