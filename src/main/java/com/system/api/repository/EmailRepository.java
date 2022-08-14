package com.system.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.system.api.model.ClientCode;
import com.system.api.model.Customer;
import com.system.api.model.DBFile;


public interface EmailRepository extends JpaRepository<DBFile, Integer> {

//	ClientCode
	@Query("SELECT l FROM ClientCode l WHERE code=:id")
	public List<ClientCode> getuserClientCodebyUid(@Param("id") Integer id);

	@Modifying
	@Query("UPDATE ClientCode u SET u.brief_desc=:brief_desc,u.expl_desc=:expl_desc,u.final_session=:final_session,u.m_desc=:m_desc,u.redirect_to_supplier_state=:redirect_to_supplier_state WHERE u.code=:id")
	public void UpdateClientCodebyUid(@Param("id")Integer id, 
			@Param("brief_desc")String brief_desc, 
			@Param("expl_desc")String expl_desc, 
			@Param("final_session")String final_session,
			@Param("m_desc")String m_desc, 
			@Param("redirect_to_supplier_state")String redirect_to_supplier_state);

//	Customer
	@Query("SELECT l FROM Customer l WHERE id=:id")
	public List<Customer> getCustomerbyUid(@Param("id")Integer id);

	@Modifying
	@Query("UPDATE Customer u SET u.company_email=:company_email,u.company_name=:company_name WHERE u.id=:id")
	public void UpdateCustomerbyUid(@Param("id")Integer id,@Param("company_email") String company_email,@Param("company_name") String company_name);
}