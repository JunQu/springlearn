package com.mall.me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
@SpringBootApplication
public class MeApplication {

	@GetMapping("/hello")
	public String hello() {
		return "hello every one.";
	}

	public static void main(String[] args) {
		SpringApplication.run(MeApplication.class, args);
	}

}
