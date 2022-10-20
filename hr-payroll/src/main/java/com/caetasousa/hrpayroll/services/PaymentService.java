package com.caetasousa.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.caetasousa.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	public Payment getPayment(long workedId, int days) {
		return new Payment("Edd", 200.0, days);
	}
}
