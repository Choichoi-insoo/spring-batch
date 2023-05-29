package com.cis.src;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBatchApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBatchApplication.class); 

	public static void main(String[] args) {
		System.err.println("스테이지에서 메인 병합에 대한 이벤트11");
		SpringApplication.run(SpringBatchApplication.class, args);
	}

}
