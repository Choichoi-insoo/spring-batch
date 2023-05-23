package com.cis.src;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class testCode {
	
	@Test
	void name() 
	{
		assertEquals("42", "42");
	}
	
}
