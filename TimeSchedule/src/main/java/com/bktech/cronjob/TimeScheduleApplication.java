package com.bktech.cronjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TimeScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeScheduleApplication.class, args);
	}

}
