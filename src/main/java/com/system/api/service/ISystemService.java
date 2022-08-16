package com.system.api.service;

import java.util.List;

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
	
//	BusinessContact
	public BusinessContact AddBusinessContact(BusinessContact business_contact, Integer customer_id);
	public List<BusinessContact> getBusinessContactbyid(Integer customer_id);

	public void UpdateBusinessContactbyUid(Integer id, String email, String name,String phone);
	
	public void deleteBusinessContact(int id);
	
	
//	CompanyDetails
	public CompanyDetails AddCompanyDetails(CompanyDetails company_details, Integer customer_id);
	public List<CompanyDetails> getCompanyDetailsbyid(Integer customer_id);

	public void UpdateCompanyDetailsbyUid(Integer id, String company_employee_size, String company_name,String company_registred_number);
	
	public void deleteCompanyDetails(int id);
	
	
//	FinanceDetails
	public FinanceDetails AddFinanceDetails(FinanceDetails finance_details, Integer customer_id);
	public List<FinanceDetails> getFinanceDetailsbyid(Integer customer_id);

	public void UpdateFinanceDetailsbyUid(Integer id, String account_number, String bank_name,String contact_person_name, String ifsc);
	
	public void deleteFinanceDetails(int id);
	
	
//	SalesAccount
	public SalesAccount AddSalesAccount(SalesAccount sales_account, Integer customer_id);
	public List<SalesAccount> getSalesAccountbyid(Integer customer_id);

	public void UpdateSalesAccountbyUid(Integer id, String email, String name,String phone);
	
	public void deleteSalesAccount(int id);
	
//	YourDetails
	public YourDetails AddYourDetails(YourDetails your_details, Integer customer_id);
	public List<YourDetails> getYourDetailsbyid(Integer customer_id);

	public void UpdateYourDetailsbyUid(Integer id, String job_function, String official_email_address,String your_job_title);
	
	public void deleteYourDetails(int id);
	
	
}
