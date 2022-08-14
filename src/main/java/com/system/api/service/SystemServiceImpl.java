package com.system.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.system.api.model.AccountManagers;
import com.system.api.model.ClientCode;
import com.system.api.model.Customer;
import com.system.api.model.ProjectManagers;
import com.system.api.model.SupplyManagers;
import com.system.api.repository.AccountManagersRepository;
import com.system.api.repository.ClientRepository;
import com.system.api.repository.CustomerRepository;
import com.system.api.repository.EmailRepository;
import com.system.api.repository.ProjectManagersRepository;
import com.system.api.repository.SupplyManagersRepository;

@Service("systemservice")
@Transactional
public class SystemServiceImpl implements ISystemService  {

	@Autowired
	EmailRepository emailrepository;
	
	
	@Autowired
	ClientRepository clientrepository;

//	ClientCode
	@Override
	public ClientCode AddClientCode(ClientCode client_code) {
		// TODO Auto-generated method stub
		return clientrepository.save(client_code);
	}

	@Override
	public List<ClientCode> getuserClientCodebyUid(Integer id) {
		// TODO Auto-generated method stub
		return emailrepository.getuserClientCodebyUid(id);
	}

	@Override
	public void UpdateClientCodebyUid(Integer id, String brief_desc, String expl_desc, String final_session,
			String m_desc, String redirect_to_supplier_state) {
		// TODO Auto-generated method stub
		emailrepository.UpdateClientCodebyUid(id,brief_desc,expl_desc,final_session,m_desc,redirect_to_supplier_state);
	}

	@Override
	public void deleteClientCode(int id) {
		// TODO Auto-generated method stub
		clientrepository.deleteById(id);
	}

//	Customer
	
	@Autowired
	CustomerRepository customerrepository; 
	@Override
	public Customer AddCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerrepository.save(customer);
	}

	@Override
	public List<Customer> getCustomerbyUid(Integer id) {
		// TODO Auto-generated method stub
		return emailrepository.getCustomerbyUid(id);
	}

	@Override
	public void UpdateCustomerbyUid(Integer id, String company_email, String company_name) {
		// TODO Auto-generated method stub
		emailrepository.UpdateCustomerbyUid(id,company_email,company_name);
		
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerrepository.deleteById(id);
	}

//	AccountManagers
	@Autowired
	AccountManagersRepository accountmanagersrepository; 
	@Override
	public AccountManagers AddAccountManagers(AccountManagers account_managers, Integer customer_id) {
		// TODO Auto-generated method stub
		account_managers = new AccountManagers(account_managers.getEmail(), account_managers.getName(),
				account_managers.getPhone());
		Customer customer = customerrepository.findById(customer_id).get();
		account_managers.setCustomer(customer);
		return accountmanagersrepository.save(account_managers);
	}

	@Override
	public List<AccountManagers> getAccountManagersbyid(Integer customer_id) {
		// TODO Auto-generated method stub
		return customerrepository.getAccountManagersbyid(customer_id);
	}

	@Override
	public void UpdateAccountManagersbyUid(Integer id,  String email, String name, String phone) {
		// TODO Auto-generated method stub
		customerrepository.UpdateAccountManagersbyUid(id,email,name,phone);
	}

	@Override
	public void deleteAccountManagers(int id) {
		// TODO Auto-generated method stub
		accountmanagersrepository.deleteById(id);
	}

//	ProjectManagers
	@Autowired
	ProjectManagersRepository projectmanagersrepository; 
	@Override
	public ProjectManagers AddProjectManagers(ProjectManagers project_managers, Integer customer_id) {
		// TODO Auto-generated method stub
		project_managers = new ProjectManagers(project_managers.getEmail(), project_managers.getName(),
				project_managers.getPhone());
		Customer customer = customerrepository.findById(customer_id).get();
		project_managers.setCustomer(customer);
		return projectmanagersrepository.save(project_managers);
	}

	@Override
	public List<ProjectManagers> getProjectManagersbyid(Integer customer_id) {
		// TODO Auto-generated method stub
		return customerrepository.getProjectManagersbyid(customer_id);
	}

	@Override
	public void UpdateProjectManagersbyUid(Integer id, String email, String name, String phone) {
		// TODO Auto-generated method stub
		customerrepository.UpdateProjectManagersbyUid(id,email,name,phone);
	}

	@Override
	public void deleteProjectManagers(int id) {
		// TODO Auto-generated method stub
		projectmanagersrepository.deleteById(id);
	}

//	SupplyManagers
	
	@Autowired
	SupplyManagersRepository supplymanagersrepository;
	@Override
	public SupplyManagers AddSupplyManagers(SupplyManagers supply_managers, Integer customer_id) {
		// TODO Auto-generated method stub
		supply_managers = new SupplyManagers(supply_managers.getEmail(), supply_managers.getName(),
				supply_managers.getPhone());
		Customer customer = customerrepository.findById(customer_id).get();
		supply_managers.setCustomer(customer);
		return supplymanagersrepository.save(supply_managers);
	}

	@Override
	public List<SupplyManagers> getSupplyManagersbyid(Integer customer_id) {
		// TODO Auto-generated method stub
		return customerrepository.getSupplyManagersbyid(customer_id);
	}

	@Override
	public void UpdateSupplyManagersbyUid(Integer id, String email, String name, String phone) {
		// TODO Auto-generated method stub
		customerrepository.UpdateSupplyManagersbyUid(id,email,name,phone);
	}

	@Override
	public void deleteSupplyManagers(int id) {
		// TODO Auto-generated method stub
		supplymanagersrepository.deleteById(id);
	}
	

	
	
}
