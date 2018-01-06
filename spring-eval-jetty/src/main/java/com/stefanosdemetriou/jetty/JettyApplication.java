package com.stefanosdemetriou.jetty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JettyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JettyApplication.class, args);
	}

	@GetMapping("/")
	public void test() throws InterruptedException {
		Thread.sleep(100);
	}
}
