package com.paf.rest.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paf.rest.domain.paymentDTO;
import com.paf.rest.repositories.PaymentRepository;
import com.paf.rest.services.PaymentServices;

@Service
public class PaymentServicesImpl implements PaymentServices {

	@Autowired
	private PaymentRepository paymentRepository;
	
	@Override
	public List<paymentDTO> findAllPayemnts() {
		
		List<paymentDTO> allPayments = paymentRepository.findAll();
		return allPayments;
	}

	@Override
	public String savePayment(paymentDTO paymentData) {
		paymentRepository.save(paymentData);
		return "Data inserted/Stored successfully.";
	}

	@Override
	public String updatePayment(paymentDTO newPaymentData) {
		
		String message = null;
		
		if(newPaymentData.getId() != null) {
			paymentRepository.save(newPaymentData);
			message = "Data Updated successfully.";
		}
		else {
			message = "Error occured!";
		}
		
		return message;
	}

	@Override
	public Optional<paymentDTO> findPaymentById(Integer id) {
		
		return paymentRepository.findById(id);
		
	}

	@Override
	public void deletePaymentById(Integer id) {
		
		paymentRepository.deleteById(id);
		
	}
	
	

}
