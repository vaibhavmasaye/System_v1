package com.system.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.api.model.ClientCode;


public interface ClientRepository extends JpaRepository<ClientCode, Integer> {

}

