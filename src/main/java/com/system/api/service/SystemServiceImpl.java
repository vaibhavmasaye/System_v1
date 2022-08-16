package com.system.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
import com.system.api.repository.AccountManagersRepository;
import com.system.api.repository.BusinessContactRepository;
import com.system.api.repository.ClientRepository;
import com.system.api.repository.CompanyDetailsRepository;
import com.system.api.repository.CustomerRepository;
import com.system.api.repository.EmailRepository;
import com.system.api.repository.FinanceDetailsRepository;
import com.system.api.repository.ProjectManagersRepository;
import com.system.api.repository.SalesAccountRepository;
import com.system.api.repository.SupplyManagersRepository;
import com.system.api.repository.YourDetailsRepository;

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

//	BusinessContact
	@Autowired
	BusinessContactRepository businesscontactrepository;
	
	@Override
	public BusinessContact AddBusinessContact(BusinessContact business_contact, Integer customer_id) {
		// TODO Auto-generated method stub
		business_contact = new BusinessContact(business_contact.getEmail(), business_contact.getName(),
				business_contact.getPhone());
		Customer customer = customerrepository.findById(customer_id).get();
		business_contact.setCustomer(customer);
		return businesscontactrepository.save(business_contact);
	}

	@Override
	public List<BusinessContact> getBusinessContactbyid(Integer customer_id) {
		// TODO Auto-generated method stub
		return customerrepository.getBusinessContactbyid(customer_id);
	}

	@Override
	public void UpdateBusinessContactbyUid(Integer id, String email, String name, String phone) {
		// TODO Auto-generated method stub
		customerrepository.UpdateBusinessContactbyUid(id,email,name,phone);
	}

	@Override
	public void deleteBusinessContact(int id) {
		// TODO Auto-generated method stub
		businesscontactrepository.deleteById(id);
	}

	
//	CompanyDetails
	@Autowired
	CompanyDetailsRepository companydetailsrepository;
	
	@Override
	public CompanyDetails AddCompanyDetails(CompanyDetails company_details, Integer customer_id) {
		// TODO Auto-generated method stub
		company_details = new CompanyDetails(company_details.getCompany_employee_size(), company_details.getCompany_name(),
				company_details.getCompany_registred_number(),company_details.getCompany_start_date());
		Customer customer = customerrepository.findById(customer_id).get();
		company_details.setCustomer(customer);
		return companydetailsrepository.save(company_details);
	}

	@Override
	public List<CompanyDetails> getCompanyDetailsbyid(Integer customer_id) {
		// TODO Auto-generated method stub
		return customerrepository.getCompanyDetailsbyid(customer_id);
	}

	@Override
	public void UpdateCompanyDetailsbyUid(Integer id, String company_employee_size, String company_name, String company_registred_number) {
		// TODO Auto-generated method stub
		customerrepository.UpdateCompanyDetailsbyUid(id,company_employee_size,company_name,company_registred_number);
	}

	@Override
	public void deleteCompanyDetails(int id) {
		// TODO Auto-generated method stub
		companydetailsrepository.deleteById(id);
	}
	
	
//	FinanceDetails
	@Autowired
	FinanceDetailsRepository financedetailsrepository;
	
	
	@Override
	public FinanceDetails AddFinanceDetails(FinanceDetails finance_details, Integer customer_id) {
		// TODO Auto-generated method stub
		finance_details = new FinanceDetails(finance_details.getaccount_number(), finance_details.getBank_name(),
				finance_details.getContact_person_name(),finance_details.getIfsc());
		Customer customer = customerrepository.findById(customer_id).get();
		finance_details.setCustomer(customer);
		return financedetailsrepository.save(finance_details);
	}

	@Override
	public List<FinanceDetails> getFinanceDetailsbyid(Integer customer_id) {
		// TODO Auto-generated method stub
		return customerrepository.getFinanceDetailsbyid(customer_id);
	}

	@Override
	public void UpdateFinanceDetailsbyUid(Integer id, String account_number, String bank_name,
			String contact_person_name,String ifsc) {
		// TODO Auto-generated method stub
		customerrepository.UpdateFinanceDetailsbyUid(id,account_number,bank_name,contact_person_name,ifsc);
	}

	@Override
	public void deleteFinanceDetails(int id) {
		// TODO Auto-generated method stub
		financedetailsrepository.deleteById(id);
	}

//	SalesAccount
	@Autowired
	SalesAccountRepository salesaccountrepository;
	
	@Override
	public SalesAccount AddSalesAccount(SalesAccount sales_account, Integer customer_id) {
		// TODO Auto-generated method stub
		sales_account = new SalesAccount(sales_account.getEmail(), sales_account.getName(),
				sales_account.getPhone());
		Customer customer = customerrepository.findById(customer_id).get();
		sales_account.setCustomer(customer);
		return salesaccountrepository.save(sales_account);
	}

	@Override
	public List<SalesAccount> getSalesAccountbyid(Integer customer_id) {
		// TODO Auto-generated method stub
		return customerrepository.getSalesAccountbyid(customer_id);
	}

	@Override
	public void UpdateSalesAccountbyUid(Integer id, String email, String name, String phone) {
		// TODO Auto-generated method stub
		customerrepository.UpdateSalesAccountbyUid(id,email,name,phone);
	}

	@Override
	public void deleteSalesAccount(int id) {
		// TODO Auto-generated method stub
		salesaccountrepository.deleteById(id);
	}

	
//	YourDetails 
	@Autowired
	YourDetailsRepository yourdetailsrepository;
	@Override
	public YourDetails AddYourDetails(YourDetails your_details, Integer customer_id) {
		// TODO Auto-generated method stub
		your_details = new YourDetails(your_details.getJob_function(), your_details.getOfficial_email_address(),
				your_details.getYour_job_title());
		Customer customer = customerrepository.findById(customer_id).get();
		your_details.setCustomer(customer);
		return yourdetailsrepository.save(your_details);
	}

	@Override
	public List<YourDetails> getYourDetailsbyid(Integer customer_id) {
		// TODO Auto-generated method stub
		return customerrepository.getYourDetailsbyid(customer_id);
	}

	@Override
	public void UpdateYourDetailsbyUid(Integer id, String job_function, String official_email_address,String your_job_title) {
		// TODO Auto-generated method stub
		customerrepository.UpdateYourDetailsbyUid(id,job_function,official_email_address,your_job_title);
	}

	@Override
	public void deleteYourDetails(int id) {
		// TODO Auto-generated method stub
		yourdetailsrepository.deleteById(id);
	}
	

	
	
}
