package com.qixapay.core_banking_engine;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class CoreBankingEngineApplicationTests {

	@Test
	void contextLoads() {
	}

}
