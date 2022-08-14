package com.system.api.service;

import java.util.List;

import com.system.api.model.AccountManagers;
import com.system.api.model.ClientCode;
import com.system.api.model.Customer;
import com.system.api.model.ProjectManagers;
import com.system.api.model.SupplyManagers;


public interface ISystemService {
	
//	Client code 
	public ClientCode AddClientCode(ClientCode client_code);

	public List<ClientCode> getuserClientCodebyUid(Integer id);

	public void UpdateClientCodebyUid(Integer id, String brief_desc, String expl_desc, String final_session,
			String m_desc, String redirect_to_supplier_state);
	public void deleteClientCode(int id);
	
//	Customer 
	public Customer AddCustomer(Customer customer);

	public List<Customer> getCustomerbyUid(Integer id);

	public void UpdateCustomerbyUid(Integer id, String company_email, String company_name);
	
	public void deleteCustomer(int id);
	
//	AccountManagers
	public AccountManagers AddAccountManagers(AccountManagers account_managers, Integer customer_id);
	public List<AccountManagers> getAccountManagersbyid(Integer customer_id);

	public void UpdateAccountManagersbyUid(Integer id, String email, String name,String phone);
	
	public void deleteAccountManagers(int id);
	
//	ProjectManagers
	public ProjectManagers AddProjectManagers(ProjectManagers project_managers, Integer customer_id);
	public List<ProjectManagers> getProjectManagersbyid(Integer customer_id);

	public void UpdateProjectManagersbyUid(Integer id, String email, String name,String phone);
	
	public void deleteProjectManagers(int id);
	
	
//	SupplyManagers
	public SupplyManagers AddSupplyManagers(SupplyManagers supply_managers, Integer customer_id);
	public List<SupplyManagers> getSupplyManagersbyid(Integer customer_id);

	public void UpdateSupplyManagersbyUid(Integer id, String email, String name,String phone);
	
	public void deleteSupplyManagers(int id);
	
	
	
	
}
