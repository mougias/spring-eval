package com.stefanosdemetriou.tomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TomcatApplication {
	public static void main(String[] args) {
		SpringApplication.run(TomcatApplication.class, args);
	}

	@GetMapping("/")
	public void test() throws InterruptedException {
		Thread.sleep(100);
	}
}
