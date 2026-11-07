package com.qixapay.core_banking_engine;

import org.springframework.boot.SpringApplication;

public class TestCoreBankingEngineApplication {

	public static void main(String[] args) {
		SpringApplication.from(CoreBankingEngineApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
