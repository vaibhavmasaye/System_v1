package com.system.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.api.model.YourDetails;


public interface YourDetailsRepository extends JpaRepository<YourDetails, Integer> {

}
