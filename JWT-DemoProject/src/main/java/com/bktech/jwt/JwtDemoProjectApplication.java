package com.bktech.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JwtDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtDemoProjectApplication.class, args);
	}

}
