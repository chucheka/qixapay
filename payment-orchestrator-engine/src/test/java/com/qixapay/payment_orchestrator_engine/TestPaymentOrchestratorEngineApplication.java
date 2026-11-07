package com.qixapay.payment_orchestrator_engine;

import org.springframework.boot.SpringApplication;

public class TestPaymentOrchestratorEngineApplication {

	public static void main(String[] args) {
		SpringApplication.from(PaymentOrchestratorEngineApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
