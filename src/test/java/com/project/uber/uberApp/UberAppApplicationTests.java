package com.project.uber.uberApp;

import com.project.uber.uberApp.services.EmailSenderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UberAppApplicationTests {

	@Autowired
	private EmailSenderService emailSenderService;

	@Test
	void contextLoads() {
		emailSenderService.sendEmail(
				"dakoy64262@avashost.com",
				"This is the Testing Email",
				"Body of my email");
	}

	@Test
	void sendEmailMultiple() {
		String emails[] = {
				"xijafe6055@apifan.com",
				"monusingh2602@gmail.com",
				"adsingn26@gmail.com"
		};
		emailSenderService.sendEmail(emails, "Hello from the UBER Application demo",
				"This is a good body, Keep coding!");
	}

}
