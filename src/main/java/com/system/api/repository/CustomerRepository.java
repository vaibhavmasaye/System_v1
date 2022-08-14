package com.system.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.system.api.model.AccountManagers;
import com.system.api.model.Customer;
import com.system.api.model.ProjectManagers;
import com.system.api.model.SupplyManagers;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{

//	AccountManagers
	@Query("SELECT l FROM AccountManagers l WHERE customer_id=:customer_id")
	public List<AccountManagers> getAccountManagersbyid(@Param("customer_id")Integer customer_id);

	@Modifying
	@Query("UPDATE AccountManagers u SET u.email=:email,u.name=:name,u.phone=:phone WHERE u.id=:id")
	public void UpdateAccountManagersbyUid(@Param("id")Integer id, @Param("email")String email,@Param("name") String name,@Param("phone") String phone);

//	ProjectManagers
	@Query("SELECT l FROM ProjectManagers l WHERE customer_id=:customer_id")
	public List<ProjectManagers> getProjectManagersbyid(Integer customer_id);

	@Modifying
	@Query("UPDATE ProjectManagers u SET u.email=:email,u.name=:name,u.phone=:phone WHERE u.id=:id")
	public void UpdateProjectManagersbyUid(Integer id, String email, String name, String phone);

	
//	SupplyManagers
	@Query("SELECT l FROM SupplyManagers l WHERE customer_id=:customer_id")
	public List<SupplyManagers> getSupplyManagersbyid(Integer customer_id);

	@Modifying
	@Query("UPDATE SupplyManagers u SET u.email=:email,u.name=:name,u.phone=:phone WHERE u.id=:id")
	public void UpdateSupplyManagersbyUid(Integer id, String email, String name, String phone);
	

}
