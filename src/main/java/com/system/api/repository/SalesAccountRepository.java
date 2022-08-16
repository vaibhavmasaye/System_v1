package com.system.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.api.model.SalesAccount;


public interface SalesAccountRepository extends JpaRepository<SalesAccount, Integer>{ 

}
