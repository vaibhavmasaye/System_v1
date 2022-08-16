package com.system.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.system.api.model.AccountManagers;
import com.system.api.model.BusinessContact;
import com.system.api.model.CompanyDetails;
import com.system.api.model.Customer;
import com.system.api.model.FinanceDetails;
import com.system.api.model.ProjectManagers;
import com.system.api.model.SalesAccount;
import com.system.api.model.SupplyManagers;
import com.system.api.model.YourDetails;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{

//	AccountManagers
	@Query("SELECT l FROM AccountManagers l WHERE customer_id=:customer_id")
	public List<AccountManagers> getAccountManagersbyid(@Param("customer_id")Integer customer_id);

	@Modifying
	@Query("UPDATE AccountManagers u SET u.email=:email,u.name=:name,u.phone=:phone WHERE u.id=:id")
	public void UpdateAccountManagersbyUid(@Param("id")Integer id, @Param("email")String email,@Param("name") String name,@Param("phone") String phone);

//	ProjectManagers
	@Query("SELECT l FROM ProjectManagers l WHERE customer_id=:customer_id")
	public List<ProjectManagers> getProjectManagersbyid(@Param("customer_id")Integer customer_id);

	@Modifying
	@Query("UPDATE ProjectManagers u SET u.email=:email,u.name=:name,u.phone=:phone WHERE u.id=:id")
	public void UpdateProjectManagersbyUid(@Param("id")Integer id, @Param("email")String email,@Param("name") String name,@Param("phone") String phone);

	
//	SupplyManagers
	@Query("SELECT l FROM SupplyManagers l WHERE customer_id=:customer_id")
	public List<SupplyManagers> getSupplyManagersbyid(@Param("customer_id")Integer customer_id);

	@Modifying
	@Query("UPDATE SupplyManagers u SET u.email=:email,u.name=:name,u.phone=:phone WHERE u.id=:id")
	public void UpdateSupplyManagersbyUid(@Param("id")Integer id, @Param("email")String email,@Param("name") String name,@Param("phone") String phone);

//	BusinessContact
	@Query("SELECT l FROM BusinessContact l WHERE customer_id=:customer_id")
	public List<BusinessContact> getBusinessContactbyid(@Param("customer_id")Integer customer_id);

	@Modifying
	@Query("UPDATE BusinessContact u SET u.email=:email,u.name=:name,u.phone=:phone WHERE u.id=:id")
	public void UpdateBusinessContactbyUid(@Param("id")Integer id, @Param("email")String email,@Param("name") String name,@Param("phone") String phone);

//	CompanyDetails
	
	@Query("SELECT l FROM CompanyDetails l WHERE customer_id=:customer_id")
	public List<CompanyDetails> getCompanyDetailsbyid(@Param("customer_id")Integer customer_id);

	@Modifying
	@Query("UPDATE CompanyDetails u SET u.company_employee_size=:company_employee_size,u.company_name=:company_name,u.company_registred_number=:company_registred_number WHERE u.id=:id")
	public void UpdateCompanyDetailsbyUid(@Param("id")Integer id, @Param("company_employee_size")String company_employee_size,@Param("id") String company_name,
			@Param("company_registred_number")String company_registred_number);

	
//	FinanceDetails
	@Query("SELECT l FROM FinanceDetails l WHERE customer_id=:customer_id")
	public List<FinanceDetails> getFinanceDetailsbyid(Integer customer_id);

	@Modifying
	@Query("UPDATE FinanceDetails u SET u.account_number=:account_number,u.bank_name=:bank_name,u.contact_person_name=:contact_person_name, u.ifsc=:ifsc WHERE u.id=:id")
	public void UpdateFinanceDetailsbyUid(@Param("id")Integer id,@Param("account_number") String account_number,@Param("bank_name") String bank_name,
			@Param("contact_person_name")String contact_person_name, @Param("ifsc")String ifsc);

	
//	SalesAccount
	@Query("SELECT l FROM SalesAccount l WHERE customer_id=:customer_id")
	public List<SalesAccount> getSalesAccountbyid(@Param("customer_id")Integer customer_id);

	
	@Modifying
	@Query("UPDATE SalesAccount u SET u.email=:email,u.name=:name,u.phone=:phone WHERE u.id=:id")
	public void UpdateSalesAccountbyUid(@Param("id")Integer id, @Param("email")String email,@Param("name") String name,@Param("phone") String phone);

//	YourDetails
	@Query("SELECT l FROM YourDetails l WHERE customer_id=:customer_id")
	public List<YourDetails> getYourDetailsbyid(@Param("customer_id")Integer customer_id);

	@Modifying
	@Query("UPDATE YourDetails u SET u.job_function=:job_function,u.job_function=:job_function,u.official_email_address=:official_email_address, u.your_job_title=:your_job_title WHERE u.id=:id")
	public void UpdateYourDetailsbyUid(@Param("id")Integer id,@Param("job_function") String job_function, @Param("official_email_address")String official_email_address,@Param("your_job_title")String your_job_title);
	

	
	

}
