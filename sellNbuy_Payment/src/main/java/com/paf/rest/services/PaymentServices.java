package com.paf.rest.services;

import java.util.List;
import java.util.Optional;

import com.paf.rest.domain.paymentDTO;

public interface PaymentServices {

	List<paymentDTO> findAllPayemnts();

	String savePayment(paymentDTO paymentData);

	String updatePayment(paymentDTO newPaymentData);

	Optional<paymentDTO> findPaymentById(Integer id);

	void deletePaymentById(Integer id);
	
}
