package com.paf.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paf.rest.domain.paymentDTO;
import com.paf.rest.services.PaymentServices;

@RestController
@RequestMapping("/payments")
public class payment {
	
	@Autowired
	private PaymentServices paymentServices;
	
	
	@GetMapping("/all")
	public List<paymentDTO> allPayments() {
		return paymentServices.findAllPayemnts();
		
	}
	
	@PostMapping("/addPayment")
	public String addPaymentDetails(@RequestBody paymentDTO paymentData) {
	
		return paymentServices.savePayment(paymentData);
	}
	
	@PutMapping("/updatePayment")
	public String updatePaymentDetails(@RequestBody paymentDTO newPaymentData) {
		return paymentServices.updatePayment(newPaymentData);
	}
	
	@GetMapping("/find/{id}")
	public Optional<paymentDTO> getPaymentByID(@PathVariable Integer id) {
		return paymentServices.findPaymentById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void removePaymentById(@PathVariable Integer id) {
		paymentServices.deletePaymentById(id);
	}

}
