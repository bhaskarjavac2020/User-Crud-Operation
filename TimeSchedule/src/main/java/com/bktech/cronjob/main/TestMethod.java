package com.bktech.cronjob.main;

import org.springframework.scheduling.annotation.Scheduled;

public class TestMethod {
	@Scheduled(cron = "*/1 * * * ?", zone="IST")
	public void createBilldeskMDMFile() {
		System.out.println("Test file is created");
	}
}
