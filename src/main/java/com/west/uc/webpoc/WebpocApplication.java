package com.west.uc.webpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.util.locale.LocaleUtils;

@SpringBootApplication
@RestController
public class WebpocApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebpocApplication.class, args);
	}

	@GetMapping("/")
	public String root() {
		String testString = "asd123";
		boolean isAlphaNum = LocaleUtils.isAlphaNumericString(testString);
		return "Hello world, " + testString + " is alphanum " + isAlphaNum;
	}
}
