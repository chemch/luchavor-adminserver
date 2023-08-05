package com.luchavor.adminserver;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class AdminServerApplicationTests {
	
	@Test
    void shouldHaveCorrectClass() throws Exception {
		Class<?> appClass = AdminServerApplication.class.getClass();
		assertNotNull(appClass);
	}
}