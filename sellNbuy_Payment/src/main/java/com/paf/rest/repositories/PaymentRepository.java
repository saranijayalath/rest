package com.paf.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paf.rest.domain.paymentDTO;

public interface PaymentRepository extends JpaRepository<paymentDTO, Integer>{

	
	//Get all users
	//Find by id
	//Delete
	//Update
	//Custom query
	
}
